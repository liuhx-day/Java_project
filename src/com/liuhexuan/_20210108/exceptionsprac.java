package com.liuhexuan._20210108;/**
 * @Current File Name: exceptionsprac.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/8 9:07
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * @ClassName exceptionsprac
 * @Description TODO:捕获异常练习
 * @Author 刘赫轩
 * @Date 2021/1/8 9:07
 * @Version 1.0
 **/
public class exceptionsprac {
    public static void main(String []args)throws Exception{
        System.out.println("请输入年龄：");
        int n=0;
        Scanner input = new Scanner(System.in);
        try{
            n=input.nextInt();
        }catch (Exception e){
            throw new Exception("请输入整数！");
        }
        if(n<0||n>100) throw new Exception("输入范围错误！tip:年龄∈[0,100]");
        else {
            switch (n/10){
                case 9:
                case 8:
                case 7:
                case 6: System.out.println("老年");break;
                case 5:
                case 4: System.out.println("中年");break;
                case 3:
                case 2: System.out.println("青年");break;
                case 1: System.out.println("少年");break;
                default:System.out.println("幼年");break;
            }
        }
    }
}
