import engine.Driver;
import engine.utils.LoggerUtil;
import org.testng.annotations.*;

@Listeners
public class UiTestRunner {

    @BeforeClass
    public final void beforeClass(){
        LoggerUtil.startTestSuite("Test suite: " + getClass().getName() + " is running...");
    }
    @BeforeTest
    public final void beforeTest(){
        Driver.start();
    }

    @AfterTest
    public final void afterTest(){
        Driver.quit();
        LoggerUtil.endTestCase();
    }

    @AfterClass
    public final void afterClass(){
        LoggerUtil.endTestSuite();
    }
}
