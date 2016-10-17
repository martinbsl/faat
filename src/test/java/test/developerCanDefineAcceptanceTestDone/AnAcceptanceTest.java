package test.developerCanDefineAcceptanceTestDone;

import de.busley.ang.AcceptanceTest;
import de.busley.ang.Done;
import org.testng.annotations.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Martin Busley
 */
@SuppressWarnings("groupsTestNG")
@Test
@AcceptanceTest
public class AnAcceptanceTest {

    @Test(groups = "failingTest_Done")
    @Done
    public void failingTest_Done() {
        assertThat(true).isFalse();
    }

    @Test(groups = "failingTest_NotDone")
    public void failingTest_NotDone() {
        assertThat(true).isFalse();
    }

    @Test(groups = "succeedingTest_Done")
    @Done
    public void succeedingTest_Done() {
        assertThat(true).isTrue();
    }

    @Test(groups = "succeedingTest_NotDone")
    public void succeedingTest_NotDone() {
        assertThat(true).isTrue();
    }
}
