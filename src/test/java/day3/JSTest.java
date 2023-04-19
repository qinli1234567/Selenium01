package day3;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSTest {

    @Test
    public void testJS() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById(\"kw\").setAttribute(\"value\",\"执行js\")");
        Thread.sleep(3000);
    }
}

