package reseller.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import reseller.pages.ModalAddCustomerOrg;

/**
 * Created by rusu on 3/27/15.
 */

public class MAddCustomerOrgSteps extends ScenarioSteps {
    ModalAddCustomerOrg modalAddCustomerOrg;

    @Step
    public void setOrganizationName(String orgName) {
        modalAddCustomerOrg.setOrganizationName(orgName);
    }

    @Step
    public void selectMarketSegment(int index) {
        modalAddCustomerOrg.setSelectMarketSegment(index);
    }

    @Step
    public void setCountry(int indexCountry) {
        modalAddCustomerOrg.setCountry(indexCountry);
    }

    @Step
    public void setState(int indexState) {
        modalAddCustomerOrg.setCountry(indexState);
    }

    @Step
    public void setAddress1(String adr1) {
        modalAddCustomerOrg.setAddress1(adr1);
    }

    @Step
    public void setAddress2(String adr2) {
        modalAddCustomerOrg.setAddress2(adr2);
    }

    @Step
    public void setCity(String city) {
        modalAddCustomerOrg.setCity(city);
    }

    @Step
    public void setZipCode(String zipCode) {
        modalAddCustomerOrg.setZipCode(zipCode);
    }

    @Step
    public void setEmail(String email) {
        modalAddCustomerOrg.setEmail(email);
    }

    @Step
    public void setFirstNameF(String firstName) {
        modalAddCustomerOrg.setFirstName(firstName);
    }

    @Step
    public void setLastName(String lastName) {
        modalAddCustomerOrg.setLastName(lastName);
    }

    @Step
    public void setChooseAllow() {
        modalAddCustomerOrg.setChooseAllow();
    }

    @Step
    public void clickInviteCustomerButton() {
        modalAddCustomerOrg.clickInviteCustomerButton();
    }

}
