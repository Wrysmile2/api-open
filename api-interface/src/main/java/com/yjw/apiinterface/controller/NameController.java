package com.yjw.apiinterface.controller;

import com.yjw.apiinterface.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称API
 */
@RestController()
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name) {
        return "GET 你的名字是：" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String secretKey = request.getHeader("secretKey");
        if(!accessKey.equals("yupi") || !secretKey.equals("abcdefg")){
            throw new RuntimeException("无权限");
        }
        return "POST 用户名字是：" + user.getUsername();
    }


}
