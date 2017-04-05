package com.xinqing.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */

@SpringBootApplication
@EnableScheduling
public class MainSpringApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainSpringApplication.class, args);
	}

}
