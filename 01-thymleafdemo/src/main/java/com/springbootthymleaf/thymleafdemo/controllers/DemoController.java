package com.springbootthymleaf.thymleafdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller public class DemoController {

//    create a mapping for "/hello"
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("theDate", new java.util.Date());
        // 'theDate' will be accessed from 'src/main/resources/templates/helloworld.html'

        return "helloworld";
//        with Thymeleaf dependency in POM file, SpringBoot will auto-configure to use Thymeleaf
//        and look at src/main/resources/templates/helloworld.html
    }
}
