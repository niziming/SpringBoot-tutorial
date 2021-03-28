package cn.zm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class SpringBootController {
    @GetMapping
    public String say(){
        return "Hello,springBoot!";
    }
}
