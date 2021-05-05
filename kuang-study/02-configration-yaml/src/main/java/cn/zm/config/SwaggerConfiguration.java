package cn.zm.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfiguration {

    @Bean
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)      // 选择swagger2版本
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())         //定义api文档汇总信息
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("cn.zm.controller"))  // 指定生成api文档的包
                .paths(PathSelectors.any())     // 指定所有路径
                .build()
                ;
    }

    /**
     * 构建文档api信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot-tutorial")     // 文档标题
                .contact(new Contact("name", "url", "mail"))   //联系人信息
                .description("描述")      //描述
                .version("0.1")     //文档版本号
                .termsOfServiceUrl("http://localhost:8081")     //网站地址
                .build();
    }
}
