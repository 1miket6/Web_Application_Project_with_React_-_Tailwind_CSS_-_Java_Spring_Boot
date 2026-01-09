package com.mike.stickers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
//(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.mike.stickers"}) optional in this case since inside the same package
public class StickersApplication {

	public static void main(String[] args) {
		SpringApplication.run(StickersApplication.class, args);
	}

}
