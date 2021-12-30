package cn.kang.rsmsp.base.pojo.vo;

import cn.kang.rsmsp.base.pojo.enums.ResponseCode;

import java.io.Serializable;

/**
 * <b>智慧医疗信息平台 - 系统响应视图信息 </b>
 * <p>
 *     系统响应视图信息设置了如下属性：
 *     1.code:系统响应编码<br/>
 *     2.message:系统响应结果<br/>
 *     3.data:系统响应数据<br/>
 *     本项目所有功能返回前端数据<b>都必须以本系统响应视图信息返回</b>
 * </p>
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/12/30  22:38
 * @since 1.0.0
 */
public class ResponseVO implements Serializable {
	private static final long serialVersionUID = 687372173125128882L;
	private String code;                        //系统响应编码
	private String message;                     //系统响应信息
	private Object data;                        //系统响应数据

	public ResponseVO(ResponseCode responseCode, String message, Object data) {
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * <b>获得系统业务处理完毕，响应成功视图信息</b>
	 * @param message
	 * @return
	 */
	//为了快速使用到响应信息对象，需要提供方法
	public  static  ResponseVO success(String message){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,"");
	}

	/**
	 * <b>获得系统业务处理完毕，响应成功视图信息</b>
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO success(String message,Object data){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,data);
	}

	/**
	 * <b>获得系统用户未进行认证响应视图信息</b>
	 * @return
	 */
	public static ResponseVO unAuth(){
		return new ResponseVO(ResponseCode.RESPONSE_UNAUTH,ResponseCode.RESPONSE_UNAUTH.getRemark(), "");
	}

	/**
	 * <b>获得系统用户响应错误视图信息</b>
	 * @param errorMes
	 * @return
	 */
	public static ResponseVO error(String errorMes){
		return new ResponseVO(ResponseCode.RESPONSE_ERROR,errorMes,"");
	}

	/**
	 * <b>获得系统用户响应异常视图信息</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO exeception(Exception e){
		return new ResponseVO(ResponseCode.RESPONSE_EXECEPTION,e.getMessage(),"");
	}
}
