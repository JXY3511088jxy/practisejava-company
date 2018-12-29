package java自动化;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openbrowser {
        WebDriver driver;
        public openbrowser(WebDriver driver){
            this.driver = driver;
        }
        public void openBrowser() {
            //System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\practice\\lib\\chromedriver.exe");
            //WebDriver driver = new ChromeDriver();
            driver.get("http://222.222.222.31:8084/isp/");     //打开网页
            driver.manage().window().maximize();//对窗口进行最大化
        }

        //登录
        public void login() {
            ((ChromeDriver) driver).findElementByXPath("/html/body/div/form/div[1]/input").sendKeys("liujun");
            ((ChromeDriver) driver).findElementByXPath("/html/body/div/form/div[2]/input").sendKeys("1");
            ((ChromeDriver) driver).findElementByXPath("//*[@id=\"btnLogin\"]").click();
    }

}
