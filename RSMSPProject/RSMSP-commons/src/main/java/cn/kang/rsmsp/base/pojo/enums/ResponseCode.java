package cn.kang.rsmsp.base.pojo.enums;

/**
 * <b>智慧医疗信息平台 - 响应编码枚举信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/12/30  22:34
 * @since 1.0.0
 */
public enum ResponseCode {
	RESPONSE_SUCCESS("20000","系统处理成功"),
	RESPONSE_UNAUTH("30000","系统用户未进行认证"),
	RESPONSE_ERROR("40000","系统业务处理错误"),
	RESPONSE_EXECEPTION("50000","系统响应异常");
	private String code;                    //响应编码
	private String  remark;                 //状态说明

	private ResponseCode(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
