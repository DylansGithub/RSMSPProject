package cn.kang.rsmsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧医疗信息平台 - Eureka 注册中心启动类</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/12/30  20:53
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class RSMSPRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(RSMSPRegistryStarter.class, args);
	}
}
