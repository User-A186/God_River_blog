package com.hks;

import com.hks.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MyblogApplication {
//    @Autowired
//    private BlogService blogService;

    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        blogService.init();
//    }
}
