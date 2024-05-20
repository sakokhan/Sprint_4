package sprint4;
import Pages.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

public class TestQuestionSection {
    private WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(3, SECONDS));
    }
    @Test
    public void testQuestionSection(){
        MainPage mainPage = new MainPage(webDriver);

        mainPage.open();
        mainPage.scroll(mainPage.getHowMuchQuestion());
        mainPage.click(mainPage.getHowMuchQuestion());
        if(webDriver.findElement(mainPage.getHowMuchAnswer()).isDisplayed()){
            System.out.println("Когда нажимаешь на стрелочку, открывается соответствующий текст");
        }else{
            System.out.println("Когда нажимаешь на стрелочку, соответствующий текст не открывается");
        }

    }
    @After
    public void tearDown(){webDriver.quit();
    }
}