package com.waiqin365.firstdemo.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/20 14:06
 */
public class EncryptionUtils {
    public static String shaEncrypt(String inputData) {
        MessageDigest messageDigest = null;
        BigInteger encodedData = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(inputData.getBytes());
        encodedData = new BigInteger(messageDigest.digest());
        return encodedData.toString(32);
    }

    public static String base64Encode(String inputData) {
        return new sun.misc.BASE64Encoder().encode(inputData.getBytes());
    }

    public static void main(String[] args) {
        System.out.println(shaEncrypt("123456"));
    }
}
