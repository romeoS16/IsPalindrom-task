# Aufgabe – Palindrom (Gruppe B – TDD, keine KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** an einer Palindrom-Funktion.  
Sie schreiben zuerst Tests und entwickeln dann Schritt für Schritt die Implementierung.

---

## Aufgabe

Implementieren Sie in der Klasse [PalindromeChecker](src/main/java/de/ba/experiment/PalindromeChecker.java) die Methode

```java
public static boolean isPalindrome(String text){}
```

Die Methode soll true zurückgeben, wenn text ein Palindrom ist, sonst false.

Für diese Aufgabe gilt:
- Ein Palindrom liest sich vorwärts und rückwärts gleich.
- Groß-/Kleinschreibung wird ignoriert (z.B. "Anna" → Palindrom).
- Leerzeichen werden ignoriert (z.B. "Lager Regal" → Palindrom).
- Alle anderen Zeichen werden normal berücksichtigt.
- Ein leerer String ("") gilt als Palindrom.
- null gilt nicht als Palindrom (false).  

Schreiben Sie Tests in der [PalindromeCheckerTest](src/test/java/PalindromeCheckerTest.java) Klasse.

---

## Vorgehen (TDD: Red – Green – Refactor)

Arbeiten Sie in kleinen TDD-Schritten:

(1) **Red** – Test schreiben
- Formulieren Sie zunächst in PalindromeCheckerTest einen Testfall für einen einfachen Fall, z.B. "anna" → true.
- Führen Sie die Tests aus – der neue Test sollte zunächst fehlschlagen.

(2) **Green** – minimaler Code
- Implementieren Sie isPalindrome(...) so, dass der Test besteht.
- Schreiben Sie zunächst nur so viel Code wie nötig, um den Test grün zu bekommen.

(3) **Refactor** – aufräumen
- Verbessern Sie bei Bedarf Ihren Code (z.B. übersichtliche Schleife, Hilfsvariablen),
ohne das beobachtbare Verhalten zu ändern. Alle Tests müssen grün bleiben.

(4) Weitere Tests hinzufügen
- Ergänzen Sie weitere Testfälle 

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf PalindromeCheckerTest → Run 'PalindromeCheckerTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static boolean isPalindrome(String text)).
- Schreiben Sie konsequent Tests zuerst und lassen Sie sich von ihnen durch die Implementierung führen.

