package com.mmall.concurrency.example.singleton;

import java.util.HashMap;

public class Test {

    public static String firstAppear(String str) {
        String[] split = str.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String target = split[i];
            if (map.containsKey(target)) {
                if (map.get(target) == 2) {
                    return target;
                } else {
                    map.put(target, map.get(target) + 1);
                }
            } else {
                map.put(target, 1);
            }
        }

        return "";

    }

    public static void main(String[] args) {
        System.out.println(firstAppear("ddf2efeefls"));
    }
}
