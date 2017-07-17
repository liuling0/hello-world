package com.fi;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class Ch72Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch72Application.class, args);
	}
	
/*	@Component
	public static class CustomerServletContainer implements
		EmbeddedServletContainerCustomizer{
		
		@Override
		public void customize(ConfigurableEmbeddedServletContainer container){
			container.setPort(8888);
			container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
			container.setSessionTimeout(10, TimeUnit.MINUTES);
		}
	}*/
}
