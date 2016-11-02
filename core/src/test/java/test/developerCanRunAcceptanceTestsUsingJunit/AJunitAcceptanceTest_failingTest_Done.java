package test.developerCanRunAcceptanceTestsUsingJunit;

import de.busley.ang.AcceptanceTest;
import de.busley.ang.Done;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Martin Busley
 */
@AcceptanceTest
public class AJunitAcceptanceTest_failingTest_Done {

    @Test
    @Done
    public void failingTest_Done() {
        assertThat(true).isFalse();
    }
}
