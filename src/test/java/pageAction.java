import org.example.LoginLocators1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.text.BreakIterator;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class pageAction {
    LoginLocators1 locate1 = new LoginLocators1();
    Hooks hooks = new Hooks();

    @Test
    public void LoginIntoSystem() throws InterruptedException {

        hooks.GetBrowser().navigate().to("https://testplus.oasisapp.services/dhbhp/faces/Login.jsf");
        hooks.GetBrowser().manage().window().maximize();
        hooks.GetBrowser().findElement(locate1.enterUsername()).sendKeys("testrcm");
        hooks.GetBrowser().findElement(locate1.enterPassword()).sendKeys("testrcm");
        hooks.GetBrowser().findElement(locate1.clickLoginButton()).click();
        hooks.GetBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        if (hooks.GetBrowser().findElement(locate1.table()).isDisplayed() == true) {
            System.out.println("Good job");
            hooks.GetBrowser().findElement(locate1.clickYesButton()).click();
        }
        hooks.GetBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hooks.GetBrowser().findElement(locate1.OpenBurgerButton()).click();
        hooks.GetBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        hooks.GetBrowser().findElement(By.xpath("//*[@id=\"pt1:OasisHedarToolBar:dc_pgl5\"]/tbody/tr"))
                .findElement(By.xpath("//*[@class='hamburger-menu-btn xgn p_AFTextOnly']")).click();

        hooks.GetBrowser().findElement(locate1.SendSearchValue()).sendKeys("Manage Approvals");
        hooks.GetBrowser().findElement(locate1.ClickSearchValue()).click();
        hooks.GetBrowser().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        hooks.GetBrowser().findElement(locate1.EnterCalenderPicker()).sendKeys(Keys.chord("01-01/2022"));
        Thread.sleep(10000);
        hooks.GetBrowser().findElement(locate1.EnterCalenderPicker()).sendKeys(Keys.chord("01-01/2022"));
        //Neglect this part of the code
        /*
         Thread.sleep(10000);
        hooks.GetBrowser().findElement(locate1.EnterCalenderPicker()).sendKeys(Keys.chord("01-01/2021"));
        Thread.sleep(10000);
        hooks.GetBrowser().findElement(locate1.EnterCalenderPicker()).sendKeys(Keys.chord("01-01/2021"));
         WebElement l = hooks.GetBrowser().findElement(locate1.EnterCalenderData());
        l.sendKeys("01","-01","/2022");
        Thread.sleep(20000);
        StringBuilder date = new StringBuilder();
        date.append("01");
        date.append("-");
        date.append("01");
        date.append("/2");
        date.append("02");
        date.append("2");
        l.sendKeys(date);
        String val = l.getAttribute("title");

        System.out.println(val);
        do {
            hooks.GetBrowser().findElement(locate1.EnterCalenderData()).sendKeys("01-01/2022");
            System.out.println("Hi");
        } while (val != "01-01/2021");
        JavascriptExecutor j = (JavascriptExecutor) hooks.GetBrowser();
        j.executeScript("arguments[0].value='01-01/2022'", DateSearchBox);
         WebDriverWait wait = new WebDriverWait(hooks.GetBrowser(), Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(hooks.GetBrowser().findElement(By.tagName("h1"))));
*/

        hooks.GetBrowser().findElement(locate1.PlaceClickOnByMouse()).click();
        hooks.GetBrowser().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement webElement = hooks.GetBrowser().findElement(locate1.PlaceClickOnByMouse());
        Actions action = new Actions(hooks.GetBrowser());
        action.doubleClick(webElement);

        WebDriverWait wait = new WebDriverWait(hooks.GetBrowser(), Duration.ofSeconds(100));
        Boolean element = wait.until(ExpectedConditions.textToBe(
        By.xpath("//*[@id=\"pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc17:ot3:dc_pgl6\"]/tbody/tr/td/span"), "74"));
        String number = hooks.GetBrowser().findElement(locate1.checkPostedData()).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(number, "74", "passed");
        softAssert.assertAll();

        hooks.QuitBrowser();
    }

}
