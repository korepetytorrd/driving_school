# SzkolaJazdy

Konsolowa aplikacja dla szkoły jazdy
- logowanie do aplikacji 
- zapisywanie na jazdy
- przeglad progresu w kursie
- testy teoretyczne 
- 3 typu użytkowników admin, kursant, instruktor.

Admin:
- dodaje nowych użytkowników
- edycja uzytkowników
- usuwanie uzytkowników
- wyświetlenie użytkowników

Instruktor:
- dodanie jazd praktycznych
- edycja jazd praktycznych
- usuń jazd praktycznych
- wyświetlenie jazd praktycznych
- potwierdzenie odbycia jazd 


Kursant:
- wyswietla dostępne godziny jazd praktycznych
  - zapisuje sie 
  - anuluje
- przegląd progresu kursu (ilość odbytych jazd praktycznych, ilość przerobionych testów)
- przypomnienia o jazdach 
- rozwiazywanie testow

Bezpieczeństwo:
 - Logowanie do systemu 
   - md5  
   - zabezpieczenie captcha przed botami 
   - sol i pieprz 
   - 10 próby logowania do serwiu (10 bledy timeout na 5 min progrsywny)
   - 2 etapowe logowanie 
 - Sesja po zalogowaniu (czas bycia zalogowanym np 5 min później przedłużenie lub wylogowanie)
  