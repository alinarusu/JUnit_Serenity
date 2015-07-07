package reseller.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import reseller.pages.TeamPage;

/**
 * Created by rusu on 3/24/15.
 */
public class TeamSteps extends ScenarioSteps {
    TeamPage teamPage;

    @Step
    public void clickAddButton() {
        teamPage.clickAddButton();
    }

    @Step
    public void addTeamMember(String teamMember) {
        teamPage.addTeamMember(teamMember);
    }

    @Step
    public void clickSendInvitationButton() {
        teamPage.sendInvitation();
    }

    @Step
    public void checkNewInvitationPending(String teamMember) {
        Boolean ok = teamPage.isPending(teamMember);
        if (ok == true) {
            System.out.println("OK!");
        } else System.out.println("Failed");
    }
}
