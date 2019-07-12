package com.linxd.composite;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 22:27
 * Description: 组合模式，适合树形结构，本次模拟对文件文件夹杀毒，有天然递归
 */
public class Client {
    public static void main(String[] args) {
        Folder f1 = new Folder("我的收藏");
        Folder f11 = new Folder("电影");
        AbstractFile f2 = new File("test.txt");
        AbstractFile f3 = new File("sAFDAD.JPG");
        AbstractFile f4 = new File("神雕侠侣.avi");
        AbstractFile f5 = new File("西游记.avi");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();
    }
}
