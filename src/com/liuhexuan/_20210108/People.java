package com.liuhexuan._20210108;
/**
 * @Current File Name: People.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/8 11:45
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */
/**
 * @ClassName People
 * @Description TODO:人类信息
 * @Author 刘赫轩
 * @Date 2021/1/8 11:45
 * @Version 1.0
 **/
public class People {
    public String name;
    public String gender;
    public int age;
    public String nation;
    public void sleep(){ System.out.println(name+"正在睡觉！");}
    public void eat(){ System.out.println(name+"正在睡觉！");}
    public void work(){System.out.println(name+"正在工作！");}
    public String getName(){return name;}
    public People(String name,String gender,int age,String nation){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.nation=nation;
    }
    public static void main(String[] args) {
        Worker[] _worker=new Worker[1];
        Student[] _student=new Student[1];
        Leader[] _leader=new Leader[1];
        _worker[0]=new Worker("赵","女",42,"中国","拼多多",16);
        _worker[0].work();
        _student[0]=new Student("周","男",23,"中国","沈阳工学院",17646166);
        _student[0].work();
        _leader[0]=new Leader("李","女",22,"中国","沈阳工学院",1768466,"班长");
        _leader[0].work();
    }
}
/**
 * @ClassName Worker
 * @Description TODO:派生类工人
 * @Author 刘赫轩
 * @Date 2021/1/8 11:46
 * @Version 1.0
 **/
class Worker extends People{
    String company;
    int work_age;
    @Override
    public void work(){System.out.println(getName()+"正在码程序！");}
    public Worker(String name,String gender,int age,String nation,String company,int work_age){
        super(name,gender,age,nation);
        this.company=company;
        this.work_age=work_age;
    }

}
/**
 * @ClassName People
 * @Description TODO:派生类学生
 * @Author 刘赫轩
 * @Date 2021/1/8 11:46
 * @Version 1.0
 **/
class Student extends People{
    String School;
    int SId;
    @Override
    public void work(){System.out.println(getName()+"正在学习！");}
    public Student(String name,String gender,int age,String nation,String school,int SId){
        super(name,gender,age,nation);
        this.School=school;
        this.SId=SId;
    }
}
/**
 * @ClassName People
 * @Description TODO:学生派生类-学生干部
 * @Author 刘赫轩
 * @Date 2021/1/8 11:46
 * @Version 1.0
 **/
class Leader extends Student{
    String job;
    @Override
    public void work(){System.out.println(getName()+"正在开会！");}
    public Leader(String name,String gender,int age,String nation,String school,int SId,String job){
        super(name,gender,age,nation,school,SId);
        this.job=job;
    }
}

