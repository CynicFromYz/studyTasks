package com.waiqin365.firstdemo.sometest;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2019/10/19 11:12
 */
public class Student implements java.lang.Comparable<Student> {
    int no;
    String name;
    String sex;
    Float height;

    public Student() {
    }

    public Student(int no, String name, String sex, float height) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.height = height;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        int result;
        //按身高降序
        result = (int) (this.height - o.height);
        return result;
    }
}
