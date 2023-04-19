package day4;
//其他case需要定位元素的话 可以把driver.findElement(By.id("changepage"))这一串 替换成driver.findElement(LoginPage.zhuceButton)
import org.openqa.selenium.By;

public class LoginPage {
    public static By eamilInput = By.name("email");
    //定义 登录名输入框定位方式
    public static By pwd = By.name("password");
    //定义 密码输入框定位方式
    public static By loginButton = By.id("dologin");
    //定义 登录按钮定位方式

    //去注册
    public static By zhuceButton = By.id("changepage");



}
