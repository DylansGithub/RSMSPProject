package cn.kang.rsmsp.base.configuration;

import cn.kang.rsmsp.base.util.BaseConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.logging.Handler;

/**
 * <b>智慧医疗信息平台 - Swagger API 文档框架配置文件</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/12/30  21:42
 * @since 1.0.0
 */
@Configuration
public class SwaggerConfiguration {
	/**
	 * <b>创建Swagger核心对象</b>
	 * @return
	 */
	@Bean
	public Docket createRestAPI(){
		DocumentationType documentationType;
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				//使用Swagger扫描所有方法级别的注解。加入到文档中
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any())
				.build();
		return docket;
	}
	/**
	 * <b>生成文档接口信息</b>
	 * @return
	 */
	private ApiInfo apiInfo(){
		ApiInfo apiInfo = new ApiInfoBuilder()
				//文档标题
				.title(BaseConstants.SWAGGER_TITLE)
				//文档描述
				.description(BaseConstants.SWAGGER_DESCRIPTION)
				//文档版本号
				.version(BaseConstants.SWAGGER_VERSION)
				//文档联系人
				.contact(new Contact(BaseConstants.SWAGGER_CONTACT_NAME
						,BaseConstants.SWAGGER_CONTACT_URL
						,BaseConstants.SWAGGER_CONTACT_EMAIL))
				.build();
		return apiInfo;
	}
}
