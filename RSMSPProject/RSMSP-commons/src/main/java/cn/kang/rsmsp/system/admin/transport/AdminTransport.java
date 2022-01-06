package cn.kang.rsmsp.system.admin.transport;

import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户传输层接口 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  14:33
 * @since 1.0.0
 */
@FeignClient(name = "RSMSP-system-provider")
public interface AdminTransport {

	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/admin/trans/cellphone")
	AdminVO getAdminByCellphone(String cellphone) throws  Exception;
}
