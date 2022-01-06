package cn.kang.rsmsp.system.admin.service.impl;

import cn.kang.rsmsp.system.admin.dao.AdminDao;
import cn.kang.rsmsp.system.admin.pojo.entity.Admin;
import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import cn.kang.rsmsp.system.admin.service.AdminService;
import cn.kang.rsmsp.util.PojoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户业务层接口实现类</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  14:28
 * @since 1.0.0
 */
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	public AdminVO getAdminVoByCellphone(String cellphone) throws Exception {
		//创建Mybatis查询对象
		QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>();
		// 将cellphone放在cellphone字段上作为查询条件
		queryWrapper.eq("cellphone", cellphone);
		//进行查询
		Admin  admin = adminDao.selectOne(queryWrapper);
		//判断查询结果
		if(admin != null){
			//将实体转换为视图对象，进行返回
			return PojoMapper.INSTANCE.entityParseToVO(admin);
		}
		return null;
	}
}
