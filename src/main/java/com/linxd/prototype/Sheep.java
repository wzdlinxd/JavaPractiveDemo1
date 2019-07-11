package com.linxd.prototype;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 23:02
 * Description: 原型模式/克隆模式（深克隆）
 */
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public Sheep(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Sheep() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
