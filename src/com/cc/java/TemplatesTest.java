package com.cc.java;

import com.cc.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {

    private static final Customer CUST = new Customer();
    /**
    * 测试自定义模版
    */
    private int id = 2;
    /**
     * 测试模版2
     */
    private String name = "niaho";
    /**
     * 1
     */
    private int d = 1;


    

    public static void main(String[] args) {

        System.out.println("你好");

        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 1;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

       String[] arr = new String[]{"4","3","2","1"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }


        if ( list == null) {
            System.out.println("it is null");
        }else {
            System.out.println("full");
        }

    }


    public void method(){
        System.out.println("TemplatesTest.method");


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);

        if ( list == null) {
            System.out.println("it is null");
        }else {
            System.out.println("full");
        }
    }


}
