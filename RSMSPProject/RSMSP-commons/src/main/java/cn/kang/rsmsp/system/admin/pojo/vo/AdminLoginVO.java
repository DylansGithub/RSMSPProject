package cn.kang.rsmsp.system.admin.pojo.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 用户登录视图信息 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  14:45
 * @since 1.0.0
 */
public class AdminLoginVO implements Serializable {
	private static final long serialVersionUID = 14795482966335532L;
	@NotBlank(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}",message = "手机号码格式错误")
	private String cellphone;                           //登录手机号码
	@NotBlank(message = "未填写密码")
	@Pattern(regexp = "[A-Za-z0-9_@#]{6,}",message = "登录密码格式错误")
	private String password;                            //登录密码
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
