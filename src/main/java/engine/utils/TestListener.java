package engine.utils;

import engine.Driver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import java.util.List;

import static engine.Driver.timestamp;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        LoggerUtil.error("Test FAILED: " + result.getName());

        WebDriver driver = Driver.getInstance();

        if (driver != null){
            LoggerUtil.info("Screenshot captured for test case: " + result.getName());
            saveScreenshotPNG(driver);
        }

        saveTextLog(result.getName() + " FAILED and screenshot taken!");
    }

    @Override
    public void onTestStart(ITestResult result) {
        LoggerUtil.startTestCase("Test case: "+result.getName()+" is running...");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LoggerUtil.info("Test SUCCESS: " + result.getName());

        logOutput(Reporter.getOutput(result));
        super.onTestSuccess(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message){
        return message;
    }

    @Attachment
    public String logOutput(List<String> outputList) {
        String output = "";
        for (String o : outputList)
            output += o + " ";
        return output;
    }
}
