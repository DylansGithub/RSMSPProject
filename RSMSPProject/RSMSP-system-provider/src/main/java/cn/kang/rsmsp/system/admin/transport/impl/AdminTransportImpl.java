package cn.kang.rsmsp.system.admin.transport.impl;

import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import cn.kang.rsmsp.system.admin.service.AdminService;
import cn.kang.rsmsp.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户传输层接口实现类 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  14:36
 * @since 1.0.0
 */
//本质还是一个控制层类，因此添加注解
@RestController("adminTransportImpl")
//设置顶级请求路径
@RequestMapping("/system/admin/admin/trans")
public class AdminTransportImpl implements AdminTransport {
	@Autowired
	private AdminService adminService;
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	@PostMapping("/cellphone")
	public AdminVO getAdminByCellphone(String cellphone) throws Exception {

		return adminService.getAdminVoByCellphone(cellphone);
	}
}
