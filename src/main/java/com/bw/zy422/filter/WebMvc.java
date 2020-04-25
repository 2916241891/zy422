package com.bw.zy422.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMvc extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> list =  new ArrayList<>();
        list.add("/"); //默认回登录
        list.add("/login"); //登录的验证
        list.add("/toadd"); //注册
        list.add("/add"); //去注册页面
        list.add("/verify");//对手机号进行效验

        list.add("/static/css/**");
        list.add("/static/js/**");
        list.add("/static/img/**");
        list.add("/static/bootstrap-datetimepicker/**");
        list.add("/static/kindeditor/**");
        registry.addInterceptor(new Inter()).addPathPatterns("/**").excludePathPatterns(list);

    }



    @Value("${file.upload.relative}")
    public String relative;
    @Value("${file.upload.path}")
    public String path;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler(relative).addResourceLocations("file:/"+path);
    }
}
