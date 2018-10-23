package com.wmlce.proxy.staticProxy;

public class StudentsProxy implements Person {
    Student student;

    public StudentsProxy(Person person) {
        if(person instanceof Student ){
            this.student =(Student)person;
        }
    }

    //代理上交班费，调用
    @Override
    public void giveMoney() {
        //在上交班费之前可以反应张三最近的学习的情况
        System.out.println("张三最近学习有进步！");
        student.giveMoney();
    }
}
