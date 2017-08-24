package ru.piano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ru.piano.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

  @Bean
  public InternalResourceViewResolver setupViewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/pages/");
    resolver.setSuffix(".jsp");
    resolver.setViewClass(JstlView.class);

    return resolver;
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/WEB-INF/pages/**")
        .addResourceLocations("/pages/");
    registry.addResourceHandler("/resources/**").
        addResourceLocations("/WEB-INF/resources/");
  }

}