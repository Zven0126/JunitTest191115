package com.zven.test;

import com.zven.junit.Caculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 * @date 2019/11/15 0015 16:02
 */
public class CaculateTest {

    @Before
    public void beforeTest() {
        System.out.println("测试之前执行");
    }

    @Test
    public void testAdd(){
        Caculate ca = new Caculate();
        int result = ca.add(1,2);
        Assert.assertEquals(2,result);
        System.out.println("测试能否执行");
    }

    @After
    public void afterTest() {
        System.out.println("执行最后运行");
    }
}
