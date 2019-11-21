package com.zven.reflect;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @date 2019/11/19 0019 09:57
 */
public class ReflectMethodDemo {

    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Method eatMethod = personClass.getMethod("eat", String.class);

        Person p = new Person();
        eatMethod.invoke(p,"1234");


        System.out.println("-------------------------------------");
        //获取所有的方法
        Method[] methods  =  personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }


        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
