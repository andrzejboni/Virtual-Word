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

