package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Srini on 22/04/2018.
 */
public class ChooseBrowser {

    public WebDriver getChromeDriver() throws Exception{
        if (System.getProperty("os.name").toLowerCase().contains("mac"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/MacChromedriver");
        }
        else if (System.getProperty("os.name").toLowerCase().contains("linux"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/linuxhromedriver");
        }
        else
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }

        WebDriver driver = new ChromeDriver();

        return driver;
    }
}
