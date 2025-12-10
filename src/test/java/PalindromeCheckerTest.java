import de.ba.experiment.PalindromeChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PalindromeCheckerTest {

    // A: Spezialfälle

    @Test
    public void nullInput_returnsFalse() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    @Test
    public void emptyString_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void onlySpaces_returnsTrue() {
        // Nach Entfernen der Leerzeichen bleibt ein leerer String übrig -> Palindrom
        assertTrue(PalindromeChecker.isPalindrome("   "));
    }

    // B: Einfache Palindrome / Nicht-Palindrome


    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("anna"));
    }

    @Test
    public void nonPalindrome_returnsFalse() {
        assertFalse(PalindromeChecker.isPalindrome("hallo"));
    }

    @Test
    public void singleCharacter_isPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    // C: Groß-/Kleinschreibung ignorieren

    @Test
    public void mixedCasePalindrome_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("Anna"));
        assertTrue(PalindromeChecker.isPalindrome("aNnA"));
        assertTrue(PalindromeChecker.isPalindrome("Abba"));
    }

    @Test
    public void mixedCaseNonPalindrome_returnsFalse() {
        assertFalse(PalindromeChecker.isPalindrome("AnNaX"));
    }

    // D: Leerzeichen ignorieren

    @Test
    public void palindromeWithLeadingOrTrailingSpaces_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome(" anna"));
        assertTrue(PalindromeChecker.isPalindrome("anna "));
        assertTrue(PalindromeChecker.isPalindrome("a n n a"));
    }

    @Test
    public void palindromeWithSpaces_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("lager regal"));
    }

    @Test
    public void nonPalindromeEvenIfSpacesIgnored_returnsFalse() {
        assertFalse(PalindromeChecker.isPalindrome("lager regall"));
    }

    @Test
    public void palindromeWithSpacesAndUpperLower_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("Relief Pfeiler"));
    }


    // E: Ziffern, Satzzeichen & Spezialzeichen

    @Test
    public void numericPalindrome_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("1221"));
        assertTrue(PalindromeChecker.isPalindrome("1 2 2 1"));
    }


    @Test
    public void onlyPunctuation_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome(",..,..,"));
    }

    @Test
    public void specialLetters_returnsTrue() {
        assertTrue(PalindromeChecker.isPalindrome("&%&%&"));
    }

}
