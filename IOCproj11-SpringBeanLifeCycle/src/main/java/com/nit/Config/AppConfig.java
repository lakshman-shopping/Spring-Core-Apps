package com.nit.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
@PropertySource("com/nit/commons/Info.properties")
public class AppConfig {

}
