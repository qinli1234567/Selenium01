package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){
        driver = new ChromeDriver();
    }
    @Test
    //点击百度首页的新闻按钮
    public void clickTest() throws InterruptedException {
        driver.get("http://www.baidu.com");
        WebElement newslink = driver.findElement(By.cssSelector("#s-top-left > a:nth-child(1)"));
        //通过复制新闻按钮的selector找到这个按钮
        newslink.click();
        //点击
        Thread.sleep(2000);
        //等待2s
    }

    @Test
    //百度搜索关键字selenium
    //通过sendkeys方法输入关键字
    public void sendkeysTest() throws InterruptedException {
        driver.get("http://www.baidu.com");
        WebElement keys = driver.findElement(By.id("kw"));//找到输入框
        keys.sendKeys("selenium");//输入selenium
        Thread.sleep(2000);
        WebElement baiduButton = driver.findElement(By.id("su"));//找到百度一下按钮
        baiduButton.click();//点击百度一下
        Thread.sleep(2000);

        //校验打开的页面对不对
        //随便通过某个链接的xpath定位到它
        WebElement text = driver.findElement(By.xpath("//*[@id=\"2\"]/div/div/h3/a"));
        //通过getText() 输出他的文本内容
        System.out.println(text.getText());
    }
        /*
        * keys.clear()清空
        *
        * */
    @AfterMethod
    public void closeChrome(){
        driver.quit();
    }
}
