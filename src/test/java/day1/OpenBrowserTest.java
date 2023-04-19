package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class OpenBrowserTest {
    WebDriver driver = new ChromeDriver();
    @Test
    /* public void openChrome(){
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\Joey\\IdeaProjects\\untitled17\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
    */
    public void openChrome() throws InterruptedException {


        String title = driver.getTitle();
        System.out.println("获得的title是" + title);//获取当前页的title

        Thread.sleep(2000);//等待2s
        driver.close();//关闭当前窗口 （.quit的话是关闭所有
        driver.quit();


    }
    @Test
    //定位元素的方法
    public void byIDTest(){

        driver.get("https:/www.bilibili.com");
        List<WebElement> list = driver.findElements(By.tagName("input"));
        System.out.println(list.size());
        driver.quit();
    }
    @Test
   //通过xpath 找百度一下按钮 右键复制元素的xpath值（css值同理）
    public void byXpath(){
        driver.get("http://www.baidu.com");
        driver.findElement(By.xpath("//*[@id=\"su\"]"));
        driver.quit();
    }
}