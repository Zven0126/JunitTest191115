package com.example.maven.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/11/26 0026 15:09
 */
@RestController
public class TestController {

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }
}
