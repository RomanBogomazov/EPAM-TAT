import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 24.03.2017.
 */
public class MailTest {
    private WebDriver driver;
    private String correctLogin = "tat-dev13";
    private String correctPassword = "23.03.2017";
    private String incorrectLogin = correctLogin + "dasdsa";
    private String incorrectPassword = correctPassword + 1;

    @Before
    public void download() throws Exception {
        driver = new OperaDriver();
        driver.get("http://www.mail.ru");
    }

    @Test
    public void incorrectLoginOrPassword() {
        WebElement login = driver.findElement(By.id("mailbox__login"));
        WebElement password = driver.findElement(By.id("mailbox__password"));
        login.sendKeys(incorrectLogin);
        password.sendKeys(incorrectPassword);
        driver.findElement(By.id("mailbox__auth__button")).click();

        assertEquals("Wrong address or password!", "https://account.mail.ru/login?email=tat-dev13dasdsa@mail.ru&fail=1&page=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox%3Ffrom%3Dlogin%26back%3D1", driver.getCurrentUrl());
    }

    @Test
    public void nullPassword() {
        WebElement login = driver.findElement(By.id("mailbox__login"));
        WebElement password = driver.findElement(By.id("mailbox__password"));
        WebElement errorTitle = driver.findElement(By.id("mailbox:authfail"));
        login.sendKeys(correctLogin);
        password.sendKeys();
        driver.findElement(By.id("mailbox__auth__button")).click();

        assertEquals("Wrong field of password is null!", "Введите пароль", errorTitle.getText());
    }

    @Test
    public void correctInput() {
        WebElement login = driver.findElement(By.id("mailbox__login"));
        WebElement password = driver.findElement(By.id("mailbox__password"));
        WebElement menuBar = driver.findElement(By.id("PH_user-email"));
        login.sendKeys(correctLogin);
        password.sendKeys(correctPassword);
        driver.findElement(By.id("mailbox__auth__button")).click();

        assertEquals("It's big fail!", correctLogin, menuBar.getText());
    }
}