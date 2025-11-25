# Aufgabe – Palindrom (Gruppe A – klassischer Ansatz / test-after)

In dieser Aufgabe implementieren Sie eine Methode, die prüft, ob ein Text ein Palindrom ist.  
Sie arbeiten nach dem **test-after-Prinzip**: Zuerst wird die Implementierung geschrieben, dann die Tests.

---

## Aufgabe

Implementieren Sie in der Klasse [PalindromeChecker](src/main/java/de/ba/experiment/PalindromeChecker.java)
die Methode

```java
public static boolean isPalindrome(String text){}
```  

Die Methode soll true zurückgeben, wenn text ein Palindrom ist, sonst false.

Für diese Aufgabe gilt:
- Ein Palindrom liest sich vorwärts und rückwärts gleich.
- Groß-/Kleinschreibung wird ignoriert (z.B. "Anna" → Palindrom).
- Leerzeichen werden ignoriert (z.B. "Lager Regal" → Palindrom).
- Alle anderen Zeichen (Buchstaben, Ziffern, Satzzeichen) werden so übernommen, wie sie sind.
- Ein leerer String ("") gilt als Palindrom.
- null gilt nicht als Palindrom (false).

Schreiben Sie Tests in der [PalindromeCheckerTest](src/test/java/PalindromeCheckerTest.java) Klasse.

---

## Vorgehen (test-after)

(1) Implementieren Sie zuerst die Methode PalindromeChecker.isPalindrome(String text) in [PalindromeChecker](src/main/java/de/ba/experiment/PalindromeChecker.java).

(2) Testen Sie Ihre Implementierung anschließend mit JUnit-Tests:
- Legen Sie Testfälle in [PalindromeCheckerTest](src/test/java/PalindromeCheckerTest.java) an.

(3) Führen Sie Ihre Tests regelmäßig aus und ergänzen Sie weitere Testfälle, wenn Sie Fehler finden.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf PalindromeCheckerTest → Run 'PalindromeCheckerTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static boolean isPalindrome(String text)).