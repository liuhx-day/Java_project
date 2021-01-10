package com.liuhexuan._20210107;/**
 * @Current File Name: Animals.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/7 16:04
 * Copyright (c) 2020-2021 liuhexuan.All Rights Reserved.
 */

/**
 * @ClassName Animals
 * @Description TODO:public static void
 * @Author 刘赫轩
 * @Date 2021/1/7 16:04
 * @Version 1.0
 **/
public class Animals {
    public String name;
    public String food;

    public String  getName(){
        return name;
    }
    public String getFood(){
        return food;
    }
    public Animals(String name,String food){
        this.name=name;
        this.food=food;
    }
}
