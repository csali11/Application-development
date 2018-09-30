# TO-DO lista

# Funkcionális követelmények:
A funkciók elérése autentikációhoz kötött. A családtagoknak van egy felhasználó neve és egy jelszava,
amivel a teendőiket tudják kezelni, megnézni. Bejelentkezés után lesznek elérhetőek a funkciók.
Sikeres bejelentkezés után a felhasználó a kezdőoldalra kerül, innen tud tovább navigálni.
Ha a bejelentkezés sikertelen volt, a felhasználót értesíteni kell erről.
Lehetőség van feladatok és eszközök hozzáadására, törlésére, módosítására, szűrésére, listázására, feladatok állapotának változtatására.

# Nem funkcionális követelmények:
Könnyen kezelhető, áttekinthető felhasználói felület.
Reszponzív megjelenés biztosítása különböző platformokon.

# Szakterületi fogalomjegyzék:
Teendő - a feladat, amit a személynek meg kell csinálnia
Teendő hozzáadása - a családtagnak lehetősége van feladatokat felvenni
Teendő kipipálása - a családtag ezzel jelezheti, hogy a teendőt elvégezte
Eszköz - adott teendőhöz szükséges használati tárgy

# Szerepkörök:
Gyerek - olyan családtag, aki listázhat, adhat hozzá teendőt, eszközt, kipipálhat teendőt
Szülő - olyan családtag, aki listázhat, adhat hozzá teendőt, eszközt, kipipálhat teendőt, módosíthat meglévő teendőt és törölhet
