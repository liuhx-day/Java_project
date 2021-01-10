package com.liuhexuan;
/**
  * @Current File Name: UseIntArray.java
  * @Author: 刘赫轩(软件工程2班)
  * @Sid: 1731030159
  * @Date: Created in 2021/1/6 13:31
  * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
  */

import java.util.Scanner;

/**
 * @ClassName UseIntArray
 * @Description TODO:定义并初始化整型数组，遍历数组、求和，打印到屏幕上
 * @Author 刘赫轩
 * @Date 2021/1/6 13:31
 * @Version 1.0
 **/
public class UseIntArray {
    public static void array_sum(){
        Scanner input=new Scanner(System.in);
        int sum=0;
        int n=0;
        System.out.println("请输入数据规模：");
        n=input.nextInt();
        int[] data= new int[n];
        System.out.println("请输入数据：");
        for (int i=0;i<n;i++){
            data[i]=input.nextInt();
            sum+=data[i];
        }
        for (int i=0;i<n;i++){
            if(i==n-1) System.out.print(data[i]);
            else System.out.print(data[i]+",");
        }
        System.out.println("\n以上各元素的和为："+sum);
    }/**
      * @Author liuhexuan
      * @Description //TODO 3*3的二维数组求和
      * @Date 14:12 2021/1/6
      * @Param []
      * @return void
      **/
    public static void two_dimensional_array(){
        int res=0;
        Scanner input = new Scanner(System.in);
        int[][] data= new int[3][3];
        for(int i=0;i<data[0].length;i++)
            for (int j=0;j<data[0].length;j++){
                data[i][j]=input.nextInt();
                res+=data[i][j];
            }
        for(int i=0;i<data[0].length;i++){
            System.out.print("| ");
            for(int j=0;j<data[0].length;j++)
                System.out.print(data[i][j]+" ");
            System.out.print("|");
            System.out.println();
        }
            System.out.println("该数组的所有元素和为："+res);
    }
}
