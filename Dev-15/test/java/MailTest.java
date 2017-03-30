import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by User on 24.03.2017.
 */
public class MailTest {
    private WebDriver driver;
    Login login;
    private String correctLogin = "tat-dev13";
    private String correctPassword = "23.03.2017";
    private String incorrectLogin = correctLogin + "dasdsa";
    private String incorrectPassword = correctPassword + 1;

    @Before
    public void download() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://mail.ru");
    }

    @Test
    public void incorrectLoginOrPassword() {
        String errorMessage = "Wrong address or password!";
        login = new Login(driver);

        login.setLoginToQA(incorrectLogin, incorrectPassword);

        assertEquals(errorMessage, "https://account.mail.ru/login?email=tat-dev13dasdsa@mail.ru&fail=1&page=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox%3Ffrom%3Dlogin%26back%3D1", driver.getCurrentUrl());
    }

    @Test
    public void nullPassword() {
        WebElement errorTitle = driver.findElement(By.id("mailbox:authfail"));
        login.setLoginToQA(correctLogin, "");

        assertEquals("Wrong field of password is null!", "Введите пароль", errorTitle.getText());
    }

    @Test
    public void correctInput() {
        WebElement menuBar = driver.findElement(By.id("PH_user-email"));
        login.setLoginToQA(correctLogin, correctPassword);

        assertEquals("It's big fail!", correctLogin, menuBar.getText());
    }
}