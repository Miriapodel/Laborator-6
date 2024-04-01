Am definit urmatoarea structura:

In Application am afisat meniul si am preluat tipul de comanda
apoi toate comenzile sunt preluate de PersonService.

(StorageService -> l-am redenumit in PersonService)

In PersonService am facut in continuare citiri de la tastatura cu scanner.

In PersonService am conectat un alt serviciu numit PersonRepositoryService.
PersonRepositoryService primeste cereri catre repository urile care conecteaza baza de date.
Momentan baza de date consta in listele de studenti si profesori aflate in ProfessorDao si StudentDao.

In folderul dao avem clase de tip dao (data access object). 
Acest dao este tot un design pattern (ca singletonul).
In folderul dao se pun clase care:
- conecteaza repository-ul corespunzator 
- fac interogari

In folderul dao avem cele 2 conexiuni catre baza de date:
ProfessorDao si StudentDao
In clasele de tip repository datele vin deja filtrate. Aceste clase nu scriu mesaje.

ProfessorDao contine lista professors + operatii pe ea.

StudentDao contine lista students + operatii pe ea.

Clasele dao au listele de persoane. 
Observati ca aceste clase au variabilele clasei private static, sunt initializate inline si ca nu au constructor.
Sunt statice astfel incat daca se face accesarea lor din diverse alte clase sa nu se reinitializeze obiectele care stocheaza.

Momentan stocarea se face in listele students si professors.
