package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PhantomjsTest {

    @Test
    public void pjsTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("phantomJS");
        Thread.sleep(3000);

        String a = driver.getTitle();
        System.out.println(a);
        driver.quit();
    }
}
