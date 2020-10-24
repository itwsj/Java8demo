package com.wsj.java8.functional;

/**
 * @ClassName Functional
 * @Description: 函数试接口
 * @Author wsj
 * @Date 2020/10/24
 **/
public class Functional {

    // 使用自定义的函数式接口作为方法参数
    private static void doSomething(MyFunctionalInterface inter) {
        inter.method(); // 调用自定义的函数式接口方法
    }
    public static void main(String[] args) {
        // 调用使用函数式接口的方法
        doSomething(()->{
            System.out.println("asasasasasas");
        });
        //简化去到大括号只有一行语句的时候可以去掉
        doSomething(()-> System.out.println("asas"));
    }
}
