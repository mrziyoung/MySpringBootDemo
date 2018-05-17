package com.young.boot.bootdemo.helloworld;


import com.young.boot.bootdemo.entity.BlogProperties;
import com.young.boot.bootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldController {
    //绑定配置文件里的自定义字符串
    @Autowired
    BlogProperties blogProperties;

    @RequestMapping("/blog")
    public String getBlog(){
        return "Hello," + blogProperties.getName() + " is writing " +
                blogProperties.getTitle() + " ! ";
    }

    //返回一个实体类
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setName("小明");
        user.setWord("xiaoming");
        return user;
    }
    //从前端获取一个参数，并返回String字符串
    @RequestMapping("/hello")
    public String hello(String name){
        return "hello," + name ;
    }


}


