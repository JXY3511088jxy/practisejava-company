package java自动化;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\IdeaProjects\\practice\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://222.222.222.201:8089/isp/");
    }

}
