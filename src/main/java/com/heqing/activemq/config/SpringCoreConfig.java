package com.heqing.activemq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author heqing
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.heqing.*")
public class SpringCoreConfig {

}
