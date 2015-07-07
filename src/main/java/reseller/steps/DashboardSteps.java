package reseller.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import reseller.pages.DashboardPage;

/**
 * Created by rusu on 3/24/15.
 */

public class DashboardSteps extends ScenarioSteps {
    DashboardPage dashboardPage;

    @Step
    public void clickOnResellerTeam() {
        dashboardPage.launch_resellerTeam();
    }

    @Step
    public void clickOnLaunchOrganizationDetails() {
        dashboardPage.launch_organizationDetails();
    }

    @Step
    public void clickOnCustomers() {
        dashboardPage.launch_customers();
    }
}
