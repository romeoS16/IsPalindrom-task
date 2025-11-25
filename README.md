# Aufgabe – Palindrom (Gruppe C – TDD + KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** und dürfen zusätzlich eine KI
(z.B. ChatGPT) unter klar definierten Bedingungen verwenden.  

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
- Ein leerer String ("") gilt als Palindrom.
- null gilt nicht als Palindrom (false).  

Schreiben Sie Tests in der [PalindromeCheckerTest](src/test/java/PalindromeCheckerTest.java) Klasse.

---

## Vorgehen (TDD: Red – Green – Refactor)

Grundsätzlich arbeiten Sie wie in Gruppe B:

(1) **Red** – Test schreiben
- Schreiben Sie zuerst eigene Testfälle in PalindromeCheckerTest

(2) **Green** – minimaler Code
- Implementieren Sie isPalindrome(...) so, dass Ihre Tests grün werden.

(3) **Refactor** – aufräumen
- Verbessern Sie Code und ggf. Tests, ohne das Verhalten zu ändern.  

(4) Ergänzen Sie nach und nach weitere Tests

---

## Nutzung von KI

Sie dürfen eine KI (z.B. ChatGPT) zur Unterstützung einsetzen – aber nur nach bestimmten Regeln:

(1) Wofür Sie KI verwenden dürfen
- Vorschläge für weitere Testfälle (z.B. Sonderfälle, Leerzeichen-Varianten)
- Ideen für eine saubere Implementierung (z.B. Vorverarbeitung des Strings, Schleifenlogik)
- Refactoring-Vorschläge (z.B. Hilfsmethoden, bessere Namen)

(2) KI-Log führen ([ki-log.md](./ki-log.md))
- Jede KI-Nutzung dokumentieren:
  - Datum/Uhrzeit
  - verwendeter Prompt
  - kurz: Was wurde übernommen? (z.B. „Alternative Schleifenlösung“, „Idee für Tests mit Leerzeichen“)  
  - Beispiel siehe [ki-log.md](./ki-log.md)  

(3) Wichtig:
- Sie sind verantwortlich, die KI-Vorschläge kritisch zu prüfen und ggf. anzupassen.
- Das spätere Quiz zur Einheit wird ohne KI bearbeitet.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf PalindromeCheckerTest → Run 'PalindromeCheckerTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Halten Sie sich an die vorgegebene Methodensignatur (public static boolean isPalindrome(String text)).
- Dokumentieren Sie jede KI-Nutzung vollständig in ki-log.md.
- Arbeiten Sie weiterhin im Sinne von TDD: Tests geben den Takt vor, nicht die KI.