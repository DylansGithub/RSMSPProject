package cn.kang.rsmsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台 - 系统功能模块 - Consumer 启动类 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/3  21:38
 * @since 1.0.0
 */
//在spring cloud中，只使用clients(Consumer)
@EnableFeignClients
//在SpringCloud中，除了注册中心外都是客户端
@EnableEurekaClient
//Spring Cloud必须建立在Spring Boot的基础上
@SpringBootApplication
public class SystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemConsumerStarter.class,args);
	}
}
