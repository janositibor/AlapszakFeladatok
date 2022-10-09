## Webshop (Adatbáziskezelés, 20 pont)

Ebben a feladatban termékeket és eladásokat fogunk kezelni.<br>
Egy terméknek van egy egyedi azonosítója (adatbázis generálja), egy neve, egy ára és egy darabszáma. Készítsd el a `ProductRepository`
osztályt, mely az adatbázissal való kommunikációért felelős. Legyen benne egy  `long insertProduct(String productName, int price, int stock)`
metódus, amivel egy terméket be tudok szúrni a `products` táblába, és visszaadja az adatbázis által generált kulcsot. Legyen továbbá egy ` Product findProductById(long id) ` metódus,
amivel id alapján tudom lekérdezni a termékeket, valamint egy `void updateProductStock(long id, int amount)`, amivel pedig az id alapján kikeresett termék stock értékét tudom csökkenteni az `amount`-ban átadott értékkel.<br>
 
Készítsd el a `ProductService` osztályt, melynek attribútuma egy `ProductRepository`, amit konstruktorban kap meg.
Legyen benne egy `void saleProduct(long id, int amount)` metódus, ami megkeresi a terméket, megnézi, hogy van-e belőle elég: 
ha nem, akkor kivételt dob, ha igen, akkor csökkenti a mennyiséget. 

Figyelj arra, hogy az adatbázis elérési paramétereit a teszteléshez megfelelően állítsd be!
