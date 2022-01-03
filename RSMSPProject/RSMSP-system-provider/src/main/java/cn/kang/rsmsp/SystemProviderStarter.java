package cn.kang.rsmsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>智慧医疗信息平台 - Provider启动类 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/1/3  22:10
 * @since 1.0.0
 */
//设置注解扫描基础包位置
@MapperScan("cn.kang.rsmsp.*.dao")
//连接注册中心
@EnableEurekaClient
@SpringBootApplication
public class SystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemProviderStarter.class, args);
	}
}
