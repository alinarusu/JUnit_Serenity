package reseller.test;

import net.thucydides.core.annotations.Story;
import org.junit.Test;

/**
 * Created by rusu on 4/1/15.
 */
@Story(Story.class)

public class FirstFlow extends BaseFlow {

    @Test
    public void firstSimpleFlow() {
        demoSteps.waitABit();
        demoSteps.getStarted();
    }
}
