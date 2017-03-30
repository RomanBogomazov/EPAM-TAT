import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 30.03.2017.
 */
public class Login {
  private WebDriver driver;
  private By userName = By.id("mailbox__login");
  private By userPassword = By.id("mailbox__password");
  private By loginButton = By.id("http://www.mail.ru");

  Login(WebDriver driver) {
    this.driver = driver;
  }

  void setUserName(String userNameLabel) {
    driver.findElement(userName).sendKeys(userNameLabel);
  }

  void setUserPassword(String userPasswordLabel) {
    driver.findElement(userPassword).sendKeys(userPasswordLabel);
  }

  void setLoginButtonLabel() {
    driver.findElement(loginButton).click();
  }

  public void setLoginToQA(String userName, String userPassword){
    this.setUserName(userName);
    this.setUserPassword(userPassword);
    this.setLoginButtonLabel();
  }
}