package com.example.boot.configuration;

import com.example.boot.filter.InternalFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<InternalFilter> regist(){
        FilterRegistrationBean<InternalFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new InternalFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
