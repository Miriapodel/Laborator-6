Am definit urmatoarea structura:

In Application am afisat meniul si am preluat tipul de comanda
apoi toate comenzile sunt preluate de StorageService
in StorageService am facut in continuare citiri de la tastatura cu scanner.

In StorageService am conectat un alt serviciu numit DatabaseService. 
DatabaseService primeste cereri catre baza de date.

In folderul repository avem cele 2 conexiuni catre baza de date:
ProfessorRpository si StudentRepository
ProfessorRpository contine lista professors + operatii pe ea.
StudentRepository contine lista students + operatii pe ea.
Momentan stocarea se face in listele students si professors.