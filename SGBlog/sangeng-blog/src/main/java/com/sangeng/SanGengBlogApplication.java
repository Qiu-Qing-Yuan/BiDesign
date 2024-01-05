package com.sangeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author QiuQingyuan
 * @version 1.0
 * @Description: TODO
 * @date 2024-01-03  16:11
 */
@SpringBootApplication
@MapperScan("com.sangeng.mapper")
public class SanGengBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SanGengBlogApplication.class,args);
    }

}
