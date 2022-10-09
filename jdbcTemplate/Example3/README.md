## Vonatok (Adatbáziskezelés, 20 pont)

A `trains` táblában a következő adatok találhatók: a vonat célállomása, indulási idő (pl: 2022.03.11 12:30), maximum kapacitás és
a már jegyet váltott utasok száma. 
A migrációs sql fájl elnevezéseinek megfelelően hozd létre a `Train` osztályt, melynek adattagjai legyenek a tábla oszlopai!

A `TrainRepository` osztályban valósítsd meg a `long insertTrain(String destination, LocalDateTime departure, int maxCapacity)` metódust,
mellyel egy vonatot lehet beszúrni a táblába! A `number_of_passengers` alapértéke ilyenkor 0. A beszúrást követően adjuk vissza az adatbázis által
generált egyedi azonosítót!
Készíts egy `Train findById(long id)` metódust mely id alapján visszaad egy vonatot! Készíts egy
`List<Train> getTrainsByDestination(String destination)` metódust, ami célállomás alapján visszaadja az összes vonatot, időpont szerint növekvő sorrendben!
És legyen még benne egy `void updateNumberOfPassengersById(long id, int amount)` metódus, ami az eddigi utasszámhoz a megfelelő id-jú vonaton hozzáadja
a paraméterül kapott mennyiséget!

Készíts egy `TrainService` nevű osztályt, mely egy repository objektumot kap konstruktorban! Legyen benne egy
`Train buyTicketForTrain(String destination, int amount)` metódus, ami először lekéri az összes vonatot célállomás szerint,
majd megpróbál sorban jegyet venni. Jegyet akkor tud venni, ha a vásárolni kívánt mennyiséggel, nem haladja meg az utasok száma
a vonat maximum kapacitását. Az első olyan vonatnál, ahol ez a feltétel teljesül, növeljük az utasok számát (használva a repository már létező metódusát) 
és térjünk vissza a már módosított értéket tartalmazó vonattal!
Ha egyik vonatra sem sikerül jegyet vennie, dobj `IllegalStateException`-t!
