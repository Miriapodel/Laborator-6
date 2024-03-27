Am definit urmatoarea structura:

In Application am afisat meniul si am preluat tipul de comanda
apoi toate comenzile sunt preluate de StorageService.

In PersonService am facut in continuare citiri de la tastatura cu scanner.
(StorageService -> l-am redenumit in PersonService)

In PersonService am conectat un alt serviciu numit PersonDAOService.
PersonDAOService primeste cereri catre baza de date.
Momentan baza de date consta in listele de studenti si profesori aflate in ProfessorRpository si StudentRepository.

In folderul dao avem clase de tip dao (data access object). 
Acest dao este tot un design pattern (ca singletonul).
In folderul dao se pun clase care conecteaza repository-ul corespunzator 
+ mai fac niste prelucrari pe datele de intrare 
+ mai scriu mesaje 

In folderul repository avem cele 2 conexiuni catre baza de date:
ProfessorRpository si StudentRepository
In clasele de tip repository datele vin deja filtrate. Aceste clase nu scriu mesaje.

ProfessorRpository contine lista professors + operatii pe ea.

StudentRepository contine lista students + operatii pe ea.

Momentan stocarea se face in listele students si professors.
