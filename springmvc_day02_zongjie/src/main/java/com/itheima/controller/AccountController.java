package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * 返回值是String类型
     * @param model
     * @return
     */
    @RequestMapping("/toString")
    public String toString(Model model){

        User user = new User();
        System.out.println(user);
        user.setUsername("老铁");
        user.setAge(18);

        model.addAttribute("user",user);


        return "success";
    }

    @RequestMapping("/toModelAndView")
    public ModelAndView toModelAndView(User user){
        System.out.println(user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("username","郭靖");
        mv.addObject("age",13);

        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/yibu")
    @ResponseBody
    public User toyibu(@RequestBody User user){
        System.out.println(user);
        user.setUsername("杜甫");
        user.setAge(18);

        return user;
    }

}
