package com.imooc.study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @description:
 * @author: aster
 * @createDate: 2019/6/26
 */
public class LambdaStudy {
   public static void main(String[] args){
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("before java 8");
           }
       }).start();

       //参数列表 -> 函数体
       new Thread(()-> System.out.println("in java8")).start();

       List<String> list= Arrays.asList("java8","jkd8","java 11");
       list.forEach(w-> System.out.println(w));

       list.forEach(System.out::println);
   }
}
