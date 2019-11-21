package com.zven.reflect;

import java.lang.reflect.Field;

/**
 * @author Administrator
 * @date 2019/11/18 0018 15:04
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {

        //获取类的三种方式
        /*
        * Class.forName("类的全路径");
        * 类名.class;
        * 类对象.getClass();
        * */


        Class personClass = Person.class;

        Field[] fields  = personClass.getFields();//获取类中public修饰的属性


        for (Field field : fields) {
            System.out.println("变量名：" +  field);
        }

        System.out.println("------------------------");

        //反射get方法
        Field field1 = personClass.getField("name");
        Person p = new Person();
        Object value = field1.get(p);

        //反射属性set方法
        System.out.println(value);
        field1.set(p,"zhangsan");
        System.out.println(p);


        Field[] fieldDeclared  = personClass.getDeclaredFields();//获取类中所有的属性

        Field privateField = personClass.getDeclaredField("age");//获取私有属性
        privateField.setAccessible(true);//设置暴力反射
        Object value2 = privateField.get(p);
        System.out.println(value2);



    }
}
