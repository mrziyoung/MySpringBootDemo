package com.young.boot.bootdemo.entity;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author  john
 * @description 通过@component和@value注解，用该类来绑定application.properties配置文件中的自定义参数
 */
@Component
//@ConfigurationProperties(prefix = "com.young.blog")
public class BlogProperties {

    @Value("${com.young.blog.name}" )
    private String name;

    @Value("${com.young.blog.title}")
    private String title;

    //@Value("")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
