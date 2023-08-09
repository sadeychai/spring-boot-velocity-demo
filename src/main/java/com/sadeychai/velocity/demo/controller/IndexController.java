package com.sadeychai.velocity.demo.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页控制器
 *
 * @author sadeychai
 * @date 2023/03/17
 **/
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @param modelMap
     * @return
     */
    @GetMapping(value = {"/index", "/", ""})
    public String index(ModelMap modelMap) {
        //登录信息
        modelMap.addAttribute("message", "velocity templates");
        modelMap.addAttribute("name", "sadeychai");
        modelMap.addAttribute("age", 37);
        return "index";
    }
}
