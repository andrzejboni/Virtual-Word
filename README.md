# Virtual-Word

Celem projektu jest implementacja programu o charakterze symulatora wirtualnego świata, który ma mieć strukturę dwuwymiarowej kraty o dowolnym, zadanym przez użytkownika rozmiarze NxM. W świecie tym będą istniały proste formy życia o odmiennym zachowaniu. Każdy z organizmów zajmuje dokładnie jedno pole w tablicy, na każdym polu może znajdować się co najwyżej jeden organizm (w przypadku kolizji jeden z nich powinien zostać usunięty lub przesunięty).

Symulator ma mieć charakter turowy. W każdej turze wszystkie organizmy istniejące na świecie mają wykonać akcję stosowną do ich rodzaju. Część z nich będzie się poruszała (organizmy zwierzęce), część będzie nieruchoma (organizmy roślinne). W przypadku kolizji (jeden z organizmów znajdzie się na tym samym polu, co inny) jeden z organizmów zwycięża, zabijając (np. wilk) lub odganiając (np. żółw) konkurenta. Kolejność ruchów organizmów w turze zależy od ich inicjatywy. Pierwsze ruszają się zwierzęta posiadające najwyższą inicjatywę. W przypadku zwierząt o takiej samej inicjatywie o kolejności decyduje zasada starszeństwa (pierwszy rusza się dłużej żyjący). Zwycięstwo przy spotkaniu zależy od siły organizmu, choć będą od tej zasady wyjątki (patrz: Tabela 2). Przy równej sile zwycięża organizm, który zaatakował. Specyficznym rodzajem zwierzęcia ma być Człowiek. W przeciwieństwie do zwierząt, człowiek nie porusza się w sposób losowy. Kierunek jego ruchu jest determinowany przed rozpoczęciem tury za pomocą klawiszy strzałek bądź odpowiednich liter na klawiaturze. Człowiek posiada też specjalną umiejętność (patrz Załącznik 1) którą można aktywować osobnym przyciskiem. Aktywowana umiejętność pozostaje czynna przez 5 kolejnych tur, po czym następuje jej dezaktywacja. Po dezaktywacji umiejętność nie może być aktywowana przed upływem 5 kolejnych tur. Przy uruchomieniu programu na planszy powinno się pojawić po kilka sztuk wszystkich rodzajów zwierząt oraz roślin. Program oprócz prezentowania obecnego stanu planszy, powinien także wypisywać informacje o rezultatach walk, spożyciu roślin i innych zdarzeniach zachodzących w świecie.


Należy utworzyć klasę Swiat zarządzającą rozgrywką i organizmami. Powinna zawierać m.in. metody, np:
*	wykonajTure()
*	rysujSwiat() oraz pola, np.:
*	organizmy
Należy również utworzyć abstrakcyjną klasę Organizm. podstawowe pola:
*	siła
*	inicjatywa
*	położenie (x,y).
*	świat - referencja do świata w którym znajduje się organizm podstawowe metody:
*	akcja() ^ określa zachowanie organizmu w trakcie tury,
*	kolizja() ^ określa zachowanie organizmu w trakcie kontaktu/zderzenia z innym organizmem,
*	rysowanie() ^ powoduje narysowanie symbolicznej reprezentacji organizmu.

Klasa Organizm powinna być abstrakcyjna. Dziedziczyć po niej powinny dwie kolejne 
abstrakcyjne klasy: Roślina oraz Zwierzę.

W klasie Zwierze należy zaimplementować wspólne dla wszystkich/większości zwierząt zachowania, przede wszystkim:
*	podstawową formę ruchu w metodzie akcja() ^ każde typowe zwierzę w swojej turze przesuwa się na wybrane losowo, sąsiednie pole,
*	rozmnażanie w ramach metody kolizja() ^ przy kolizji z organizmem tego samego gatunku nie dochodzi do walki, oba zwierzęta pozostają na swoich miejscach, koło nich pojawia się trzecie zwierzę, tego samego gatunku.

Klasa Człowiek ma stanowić rozszerzenie klasy Zwierzę. Nie posiada on własnej inteligencji (sterowany jest przez gracza) oraz nie rozmnaża się (gracz będzie jedynym Człowiekiem na mapie).

