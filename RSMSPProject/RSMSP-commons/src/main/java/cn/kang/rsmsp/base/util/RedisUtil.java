package cn.kang.rsmsp.base.util;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * <b>智慧医疗信息平台 - 基础信息功能 -  </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  17:27
 * @since 1.0.0
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;
	private  Logger logger = LoggerFactory.getLogger(RedisUtil.class);
	/**
	 * <b>根据所给定的key和value将信息存储到Redis中</b>
	 * @param key
	 * @param value
	 * @param expireSec
	 * @return
	 */
	public  boolean saveToRedis(String key,Object value,Long expireSec) {
		try {
			//将Object类型的Value变为String类型
			//创建JSONMapper对象
			JsonMapper jsonMapper = new JsonMapper();
			String  jsonString = jsonMapper.writeValueAsString(value);
			//存储到Redis中
			redisTemplate.opsForValue().set(key,jsonString);
			//设定存储时长
			redisTemplate.expire(key, expireSec,TimeUnit.SECONDS);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			logger.error(e.getMessage()+":"+new Date(),e);
		}
		return false;
	}

	/**
	 * <b>根据 key和所给定的数据类型，从Redis中获得对象 </b>
	 * @param key
	 * @param type
	 * @return
	 */
	public Object findFromRedis(String key,Class type){
		try {
			//通过Redis根据key获得String类型的value
			String jsonString = redisTemplate.opsForValue().get(key);
			//判断是否能够获得有效的结果
			if(StrUtil.isNotBlank(jsonString)){
				//根据所给定的类型将字符串JSON变为对应的对象
				JsonMapper jsonMapper = new JsonMapper();
				return  jsonMapper.readValue(jsonString, type);
			}
		}catch (Exception e ){
			e.printStackTrace();
			logger.error(e.getMessage()+":"+new Date(), e);
		}
		return null;
	}
}
