package reseller.test;

import org.junit.Test;


/**
 * Created by rusu on 3/24/15.
 */

public class ThirdFlow extends BaseFlow {
    @Test
    public void ThirdFlow() {
        demoSteps.getStarted();
        dashboardSteps.waitABit(1000);
        dashboardSteps.clickOnCustomers();
        customersSteps.clickAddButton();
        mAddCustomerOrgSteps.setOrganizationName(orgName);
        mAddCustomerOrgSteps.selectMarketSegment(index);
        mAddCustomerOrgSteps.waitABit(1000);
        mAddCustomerOrgSteps.setCountry(indexCountry);
        mAddCustomerOrgSteps.waitABit(1000);
        mAddCustomerOrgSteps.setAddress1(adr1);
        mAddCustomerOrgSteps.setAddress2(adr2);
        mAddCustomerOrgSteps.setCity(city);
        mAddCustomerOrgSteps.waitABit(1000);
        mAddCustomerOrgSteps.setState(indexState);
        mAddCustomerOrgSteps.waitABit(1000);
        mAddCustomerOrgSteps.setZipCode(zipCode);
        mAddCustomerOrgSteps.setEmail(email);
        mAddCustomerOrgSteps.setFirstNameF(firstName);
        mAddCustomerOrgSteps.setLastName(lastName);
        mAddCustomerOrgSteps.setChooseAllow();
        mAddCustomerOrgSteps.clickInviteCustomerButton();
        mPendingInvitationsSteps.waitABit(1000);
        mPendingInvitationsSteps.isMemberAdded(email);
        mPendingInvitationsSteps.waitABit(1000);
    }
}
