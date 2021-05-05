package cn.zm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"cn/zm/mapper"}) //在运行的主类上添加注解包扫描
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
