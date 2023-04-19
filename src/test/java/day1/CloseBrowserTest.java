package day1;
//浏览器基本操作

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseBrowserTest  {
    @Test
    public void closedFF() throws InterruptedException{

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");//打开百度首页
        Thread.sleep(2000);//等待2s

        // webDriver.navigate().back(); 浏览器后退，对应的back改为forward是前进
        // webDriver.navigate().refresh(); 刷新
        // webDriver.manage().window().maximize(); 最大化
        //String url = webDriver.getCurrentUrl();
        //System.out.println("获得的URL是" + url);//获取当前页面的url

        String title = webDriver.getTitle();
        System.out.println("获得的title是" + title);//获取当前页的title

        Thread.sleep(2000);//等待2s
        webDriver.close();//关闭当前窗口 （.quit的话是关闭所有
        webDriver.quit();

    }
}
