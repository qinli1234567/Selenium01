package day3;
//注册163邮箱
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {
    WebDriver driver;

    @BeforeMethod
    public void openChrome(){
        driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void registest() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id, 'x-URS-iframe')]")));
        //由于那个框架frame的id是动态id 所以必须要用这种方法 解决办法：https://www.cnblogs.com/quhao0994/p/13114484.html

        Thread.sleep(2000);
        driver.findElement(By.id("changepage")).click();
        //控制权转交之后 点击去注册按钮
        Thread.sleep(2000);

        //获取当前driver所在的handle值
        String handle1 = driver.getWindowHandle();

        //driver切换到新的window页面
        for (String handles: driver.getWindowHandles()) {
            if (handles.equals(handle1)){
                continue;
            }
            driver.switchTo().window(handles);
        }
        //输入手机号码和密码
        driver.findElement(By.xpath("//*[@id=\"root\"]/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/div[3]/div[1]/div/div[1]/span/input")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"root\"]/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/div[3]/div[2]/div/div[1]/span[1]/input")).sendKeys("321654987");
        driver.findElement(By.xpath("//*[@id=\"root\"]/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/div[3]/table/tbody/tr[1]/td[1]/label/span/input"));
        Thread.sleep(2000);


    }

    @AfterMethod
    public void closeChrome(){
        driver.quit();
    }
}
