package com.cc.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private static int num;

    public HelloWorld() {
    }

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        //region Description
        ArrayList list1 = getList();


        /*ArrayList list1 = null;

        synchronized ()*/

        Date date = new Date();
//        method1();

        System.out.println(list1);

    }

    public static ArrayList getList() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        ArrayList list1 = new ArrayList();
        //endregion

        list1.add(0, 123);
        return list1;
    }

    public static void method1() {


        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
