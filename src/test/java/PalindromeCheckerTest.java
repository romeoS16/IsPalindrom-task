import de.ba.experiment.PalindromeChecker;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PalindromeCheckerTest {

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    // TODO: weitere Testfälle ergänzen

}
