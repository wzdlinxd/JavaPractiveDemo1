package com.linxd;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/22 14:06
 * Description: 值传递和引用传毒
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.n = 1;
        a.str = "aaaa";
        int b = 2;
        System.out.println(a+" "+b);
        change(a,b);
        System.out.println(a+" "+b);
    }
    public static void change(A a,int b) {
        a.n = 2;
        a.str = "ssss";
        b = 3;
    }
}

class A {
    public int n;
    public String str;

    @Override
    public String toString() {
        return "A{" +
                "n=" + n +
                ", str='" + str + '\'' +
                '}';
    }
}