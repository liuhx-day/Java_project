package com.liuhexuan;

import com.liuhexuan._20210107.Act;

import java.util.*;

/**
 * @Current File Name: Main.java
 * @Author: 刘赫轩(软件工程2班)
 * @Sid: 1731030159
 * @Date: Created in 2021/1/5 14:50
 * Copyright (c) 2020-2021 liuhexuan.All XRights Reserved.
 */
public class Main {
    public static void main(String[] args)  throws Exception  {
        // write your code here

        int q=5;
        System.out.printf("%d,%d,%d,%d",q,--q,q,q--);
        Act[] _act = new Act[2];
        _act[0]=new Act("老鼠","垃圾");
        _act[1]=new Act("老虎","吃肉");
        _act[0].eat();
        _act[1].sleep();

        divisor _divisor= new divisor();
        _divisor.Sort();
        System.out.println();
        _divisor.divisor_1();
        /*UseIntArray _useintarray= new UseIntArray();
        _useintarray.array_sum();
        _useintarray.two_dimensional_array();*/
        System.out.println();
        looperprac a= new looperprac();
        a.mutil();
        a.graph_1(10);
        int n=0;
        while(n<=100)
            n++;
        System.out.println(n);
        Scanner input=new Scanner(System.in);
       // System.out.println("请输入数据规模n：");
        n=input.nextInt();
        System.out.println("1加到"+n+"的值为："+sum(n));
        Students[] s=new Students[4];
        s[0]=new Students(1731030159,"赵","男",94.5);
        s[1]=new Students(731030159,"钱","女",59.5);
        s[2]=new Students(31030159,"孙","女",86.5);
        s[3]=new Students(1030159,"李","男",75.5);
        int count=0;// 统计不及格人数
        for (int i=0;i<4;i++){
            switch ((int)s[i].score/10){
                case 10:
                case 9:s[i].level="A";break;
                case 8:s[i].level="B";break;
                case 7:s[i].level="C";break;
                case 6:s[i].level="D";break;
                default:s[i].level="FAIL";count++;
            }
            System.out.println(s[i].toString());
        }
        System.out.println("其中不及格学生人数为："+count+"\n");
        Students qs=new Students();
        qs.QuickSort(s,0,3);// 对学生按成绩进行排序
        System.out.println("学号 姓名 性别 分数");
        for (int i=3;i>=0;i--)
            System.out.println(s[i].sid+" "+s[i].getName()+" "+s[i].getGender()+" "+s[i].getScore());
    }
    public static int sum(int n){
        int res=0;
        for(int i=1;i<=n;i++)
            res+=i;
        return res;
    }
    public static void change(int[]a){
        a[0]=1;
    }
    private List<Students> _students= new List<Students>() {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Students> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Students students) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Students> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Students> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public Students get(int index) {
            return null;
        }

        @Override
        public Students set(int index, Students element) {
            return null;
        }

        @Override
        public void add(int index, Students element) {

        }

        @Override
        public Students remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Students> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Students> listIterator(int index) {
            return null;
        }

        @Override
        public List<Students> subList(int fromIndex, int toIndex) {
            return null;
        }
    };


}
