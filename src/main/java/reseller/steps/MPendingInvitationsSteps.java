package reseller.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import reseller.pages.ModalPendingInvitations;

/**
 * Created by rusu on 3/24/15.
 */

public class MPendingInvitationsSteps extends ScenarioSteps {
    ModalPendingInvitations modalPendingInvitations;

    @Step
    public void isMemberAdded(String email) {
        Boolean ok = modalPendingInvitations.isMemberAdded(email);
        if (ok == true) {
            System.out.println("OK!");
        } else System.out.println("Failed");
    }
}
