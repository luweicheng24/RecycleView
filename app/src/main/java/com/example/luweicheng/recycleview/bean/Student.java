package com.example.luweicheng.recycleview.bean;

/**
 * Created by luweicheng on 2016/4/15.
 */
public class Student {
    private String name;
    private String age;

    public Student(String name, String age, int photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    private int photo;
}
