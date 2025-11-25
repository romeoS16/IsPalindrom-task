import de.ba.experiment.PalindromeChecker;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PalindromeCheckerTest {

    // In dieser Gruppe nutzen Sie das test-after-Prinzip:
    // 1. Implementieren Sie zuerst PalindromeChecker.isPalindrome(String text).
    // 2. Schreiben Sie danach eigene Tests für typische Fälle und Randfälle.

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    // TODO: weitere Testfälle ergänzen

}
