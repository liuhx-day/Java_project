package com.liuhexuan;
/**
 * @Current File Name: divisor.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/6 16:00
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

import java.util.Scanner;

/**
 * @ClassName divisor
 * @Description TODO:按位输出
 * @Author 刘赫轩
 * @Date 2021/1/6 16:00
 * @Version 1.0
 **/
public class divisor {
    /**
      * @Author liuhexuan
      * @Description //TODO 按位输出
      * @Date 16:26 2021/1/6
      * @Param 
      * @return 
      **/
    public static void divisor_1(){
        int n=1678;
        int[] data=new int[4];
        for(int i=0;i<4;i++){
            data[i]=n%10;
            n/=10;
        }
        for (int i=3;i>=0;i--)
            if(i==0)System.out.println(data[i]);
            else System.out.print(data[i]+",");
    }
    /**
      * @Author liuhexuan
      * @Description //TODO 一维数组排序
      * @Date 16:15 2021/1/6
      * @Param
      * @return
      **/
    public static void Sort(){
        Scanner input= new Scanner(System.in);
        System.out.println("请输入数据规模:");
        int n=input.nextInt();
        int[] data=new int[n];
        System.out.println("请输入数据:");
        for(int i=0;i<n;i++)
            data[i]=input.nextInt();
        QuickSort(data,0,n-1);//对数组从小到大进行排序
        System.out.println("最大值是"+data[n-1]);
        System.out.println("最小值是"+data[0]);
        for (int i=0;i<n;i++){
            if(i==n-1)System.out.print(data[i]);
            else System.out.print(data[i]+",");
        }
    }
    /**
      * @Author liuhexuan
      * @Description //TODO 快排
      * @Date 16:15 2021/1/6
      * @Param a[] 待排数组， low 低位 high 高位
      * @return
      **/
    public static void QuickSort(int[]a,int low,int high){
        if(low<high){
            int pivot_pos=Partition(a,low,high);
            QuickSort(a,low,pivot_pos-1);
            QuickSort(a,pivot_pos+1,high);
        }
    }
    /**
      * @Author liuhexuan
      * @Description //TODO 寻找枢轴位置
      * @Date 16:15 2021/1/6
      * @Param a[] 待排数组 low 低位 high 高位
      * @return low 枢轴位置
      **/
    public static int Partition(int[]a,int low,int high){
        int pivot=a[low];
        while(low<high){
            while(low<high&&a[high]>pivot)high--;
            a[low]=a[high];
            while (low<high&&a[low]<pivot)low++;
            a[high]=a[low];
        }
        a[low]=pivot;
        return low;
    }
}
