package cn.huwhy.zhaojun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.huwhy.zhaojun.biz.UserBiz;
import cn.huwhy.zhaojun.model.User;

@Controller
public class UserController {

    @Autowired
    private UserBiz userBiz;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        User user = userBiz.getByName("huwhy");
        modelMap.addAttribute("user", user);
        return "index";
    }
}
