package com.yao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//设置开启定时任务
@EnableScheduling
public class CrawlerJdItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerJdItemApplication.class, args);
    }

}
