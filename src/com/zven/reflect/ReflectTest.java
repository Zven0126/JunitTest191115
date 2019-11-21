package com.zven.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Administrator
 * @date 2019/11/19 0019 10:12
 */
@SuppressWarnings("all")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        /*
        需求：不改变该类的代码，可以创建任意对象执行任意方法
        * */
        /*
        * 步骤：1、加载配置文件   2、反射
        * */

        //1、加载配置文件
        //创建Properties对象
        Properties pro = new Properties();
        //加载配置文件，转化为集合
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);


        //2、获取配置文件中的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        //加载类
        Class cls = Class.forName(className);
        //创建对象
        Object obj  = cls.newInstance();

        Method method = cls.getMethod(methodName,String.class);

        method.invoke(obj,"12345");


    }
}
