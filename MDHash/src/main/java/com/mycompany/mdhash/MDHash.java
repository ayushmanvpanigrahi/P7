package com.mycompany.mdhash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MDHash {

    public static void main(String[] args) {
        System.out.println("MD Algorithm");
        System.out.println("For null " + md5(""));
        System.out.println("For Simple text" + md5("This is my text"));
        System.out.println("For Simple numbers" + md5("12345"));
    }

    public static String md5(String input) {
        String md5 = null;
        if (null == input) {
            return null;
        }
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(), 0, input.length());
            md5 = new BigInteger(1, digest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5;
    }
}

