package cn.zm.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component // 注册bean到容器汇总
public class Dog {
    @Value("lulu")
    private String name;
    @Value("2")
    private Integer age;
}
