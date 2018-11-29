package java自动化;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        openbrowser openbrowser = new openbrowser(driver);//将浏览器打开部分进行封装
        openbrowser.openBrowser();
        openbrowser.login();
    }
}
