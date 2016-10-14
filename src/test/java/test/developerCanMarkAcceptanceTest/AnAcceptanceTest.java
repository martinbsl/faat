package test.developerCanMarkAcceptanceTest;

import de.busley.ang.testng.AcceptanceTest;
import org.testng.annotations.Test;

import static de.busley.ang.fest.Conditions.foul;
import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Martin Busley
 */
@Test
@AcceptanceTest
public class AnAcceptanceTest {

    public void aFailingTest() throws Exception {
        assertThat("fair").is(foul());
    }

    public void aSuccessFulTest() throws Exception {
        assertThat(true).isTrue();
    }
}
