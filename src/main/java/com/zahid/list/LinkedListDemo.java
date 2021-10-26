package com.zahid.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        nameList.add("Alex");
        nameList.add("Lee");
        nameList.add("Cooper");
        nameList.add("David");
        nameList.add("John");

        System.out.println(nameList.size());
        System.out.println(nameList.isEmpty());
        System.out.println(nameList);

        for(String name: nameList) {
            System.out.println(name);
        }
    }
}
