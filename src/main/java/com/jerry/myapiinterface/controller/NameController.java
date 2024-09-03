package com.jerry.myapiinterface.controller;

import com.jerry.myapiclientsdk.model.User;
import com.jerry.myapiclientsdk.util.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/")
    public String getNameByGet(String name) {
        return "GET你的名字是：" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name) {
        return "POST你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
//        // todo 这些操作已经移入到 gateway 中
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
////        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        // todo 实际要从数据库中查出对应的accessKey、secretKey
//        if (!accessKey.equals("ikun520")) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//        // todo 时间和当前时间不能超过 5 分钟
////        if (timestamp) {
////
////        }
//        if (!sign.equals(SignUtils.genSign(body, "123456"))) {
//            throw new RuntimeException("无权限");
//        }
        return "POST用户名：" + user.getUsername();
    }
}
