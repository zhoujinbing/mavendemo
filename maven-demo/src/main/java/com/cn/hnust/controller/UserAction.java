package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping(value="/user")
public class UserAction
{
    @Resource
    private IUserService service;
    
    @RequestMapping(value="/showUser.do")
    public ModelAndView Page(HttpServletRequest request, HttpServletResponse response,Integer userId) throws Exception {
        ModelAndView mv = new ModelAndView("/ShowUser");//默认为forward模式   
        User user = service.getUserById( userId  );
        System.out.println(user.getUserName());
        mv.addObject( "user", user );
        System.out.println("aa");
        return mv;
    }  
}
