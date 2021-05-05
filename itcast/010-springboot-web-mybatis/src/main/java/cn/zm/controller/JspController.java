package cn.zm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("jsp")
public class JspController {
    @RequestMapping
    public String jsp(Model model) {
        model.addAttribute("data", "SpringBoot 前端使用 JSP 页面！");
        return "index";
    }
}
