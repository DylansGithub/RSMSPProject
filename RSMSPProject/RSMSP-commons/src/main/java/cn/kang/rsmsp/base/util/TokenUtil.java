package cn.kang.rsmsp.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>智慧医疗信息平台 - 基础信息功能 - Token工具类 </b>
 * <p>
 *  为了能够实现Token机制，借助于JWT（JSON Web Token）实现
 * </p>
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  15:48
 * @since 1.0.0
 */
public class TokenUtil {
	//1.设定系统加密算法
	private static Algorithm algorithm = Algorithm.HMAC256(BaseConstants.SECRET_KEY);

	/**
	 * <b>根据用户所给定的信息生成Token</b>
	 * @param claimMap
	 * @param expirySec
	 * @return
	 */
	public static String createToken(Map<String, String> claimMap, Long expirySec) {
		//创建JWT Token生成器
		JWTCreator.Builder builder = JWT.create();
		//创建Map集合用于设定生成Token 的头部信息
		Map<String, String> headerMap = new HashMap<String, String>();
		//1.设定第一组参数，Token是通过JWT来生成的
		headerMap.put("typ", "jwt");
		//2.设定第二组参数，设定Token整体的加密算法
		headerMap.put("alg", "HS256");
		//设定Token的有效载荷
//		builder.withClaim("message", claimMap);
		//取出所给定的Map集合中的每一个key-value组合，逐一的添加到有效载荷中
		//循环Map集合
//		Set<String> keySet = claimMap.keySet();
//		for (String key : keySet) {
//			Object value = claimMap.get(key);
//			builder.withClaim(key,String.valueOf(value));
//		}
		//使用JDK8的foreach()可以快速实现对于Map集合的循环
		claimMap.forEach((k,v)->{
			builder.withClaim(k, String.valueOf(v));
		});
		//设置Token的有效期，需要获得Token到期的时间
		builder.withExpiresAt(new Date(System.currentTimeMillis()+expirySec * 1000));
		//进行签名
		return builder.sign(algorithm);
	}

	/**
	 * <b>校验 Token 信息，获得该 Token 中的有效载荷数据</b>
	 * @param token
	 * @return
	 */
	public static Map<String, String> verifyToken(String token) {
		// 校验此时所给定的 Token 是符合相关形式的
		if (token != null && !"".equals(token.trim())) {
			// 此时 Token 格式有效
			// 获得 Token 校验对象 JWTVerifier
			JWTVerifier verifier = JWT.require(algorithm).build();
			// 对于该 Token 进行校验
			DecodedJWT decodedJWT = verifier.verify(token);
			// 如果能够获得 DecodedJWT 则说明通过秘钥能够将加密 Token 进行解密
			// 提取绑定在 Token 中的有效载荷信息
			Map<String, String> resultMap = new HashMap<String, String>();
			Map<String, Claim> claimMap = decodedJWT.getClaims();
			claimMap.forEach((key,value)->{
				resultMap.put(key, value.asString());
			});
			return resultMap;
		}
		return null;
	}
}
