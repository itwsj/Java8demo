package com.wsj.java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName lambda
 * @Description: lambda表达式使用
 * @Author wsj
 * @Date 2020/10/24
 **/
public class lambda {

    @Test
    public void test1(){
        //map 集合使用
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");

        System.out.println("map普通方式遍历:");
        for (String key : map.keySet()) {
            System.out.println("k=" + key + "，v=" + map.get(key));
        }

        System.out.println("lambda表达式使用遍历:");
        map.forEach((k, v) -> {
            System.out.println("k=" + k + "，v=" + v);
        });
    }
    @Test
    public void test2(){
        //list遍历
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("dddd");
        System.out.println("list..lambda表达式使用遍历:");
        list.forEach(v -> {
            System.out.println(v);
        });
        System.out.println("list双冒号运算符遍历:");//双冒号后续会细讲
        list.forEach(System.out::println);
    }
    @Test
    public void test3(){
        //使用普通的方式创建
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("普通方式创建!");
            }
        };

        //使用拉姆达方式创建
        Runnable r2 = ()-> System.out.println("lambda表达式创建!");
    }
}
