package com.liuhexuan._20210107;/**
 * @Current File Name: Fish.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/7 16:06
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

/**
 * @ClassName Fish
 * @Description TODO:食物
 * @Author 刘赫轩
 * @Date 2021/1/7 16:06
 * @Version 1.0
 **/
public class Act extends Animals {
    public Act(String name, String food) {
        super(name, food);
    }
    public void eat(){
        System.out.println(getName()+"正在吃"+getFood());
    }
    public void sleep(){
        System.out.println(getName()+"正在睡觉！zzz~~~");
    }
}
