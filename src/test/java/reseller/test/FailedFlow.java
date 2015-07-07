package reseller.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rusu on 3/24/15.
 */

public class FailedFlow extends BaseFlow {
    @Test
    public void failed_test() {
        Assert.fail("Failed!");
    }
}
