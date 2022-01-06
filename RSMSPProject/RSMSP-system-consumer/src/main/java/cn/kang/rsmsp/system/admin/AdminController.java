package cn.kang.rsmsp.system.admin;

import cn.hutool.crypto.digest.MD5;
import cn.kang.rsmsp.base.controller.BaseController;
import cn.kang.rsmsp.base.pojo.enums.Status;
import cn.kang.rsmsp.base.pojo.vo.ResponseVO;
import cn.kang.rsmsp.base.util.BaseConstants;
import cn.kang.rsmsp.base.util.RedisUtil;
import cn.kang.rsmsp.base.util.TokenUtil;
import cn.kang.rsmsp.system.admin.pojo.vo.AdminLoginVO;
import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import cn.kang.rsmsp.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户控制层类 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  14:41
 * @since 1.0.0
 */
@RestController("AdminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private RedisUtil redisUtil;
	/**
	 * <b>用户使用登录视图进行登录操作</b>
	 * @param adminLoginVO
	 * @return
	 * @throws Exception
	 */
	//这里需要采用正则对登录方式进行校验
	//我们有两种方式：1.自己写正则工具类，2.使用Spring Boot的Validation工具
	public ResponseVO loginAdmin(@RequestBody @Validated AdminLoginVO adminLoginVO, BindingResult bindingResult) throws Exception{
		//判断错误信息对象BindResult 中是否包含有错误信息
		if(bindingResult.hasErrors()){
			return ResponseVO.error("请填写正确的手机号码和登录密码");
		}
		//根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminByCellphone(adminLoginVO.getCellphone());
		//判断所得到的用户信息
		if(adminVO == null){
			return ResponseVO.error("该用户不存在");
		}
		//判断用户是否处于启用状态
		if(Status.STATUS_DISABLE.getCode().equals(adminVO.getStatus())){
			return ResponseVO.error("该用户禁止登录系统");
		}
		//对用户进行MD5加密，并判断密码是否相同
		String password = MD5.create().digestHex(adminLoginVO.getPassword());
		if(adminVO.getPassword().equals(password)){
			return ResponseVO.error("手机号码或登陆密码错误");
		}
		//至此用户登录成功，使用工具类生成系统唯一令牌
		Map<String,String> claimMap  = new HashMap<String,String>();
		claimMap.put("id" , adminVO.getId());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		//以该Token作为key，以用户对象adminVo作为Value存储到Redis中
		if(redisUtil.saveToRedis(token,adminVO,BaseConstants.EXPIRE_AUTH_SEC)){
			//此时将信息存储到Redis中,将Token返回给用户
			//为了将Token交给用户存储，那么我们可以选择将Token绑定到Http响应对象的消息头的部分 Authorization
			response.setHeader("Authorization", token);
			//返回前端登录成功的结果
			return ResponseVO.success("系统用户登录成功",adminVO);
		}
		return ResponseVO.error("系统登录失败");
	}
}
