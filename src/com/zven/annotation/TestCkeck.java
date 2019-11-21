package com.zven.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * @author Administrator
 * @date 2019/11/19 0019 17:27
 */
public class TestCkeck {
    public static void main(String[] args) throws IOException {
        Calculater cal = new Calculater();
        Class calClass = cal.getClass();
        Method[] methods = calClass.getMethods();

        int num = 0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    num++;

                    bufferedWriter.write(method.getName()+"方法出异常了");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常方法："+ method.getName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因："+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("------------------------------");
                    bufferedWriter.newLine();
                }
            }
        }
        bufferedWriter.write("本次一共出现"+ num +"次异常");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
