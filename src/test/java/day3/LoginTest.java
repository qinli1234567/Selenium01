package day3;
//登录并且发送一封邮件
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void openChrome(){
        driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
        driver.manage().window().maximize();
    }

    @Test

    public void loginTest() throws InterruptedException {
        //用自己的账号成功登陆
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id, 'x-URS-iframe')]")));
        driver.findElement(By.name("email")).sendKeys("liqin990729");
        driver.findElement(By.name("password")).sendKeys("lq1234567");
        driver.findElement(By.id("dologin")).click();
        Thread.sleep(3000);

        //发送邮件
        driver.findElement(By.xpath("//*[@id=\"_mail_component_78_78\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("nui-editableAddr-ipt")).sendKeys("1009275645@qq.com");
        //定位寄件人 输入地址
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/section/header/div[2]/div[1]/div/div/input")).sendKeys("你好！");
        //定位主题 输入主题
        driver.switchTo().frame(driver.findElement(By.className("APP-editor-iframe")));
        //转交控制权给输入框
        driver.findElement(By.xpath("/html/body")).sendKeys("我正在用webdriver给你写信！");
        //输入文本
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/section/footer/div[1]/span[2]")).sendKeys("我正在用webdriver给你洗写信！");
        //定位发送按钮 点击发送
        Thread.sleep(2000);


    }





    @AfterMethod
    public void closeChrome(){
        driver.quit();
    }
}
