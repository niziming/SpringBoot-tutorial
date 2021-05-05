package cn.zm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"cn.zm.mapper"}) //在运行的主类上添加注解包扫描
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement // 可选，但是业务方法上必须添加@Transactional 事务才生效
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
