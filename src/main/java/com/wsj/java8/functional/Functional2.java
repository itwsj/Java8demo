package com.wsj.java8.functional;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Supplier;

/**
 * @ClassName Functional2
 * @Description: Lambda的延迟执行
 * @Author wsj
 * @Date 2020/10/24
 **/

public class Functional2 {


    public void commen(int a , String b){
        if(a==1){
            System.out.println(b);
        }
    }

    @Test
    public void Test1(){
        String  b = "bbb";
        String  b2 = "ccc";
        String  b3 = "ddd";
        commen(1,b+b2+b3);
    }

    public static void setMyFunctionalInterface(int a,MyFunctionalInterface2 myFunctionalInterface){
        if(a == 1){
            System.out.println(myFunctionalInterface.method());
        }
    }

    @Test
    public void Test2(){
        String  b = "bbb";
        String  b2 = "ccc";
        String  b3 = "ddd";

        setMyFunctionalInterface(2,()->{
            System.out.println("走了哈哈哈哈哈哈");
            return b+b2+b3;
        });
    }


    public static void startThread(Runnable task) {
        new Thread(task).start();
    }

    @Test
    public void Test3(){
        startThread(()-> System.out.println("开启了线程。。。"));
    }

    public static String getString(Supplier<String> function) {
        return function.get();
    }

    @Test
    public void Test4(){
        String msgA = "A的数据";
        String msgB = "B的数据";
        System.out.println(getString(()-> msgA+msgB));
    }
    public static int getMax(Supplier<Integer> function) {
        return function.get();
    }

    @Test
    public void Test5(){
        int arr[] = {2,3,4,52,333,23};
        //调用getMax方法,参数传递Lambda
        int maxNum = getMax(()->{
            //计算数组的最大值
            int max = arr[0];
            for(int i : arr){
                if(i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }
}
