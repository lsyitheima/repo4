package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello")
    public String helloController(){
        System.out.println("你好，Controller");
        return "success";
    }

    /**
     * 请求参数的绑定，基本数据类型，就是获取请求参数
     * @param id
     * @param username
     * @return
     */
    @RequestMapping("/findOne")
    public String findOne(Integer id,String username){
        System.out.println("账户信息"+id+username);
        return "success";
    }

    /**
     * 请求参数绑定，javabean类型
     * @param
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(User user, Model model){
        System.out.println(user);
        user.setUsername("杜甫");
        user.setAge(30);
        model.addAttribute("user",user);

        return "success";
    }

    @RequestMapping("/toList")
    public String toList(Account account){

        System.out.println(account);

        return "success";
    }



}
