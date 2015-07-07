package reseller.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import reseller.steps.*;

/**
 * Created by rusu on 3/27/15.
 */

@RunWith(SerenityRunner.class)
public class BaseFlow {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    @ManagedPages(defaultUrl = "https://reseller.adobe.com/demo")
    public Pages pages;
    @Steps
    public DemoSteps demoSteps;
    @Steps
    public DashboardSteps dashboardSteps;
    @Steps
    public TeamSteps teamSteps;
    @Steps
    public CustomersSteps customersSteps;
    @Steps
    public MPendingRequestSteps mPendingRequestSteps;
    @Steps
    public MPendingInvitationsSteps mPendingInvitationsSteps;
    @Steps
    public MNoProductsSteps mNoProductsSteps;
    @Steps
    public MAddCustomerOrgSteps mAddCustomerOrgSteps;

    protected String orgName = "Adobe";
    protected String adr1 = "Bucharest";
    protected String adr2 = "Madrid";
    protected String city = "Bucharest";
    protected String zipCode = "060029";
    protected String email = "my_username@gmail.com";
    protected String firstName = "User";
    protected String lastName = "Name";
    protected int index = 1;
    protected int indexCountry = 9;
    protected int indexState = 2;
    protected String teamMember = "my_username@adobe.com";

    @Before
    public void before() {
        demoSteps.openDemo();
        demoSteps.waitABit(1000);
    }
}
