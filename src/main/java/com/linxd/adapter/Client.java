package com.linxd.adapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 9:20
 * Description: 客户端类，调用被适配的类的方法
 */
public class Client {
    public void test(Target target) {
        target.handelReq();
    }

    public static void main(String[] args) {
        Client client = new Client();

//        Target target = new Adapter();

        Target target = new Adapter2(new Adaptee());
        client.test(target);
    }

}
