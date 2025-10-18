# SuperLeagueChampionClient

Εφαρμογή Java που συνδέεται με ένα PHP REST service (`getSLChampion.php`) και λαμβάνει δεδομένα για τους πρωταθλητές της Super League σε μορφή JSON.

# Εκτέλεση
1. Τρέξε το PHP αρχείο `getSLChampion.php` σε κάποιον web server
2. Εκτέλεσε την Java εφαρμογή
3. Εισήγαγε την IP του server όταν ζητηθεί
4. Δες τα αποτελέσματα στην κονσόλα

# Δομή
src/
├── Main.java
├── Champion.java
└── ChampionsList.java
lib/
└── unirest-java-1.4.9.jar
