package cn.kang.rsmsp.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  16:08
 * @since 1.0.0
 */
public class BaseConstants {
	private static Properties props = new Properties();
	//创建日志对象
	private static Logger logger = LoggerFactory.getLogger(BaseConstants.class);
	static{
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage()+":"+new Date(),e);
		}
	}

	/**
	 * <b>加密密钥信息</b>
	 */
	public static final String SECRET_KEY = props.getProperty("secret.key");

	public static final Long  EXPIRE_AUTH_SEC = Long.parseLong(props.getProperty("expire.auth.sec"));
}
