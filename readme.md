# Herkansing Unittesting/TDD 2023-2024

## Oefening 1 (15 punten)
In src/main/java/mastermind staat een class Checker
- Schrijf voor deze class de unittests.
- Refactor de functies getColor en hasColor
  - verplaats ze naar de class Four 
  - zorg dat alles blijft werken
  - vergeet de testen niet!
- Fix de bug: In het resultaat moeten de zwarte en witte vakjes bij elkaar gegroepeerd staan, niet door elkaar. 
  - Als het resultaat bijvoorbeeld ZWWZ is, dan moet dit WWZZ worden
- Fix de bug: Wanneer de code een dubbele kleur bevat, is het resultaat mogelijk fout. Dubbele codes zijn daarom niet toegelaten, zowel voor de code als voor de gok (guess).

## Oefening 2 (25 punten)
In een hotel kan een klant online reserveren.
* De klant kan **een of meerdere kamers** boeken, er zijn 3 verschillende kamertypes:
    * Standard: 200 EUR per nacht
    * With-a-view: 230 EUR per nacht
    * Duplex: 300 EUR per nacht
* De klant heeft ook de volgende **extra opties**:
    * Breakfast included: 20 EUR per persoon per nacht
    * Late checkout: 60 EUR per kamer (dit is niet per nacht)

Let op het volgende:
* De extra opties kunnen niet besteld worden als er (nog) geen kamer besteld is. In dat geval gooi je een Exception.
* Er is **geen** verschil in prijs voor de kamers als er 1 of 2 personen in de kamer verblijven.
* Breakfast moet besteld worden voor elke persoon apart, maar wel voor het totaal aantal nachten. Dus bvb:
    * 2 personen verblijven 1 nacht in 1 kamer: je roept 2x addToOrder op voor BREAKFAST. Dan betaal je in deze reservatie 2 Breakfasts.
    * 2 personen verblijven 3 nachten in 1 kamer: je roept 2x addToOrder op voor BREAKFAST. Dan betaal in je in deze reservatie 6 Breakfasts.
* Er kunnen maximum 2 personen in een kamer verblijven. Het is niet mogelijk om breakfast te bestellen voor meer personen. Als dat toch gebeurt moet er een Exception gegooid worden.
* Late checkout kan slechts 1 keer besteld worden per Reservation en die geldt dan voor alle kamers in de Reservation op het moment dat de totale prijs gevraagd wordt

-----
Maak hiervoor een **class Reservation** in **het package hotel_reservation**.

Je creëert een object van deze class met 1 constructor parameter:
* **int amountOfNights**.

De class Reservation heeft een functie **public int totalPrice()**.
Deze geeft het te betalen bedrag terug. Dit is een geheel getal, we moeten namelijk alle bedragen afronden.

De class Reservation heeft een functie **public void addToOrder(String product)**.
De string beschrijft wat de klant aanklikt op de website.
De mogelijkheden voor deze string zijn beperkt: “ROOM STANDARD”, “ROOM WITH A VIEW”, “DUPLEX ROOM”, “BREAKFAST”, “LATE CHECKOUT”.
Als er een andere String meegegeven wordt aan deze functie dan moet er een Exception gegooid worden.