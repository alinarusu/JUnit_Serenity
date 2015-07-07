package reseller.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import reseller.pages.DemoPage;

/**
 * Created by rusu on 3/24/15.
 */

public class DemoSteps extends ScenarioSteps {
    DemoPage demoPage;

    @Step("Se deschide pagina web: reseller/demo")
    public void openDemo() {
        demoPage.open();
    }

    @Step
    public void getStarted() {
        demoPage.launch_GetStarted();
    }

    public void waitABit() {
        demoPage.wait_A_Bit();
    }
}
