package com.zven.annotation;

/**
 * @author Administrator
 * @date 2019/11/19 0019 17:15
 */
public class Calculater {
    @Check
    public void add(){
        System.out.println("1+0=" + (1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0=" + (1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0=" + (1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0=" + (1/0));
    }


    public void show(){
        System.out.println("没有异常");
    }
}
