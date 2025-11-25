import de.ba.experiment.PalindromeChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PalindromeCheckerTest {

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("anna"));
    }

    @Test
    public void nonPalindrome_returnsFalse() {
        assertFalse(PalindromeChecker.isPalindrome("hallo"));
    }

    @Test
    public void mixedCasePalindrome_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("Anna"));
    }

    @Test
    public void palindromeWithSpaces_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("Lager Regal"));
    }

    @Test
    public void palindromeWithSpacesAndUpperLower_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("Relief Pfeiler"));
    }

    @Test
    public void emptyString_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void singleCharacter_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("x"));
    }

    @Test
    public void onlySpaces_returnsTrue() {
        // Nach Entfernen der Leerzeichen bleibt ein leerer String übrig -> Palindrom
        assertTrue(PalindromeChecker.isPalindrome("   "));
    }

    @Test
    public void nullInput_returnsFalse() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

}
