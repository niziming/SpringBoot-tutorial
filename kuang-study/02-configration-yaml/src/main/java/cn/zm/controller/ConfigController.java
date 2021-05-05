package cn.zm.controller;

import cn.zm.entity.Dog;
import cn.zm.entity.Person;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("config")
@Api(tags = "配置测试")
@Slf4j
public class ConfigController {
    @Resource
    Dog dog;
    @Resource
    Person person;

    @GetMapping
    public Dog getDog () {
        return dog;
    }
    @GetMapping("person")
    public Person getPerson () {
        log.info("getPerson被调用");
        return person;
    }
}