![image](https://user-images.githubusercontent.com/11943355/72160806-405f9f00-33bf-11ea-962a-bf8d4f975bd7.png)

![image](https://user-images.githubusercontent.com/11943355/72160821-46ee1680-33bf-11ea-9896-38a08a3af0a9.png)

W klasie Roślina zaimplementuj wspólne dla wszystkich/większości roślin zachowania, przede wszystkim:
* symulacja rozprzestrzeniania się rośliny w metodzie akcja() ^ z pewnym prawdopodobieństwem każda z roślin może „zasiać" nową roślinę tego samego gatunku na losowym, sąsiednim polu.
Wszystkie rośliny mają zerową inicjatywę.
Zaimplementuj 4 klasy roślin. Rodzaje roślin definiuje poniższa tabela.


![image](https://user-images.githubusercontent.com/11943355/72160831-4c4b6100-33bf-11ea-83b5-16a82efd3c65.png)

Stwórz klasę Świat w której skład wchodzą obiekty klasy Organizm . Zaimplementuj przebieg tury, wywołując metody akcja() dla wszystkich organizmów oraz kolizja() dla organizmów na tym samym polu. Pamiętaj, że kolejność wywoływania metody akcja() zależy od inicjatywy (lub wieku, w przypadku równych wartości inicjatyw) organizmu.
Organizmy mają możliwość wpływania na stan świata. Dlatego istnieje konieczność przekazania metodom akcja() oraz kolizja() parametru określającego obiekt klasy Świat . Postaraj się, aby klasa Świat definiowała jako publiczne składowe tylko takie pola i metody, które są potrzebne pozostałym obiektom aplikacji do działania. Pozostałą funkcjonalność świata staraj się zawrzeć w składowych prywatnych. 


![image](https://user-images.githubusercontent.com/11943355/72160843-53726f00-33bf-11ea-8f48-fc918a364c68.png)

Wskazówki projektowe:
Wizualizację świata należy przeprowadzić w konsoli. Każdy organizm jest reprezentowany przez inny symbol ASCII. Naciśnięcie jednego z klawiszy powoduje przejście do kolejnej tury, wyczyszczenie konsoli i ponowne wypisanie odpowiednich symboli, reprezentujących zmieniony stan gry. Co najmniej jedna linia tekstu w konsoli przeznaczona jest na raportowanie wyników zdarzeń takich jak jedzenie lub wynik walki.
Klasy i obiekty
1.	W projekcie należy użyć klas oraz wykorzystywać obiekty, nie jest dopuszczalne pisanie
"luźnych" funkcji (poza funkcją main)
2.	Logiczny podział na przestrzenie nazw - każda przestrzeń nazw w oddzielnym module
(pliku)
3.	Metody które nie wykorzystują obiektu powinny być statyczne. Nie należy ich nadużywać.
4.	Co najmniej jedna klasa abstrakcyjna Hermetyzacja:
1.	Wszystkie pola klas powinny być prywatne lub chronione (protected)
2.	Wybrane klasy powinny mieć metody typu get i set dla składowych lub tylko get, lub całkowity brak dostępu bezpośredniego
Dziedziczenie
1.	Przynajmniej 1 klasa bazowa po której dziedziczy bezpośrednio (w tym samym pokoleniu) kilka klas pochodnych
2.	Wielokrotne wykorzystanie kodu (kod w klasie bazowej używany przez obiekty klas pochodnych)
3.	Nadpisywanie metody klasy bazowej
4.	Jawne wywołanie metod z klasy bazowej mimo ich nadpisania w klasie pochodnej Inne wymagania
1.	Stan wszystkich obiektów powinien wczytywać i zapisywać się do pliku
2.	Zademonstrować obsługę wyjątków oraz zaimplementować przykładowe własne wyjątki
Styl programowania
1. Należy przestrzegać reguł związanych ze stylem programowania, przede wszystkim:
*	spójność nazewnictwa zmiennych i typów,
*	spójność w zakresie stosowania tabulacji (wcięcia) i odstępów,
*	ograniczony rozmiar funkcji,
*	zachowanie spójności w organizacji kodu źródłowego wewnątrz klasy (np. jednolita
kolejność public->protected->private).
