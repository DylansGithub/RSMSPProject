package cn.kang.rsmsp.base.exception;

import cn.kang.rsmsp.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 系统统一异常处理类 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/3  16:33
 * @since 1.0.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	//1.创建日志对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * <b>处理全局异常信息</b>
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseVO globaleExceptionHandler(Exception exception){
		//1.将异常信息记录到日志中
		logger.error(exception.getMessage() + ":" + new Date() ,exception);
		//2.将错误日志信息返回到前端异常响应视图中
		return ResponseVO.exeception(exception);

	}
}