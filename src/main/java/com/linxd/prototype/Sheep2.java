package com.linxd.prototype;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 23:02
 * Description: 原型模式/克隆模式（浅克隆）
 */
public class Sheep2 implements Cloneable{
    private String name;
    private Integer age;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep2 obj = (Sheep2) super.clone();
        obj.setDate((Date) this.date.clone());
        return obj;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Sheep2(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Sheep2() {}

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
