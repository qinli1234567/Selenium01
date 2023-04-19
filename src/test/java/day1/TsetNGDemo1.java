package day1;

import org.testng.annotations.*;

public class TsetNGDemo1 {
    @BeforeTest//在类里最先运行 只运行一次
    public void beforeTest(){
        System.out.println("这是beforeTest");
    }
    @BeforeMethod//每次都在test方法前运行
    public void beforeMethod(){
        System.out.println("这是beforeMethod");
    }
    @Test
    public void testCase1(){
        System.out.println("这是case1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是case2");
    }
    @AfterTest//所有test运行结束后运行这个 只运行一次
    public void afterTest(){
        System.out.println("这是afterTest");
    }
    @AfterMethod//每次都在test方法后运行 和beforemethod对应
    public void afterMethod(){
        System.out.println("这是afterMethod");
    }

}
