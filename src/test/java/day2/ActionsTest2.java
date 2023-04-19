package day2;
//实例化Robot类 可以进行模拟鼠标和键盘的操作
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;


public class ActionsTest2 {
    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        driver = new ChromeDriver();
    }

    @Test
    public void rightClickTest() throws InterruptedException {
        driver.get("https://www.baidu.com");
        //打开百度
        driver.manage().window().maximize();
        //窗口最大化
        WebElement button = driver.findElement(By.id("su"));
        //找到元素 百度一下
        Actions actions = new Actions(driver);
        //实例化Actions
        actions.contextClick(button).perform();
        //右键点击 百度一下
        Thread.sleep(2000);
        /*
        * actions.doubleClick(button).perform(); 双击
        * actions.moveToElement(button).perform; 鼠标移到button上面
        * actions.dragAndDropBy(button,200,200).perform(); 拖拽button窗口 并且移动到指定位置
        *
        * */
    }

    @Test
    public void saveHtml() throws AWTException, InterruptedException {
        driver.get("https://www.baidu.com");

        Robot robot = new Robot();
        //实例化Robot类 可以进行模拟鼠标和键盘的操作

        robot.keyPress(KeyEvent.VK_CONTROL);//按住crtl键
        robot.keyPress(KeyEvent.VK_S);//同时按住s键
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);//按回车键
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);//释放掉回车键
        robot.keyRelease(KeyEvent.VK_ENTER);//释放掉回车键


    }


    @AfterMethod
    public void closeChrome() {
        driver.quit();
    }
}


