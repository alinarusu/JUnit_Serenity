package reseller.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import reseller.pages.CustomersPages;

/**
 * Created by rusu on 3/24/15.
 */

public class CustomersSteps extends ScenarioSteps {
    CustomersPages customersPages;

    @Step
    public void clickAddButton() {
        customersPages.clickAddButton();
    }
}
