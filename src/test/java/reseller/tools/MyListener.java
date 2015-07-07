package reseller.tools;

import net.thucydides.core.steps.BaseStepListener;
import net.thucydides.core.steps.StepEventBus;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.io.File;

/**
 * Created by rusu on 4/2/15.
 */
public class MyListener extends RunListener {

    BaseStepListener baseStepListener = new BaseStepListener(new File(""));
    private Class<?> testClass;

    private boolean testingThisTest(Description description) {
        return description.getTestClass().equals(this.testClass);
    }

    @Override
    public void testRunStarted(Description description) throws Exception {
        super.testRunStarted(description);
        System.out.println("Number of test that I execute: " + description.testCount());
        StepEventBus.getEventBus().registerListener(baseStepListener);
        StepEventBus.getEventBus().testStarted(String.valueOf(testingThisTest(description)));
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        super.testRunFinished(result);
    }

    @Override
    public void testStarted(Description description) throws Exception {
        super.testStarted(description);
    }

    @Override
    public void testFinished(Description description) throws Exception {
        super.testFinished(description);
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        super.testFailure(failure);
    }

    @Override
    public void testAssumptionFailure(Failure failure) {
        super.testAssumptionFailure(failure);
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        super.testIgnored(description);
    }

    public MyListener() {
        super();
    }
}
