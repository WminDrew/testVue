package com.wmlce.proxy.staticProxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        Person zhangsan = new Student("张三");
        StudentsProxy monitor = new StudentsProxy(zhangsan);
        monitor.giveMoney();
    }
}
