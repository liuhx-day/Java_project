package com.liuhexuan;/**
 * @Current File Name: looperprac.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/6 11:26
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

import javax.swing.*;

/**
 * @ClassName looperprac
 * @Description //TODO:循环
 * @Author dell
 * @Date 2021/1/6 11:26
 * @Version 1.0
 **/
public class looperprac {
    public static void graph_1(int n){
        for(int i=1;i<n;i+=2){
            pritspace(i);
            prit(i);
            System.out.println();
        }
    }
    public static void mutil(){
        for(int i=1;i<10;i++){
            for(int j=i;j<10;j++)
                System.out.print(i+"*"+j+"="+i*j+" ");
            System.out.print("\n");
        }
    }
    public static void prit(int n){
        for(int i=0;i<n;i++)
            System.out.print("*");
    }
    public static void pritspace(int n){
        for(int i=10-n;i>=0;i-=2)
            System.out.print(" ");
    }
}
