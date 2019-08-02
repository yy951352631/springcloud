package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心
 *
 * @author wang_
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
