package com.spring_boot_dolls_ticket.project;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 프로젝트 외부 경로 이미지 맵핑 설정
		registry.addResourceHandler("/image/**")
				.addResourceLocations("classpath:/static/image/");
	}
	
}
