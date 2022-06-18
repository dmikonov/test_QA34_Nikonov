import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Test_1 {
    WebDriver wd;

    @Test
    public void start1() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew", "C:/Tools/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
        wd.close();
        wd.quit();
    }

    @Test
    public void start2() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew", "C:/Tools/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.close();
        wd.quit();
    }

    @Test
    public void start3() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew", "C:/Tools/chromedriver.exe");
        wd.navigate().to("https://trello.com/");

        //openloginform
        WebElement login = wd.findElement(By.cssSelector("[href='/login']"));
        login.click();

        //fillloginform;
        WebElement emailTextBox = wd.findElement(By.cssSelector("#user"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("d020797@gmail.com");

        //confirm email
        WebElement confirmLoginButton = wd.findElement(By.cssSelector("#login")) ;
        confirmLoginButton.click();

        //view pwd
        WebElement icon = wd.findElement(By.cssSelector(".css-pxzk9z"));

        //fill in valid password;
        WebElement passwordTextBox = wd.findElement(By.cssSelector("#password"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("test");

        //confirm login;
        WebElement loginButton = wd.findElement(By.cssSelector("#login-submit"));
        loginButton.click();


    }

    @Test
    public void start4(){
        //tag
        WebElement el = wd.findElement(By.tagName("a"));
        WebElement els = wd.findElement(By.cssSelector("a"));
        WebElement els2 = wd.findElement(By.cssSelector("div"));

        //id
        WebElement el2 = wd.findElement(By.id("skip-targer"));
        WebElement els23 = wd.findElement(By.id("login-form"));
        WebElement els223 = wd.findElement(By.cssSelector("#login-form"));

        //class
        WebElement el3 = wd.findElement(By.className("BigNavStyles__InnerHeader-sc-1mttgg7-2 kuxyBF"));
        WebElement el4 = wd.findElement(By.className("kuxyBF"));
        WebElement elc1 = wd.findElement(By.cssSelector(".BigNavStyles__InnerHeader-sc-1mttgg7-2 kuxyBF"));
        WebElement elc12 = wd.findElement(By.cssSelector(".k nuxyBF"));

        //link
        WebElement el5 = wd.findElement(By.linkText("Log in"));
        WebElement el25 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el26 = wd.findElement(By.cssSelector("[href='/sighup']"));
        WebElement el265 = wd.findElement(By.cssSelector("[data-testid='bignav']"));

        //starts/contains-ends(css)
        WebElement el259 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
        WebElement el23259 = wd.findElement(By.cssSelector("[aria-label $='lo']")); //ends
        WebElement e6259 = wd.findElement(By.cssSelector("[aria-label ^='Tr']")); //starts
        WebElement el257 = wd.findElement(By.cssSelector("[aria-label *='rell']")); //contains

    }

    @Test
    public void start5(){
        List<WebElement> els = wd.findElements((By.cssSelector("div"));
        System.out.println(els.size());
    }
//data-testid='logo_link' - logo trello
    @Test
    public void openTab(){
        WebElement tab = wd.findElement(By.cssSelector("[data-testid='bignav-tab']"));
    }

    @Test
    public void logOut(){
        WebElement avatar = wd.findElement(By.cssSelector("data-test-id = 'header-member-menu-button'"));
        avatar.click();
        WebElement logOut1 = wd.findElement(By.cssSelector("data-test-id = 'header-member-menu-logout'"));
        logOut1.click();
        WebElement logOut2 = wd.findElement(By.cssSelector("[data-testid='logout-button]"));
    }
}


