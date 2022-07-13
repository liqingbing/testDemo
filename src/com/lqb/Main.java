package com.lqb;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Generation<T>{
    int age;
    String name;
    T data;

//    public static <E> void find(T da){
//
//    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello world!");
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeee");
        System.out.println(list);

//        for (String o:
//             list) {
//            System.out.println(o);
//        }
        StringBuffer str = new StringBuffer();
        str.append(5);
        str.append('s');
        str.append("hello");
        System.out.println(str);
    }

}
