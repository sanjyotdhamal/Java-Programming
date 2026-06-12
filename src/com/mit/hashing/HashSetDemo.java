package com.mit.hashing;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Object> hashSetObj = new HashSet<>();

        hashSetObj.add(10);
        hashSetObj.add(30);
        hashSetObj.add(40);
        hashSetObj.add(70);
        hashSetObj.add("test");

        System.out.println(hashSetObj);
    }
}
