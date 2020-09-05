package com.wojiushiwo.es;

import com.wojiushiwo.es.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EsSpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsSpringbootDemoApplication.class, args);
    }

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String say(){
        return userMapper.selectById(1L).toString();
    }

}
