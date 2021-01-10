package com.liuhexuan;

public class Students{
    public int sid;
    public String name;
    public String gender;
    public double score;
    public String level;
    public Students(){}
    public Students(int sid,String name,String gender,double score){
        this.sid=sid;
        this.name=name;
        this.gender=gender;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public int getSid(){
        return sid;
    }
    public String getGender(){
        return gender;
    }
    public String getLevel(){
        return level;
    }
    public double getScore(){
        return score;
    }
    public String toString(){
        String s="学生"+name+"的成绩为："+level;
        return s;
    }
    public void QuickSort(Students R[],int low,int high){
        /**
          * @Author liuhexuan
          * @Description //TODO 快速排序
          * @Date 16:39 2021/1/5
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
     * @Date 16:41 2021/1/5
     * @Param [R, low, high]
     * @return int
     */
    public int Partition(Students R[],int low,int high){
        Students pivot=R[low];
        while(low<high){
            while(low<high&&R[high].score>pivot.score)high--;
            R[low]=R[high];
            while(low<high&&R[low].score<pivot.score)low++;
            R[high]=R[low];
        }
        R[low]=pivot;
        return low;
    }
}


