package cn.zm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpringBootController {
    @Value("${website}")
    private String website;
    @Value("${school.name}")
    private String name;

    @GetMapping
    public String say(){
        return "Hello,springBoot!";
    }

    @GetMapping("/config")
    public String config(){
        return website + " - " + name;
    }
}
