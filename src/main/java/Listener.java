/*
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
*/
/*
public class Listener implements ITestListener {

    // This belongs to ITestListener and will execute before starting of Test set/batch

    public void onStart(ITestContext arg0) {

        Reporter.log("About to begin executing Test " + arg0.getName(), true);

    }

    // This belongs to ITestListener and will execute, once the Test set/batch is finished

    public void onFinish(ITestContext arg0) {

        Reporter.log("Completed executing test " + arg0.getName(), true);

    }

    // This belongs to ITestListener and will execute only when the test is pass

    public void onTestSuccess(ITestResult arg0) {

        // This is calling the printTestResults method

        printTestResults(arg0);

    }

    // This belongs to ITestListener and will execute only on the event of fail test

    public void onTestFailure(ITestResult arg0) {

        // This is calling the printTestResults method

        printTestResults(arg0);

    }

    // This belongs to ITestListener and will execute before the main test start (@Test)

    public void onTestStart(ITestResult arg0) {

        System.out.println("The execution of the main test starts now");

    }

    // This belongs to ITestListener and will execute only if any of the main test(@Test) get skipped

    public void onTestSkipped(ITestResult arg0) {

        printTestResults(arg0);

    }

    private void printTestResults(ITestResult result) {

        Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);

        if (result.getParameters().length != 0) {

            String params = null;

            for (Object parameter : result.getParameters()) {

                params += parameter.toString() + ",";

            }
        }
    }
}
*/
