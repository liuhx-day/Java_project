package com.liuhexuan._20210108;/**
 * @Current File Name: Teacher.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/8 11:30
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

/**
 * @ClassName Teacher
 * @Description TODO:教师信息类
 * @Author 刘赫轩
 * @Date 2021/1/8 11:30
 * @Version 1.0
 **/
public class Teacher {
    public int tNO;
    public String tName;
    public String tSex;
    public int tAge;
    public double tSalary;
    public Teacher(int tNO,String tName,String tSex,int tAge,double tSalary){
        this.tNO=tNO;
        this.tName=tName;
        this.tSex=tSex;
        this.tAge=tAge;
        this.tSalary=tSalary;
    }
    public int getNo(){ return tNO; }
    public String gettName(){ return tName; }
    public String gettSex(){ return tSex; }
    public int gettAge(){ return tAge; }
    public double gettSalary(){return tSalary;}
    public String toString() { return "工号：" + tNO + " 姓名：" + tName + " 性别：" + tSex + " 年龄：" + tAge + " 薪资：" + tSalary; }
    public static void main(String[] args)  throws Exception  {
        Teacher[] _teacher=new Teacher[3];
        _teacher[0]=new Teacher(1,"赵","女",32,6000.0);
        _teacher[1]=new Teacher(2,"钱","男",49,10000.0);
        _teacher[2]=new Teacher(3,"孙","女",19,2000.0);
        for(int i=0;i<3;i++)
            _teacher[i].toString();
        QuickSort(_teacher,0,2);
        System.out.println(_teacher[2].tName+"的工资最高，为："+_teacher[2].tSalary+"元！");
        System.out.println(_teacher[0].tName+"的工资最低，为："+_teacher[0].tSalary+"元！");
    }
    public static void QuickSort(Teacher R[], int low, int high){
        /**
         * @Author liuhexuan
         * @Description //TODO 快速排序
         * @Date 11:39 2021/1/8
         * @Param [R, low, high]
         * @return void
         */
        if(low<high){
            int pivot_pos=Partition(R,low,high);
            QuickSort(R,low,pivot_pos-1);
            QuickSort(R,pivot_pos+1,high);
        }
    }
    /**
     * @Author liuhexuan
     * @Description //TODO 寻找枢轴位置
     * @Date 11:41 2021/1/6
     * @Param [R, low, high]
     * @return int
     */
    public static int Partition(Teacher R[],int low,int high){
        Teacher pivot=R[low];
        while(low<high){
            while(low<high&&R[high].tSalary>pivot.tSalary)high--;
            R[low]=R[high];
            while(low<high&&R[low].tSalary<pivot.tSalary)low++;
            R[high]=R[low];
        }
        R[low]=pivot;
        return low;
    }
}
