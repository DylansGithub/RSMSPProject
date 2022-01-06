package cn.kang.rsmsp.system.admin.service;

import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户业务层接口</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  14:27
 * @since 1.0.0
 */
//增加注解Service，交给Spring进行管理
@Service("adminService")
//增加事务注解
@Transactional
public interface AdminService {

	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	AdminVO getAdminVoByCellphone(String cellphone) throws Exception;
}
