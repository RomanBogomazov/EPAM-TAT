import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by User on 30.03.2017.
 */
public class Factory {
  WebDriver driver;

  WebDriver getDriver(String driverName) {
    if (driverName.equals("FireFox")) {
      driver = new FirefoxDriver();
    }
    else if (driverName.equals("Chrome")) {
      driver = new ChromeDriver();
    }
    else if (driverName.equals("Opera")) {
      driver = new OperaDriver();
    }
    else if (driverName.equals("InternetExplorer")) {
      driver = new InternetExplorerDriver();
    }
    else if (driverName.equals("Edge")) {
      driver = new EdgeDriver();
    }
    else if (driverName.equals("Safari")) {
      driver = new SafariDriver();
    }
    return driver;
  }
}
