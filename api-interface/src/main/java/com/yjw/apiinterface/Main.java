package com.yjw.apiinterface;

import com.yjw.apiinterface.client.ApiClient;
import com.yjw.apiinterface.model.User;

public class Main {
    public static void main(String[] args) {
        String accessKey = "yupi";
        String secretKey = "abcdefgh";
        ApiClient apiClient = new ApiClient(accessKey,secretKey);
        String result1 = apiClient.getNameByGet("鱼皮");
        String result2 = apiClient.getNameByPost("鱼皮");
        User user = new User();
        user.setUsername("李鱼皮");
        String result3 = apiClient.getUsernameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
