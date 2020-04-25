package com.bw.zy422.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.bw.zy422.model.TUser;
import com.bw.zy422.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 张磊
 * 2020年4月22日21:48:01
 */
@Controller
public class TUserController {
    @Autowired
    TUserService service;

    /**
     * 进入登录页面
     * @return
     */
    @RequestMapping("/")
    public String tologin(){
        return "login";
    }

    /**
     * 登录
     * 去后台进行效验
     * @param tUser
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("login")
    public String login(TUser tUser,Model model, HttpServletRequest request){
        TUser tu = service.login(tUser);
        if(tu!=null){
            request.getSession().setAttribute("tu",tu);
            return "redirect:/list";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }

    /**
     * 去注册页面
     * @return
     */
    @RequestMapping("toadd")
    public String toadd(){
        return "registered";
    }

    /**
     * 去后台进行注册
     * @param tUser
     * @return
     */
    @RequestMapping("add")
    public String add(TUser tUser){
        int i = service.add(tUser);
        return "login";
    }

    /**
     * 对手机号进行效验
     * 若返回为0，则表示能够使用
     * @param phone
     * @return
     */
    @ResponseBody
    @RequestMapping("verify")
    public int verify(String phone){
        List<TUser> list = service.verify(phone);
        return list.size();
    }

    @RequestMapping("Logout")
    public String Logout(HttpServletRequest request){
        request.getSession().removeAttribute("tu");
        return "redirect:/list";
    }
}
