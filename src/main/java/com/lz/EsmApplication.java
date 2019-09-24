package com.lz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: esm
 * @description:
 * @author: yuefu Li
 * @create: 2019-09-24
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lz.**.mapper")
public class EsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(EsmApplication.class,args);
    }

}
