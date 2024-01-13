package com.wwcr.springbootinit;

import org.springframework.util.DigestUtils;

public class password {
    public static void main(String[] args) {
        String password = "12345678";
        String SALT = "yupi";
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());
        System.out.println(encryptPassword);
    }
}
