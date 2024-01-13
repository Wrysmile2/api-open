package com.yjw.apiinterface.controller;

import com.yjw.apiclientsdk.model.User;
import com.yjw.apiinterface.utils.SignUtils;
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
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

        if(!accessKey.equals("yupi")){
            throw new RuntimeException("无权限");
        }
        if (Long.parseLong(nonce) > 10000){
            throw new RuntimeException("无权限");
        }
        // todo 时间和当前时间不能超过5分钟
//        if (timestamp >){
//
//        }
        // todo 实际情况中是从数据库中查出secretKey
        String serversign = SignUtils.getSign(body, "abcdefgh");
        if (!sign.equals(serversign)){
            throw new RuntimeException("无权限");
        }
        String result =  "POST 用户名字是：" + user.getUsername();
        //调用成功后
        return result;
    }


}
