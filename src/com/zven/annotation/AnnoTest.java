package com.zven.annotation;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @date 2019/11/19 0019 15:29
 */
@Pro(className = "com.zven.annotation.Demo1",methodName = "show")
public class AnnoTest {

    public static void main(String[] args) throws Exception {
         /*
        需求：不改变该类的代码，可以创建任意对象执行任意方法
        * */

         /*
         1、解析注解
         * */
         //1.1  获取该类的字节码文件对象
         Class<AnnoTest> annoTestClass =  AnnoTest.class;
         //1.2  获取上面的注解对象
         Pro pro = annoTestClass.getAnnotation(Pro.class);
         //1.3  调用注解对象中定义的抽象方法，获取返回值；
         String className = pro.className();
         System.out.println(className);
         String methodName = pro.methodName();
         System.out.println(methodName);

        //加载类
        Class cls = Class.forName(className);
        //创建对象
        Object obj  = cls.newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(obj);
    }
}
