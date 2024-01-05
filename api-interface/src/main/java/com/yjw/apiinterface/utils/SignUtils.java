package com.yjw.apiinterface.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

import java.util.Map;

/**
 * 签名工具
 */
public class SignUtils {
    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String testStr = body.toString() + "." + secretKey;
        String content = md5.digestHex(testStr);

        return md5.digestHex(content);
    }
}
