package com.jaclon.springcloud.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 * @author jaclon
 * @date 2019/10/21
 */
@SpringBootApplication
public class ConfigClient_3355_StartSpringCloudApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
    }
}


