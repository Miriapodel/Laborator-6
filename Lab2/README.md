Introducere in limbajul Java

Java este un limbaj de programare:

orientat pe obiecte => paradigma de programare bazata pe folosirea obiectelor, ce contin date si metode; 

in Java, definitia unui obiect se numeste clasa; obiectul este o instanta a unei clase

case sensistive

portabil, independent de platforma - datorita JVM (Java virtual machine)

codul de java este compilat intr-un format intermediar (Java bytecode), care apoi este interpretat de catre JVM

.java (fisier cod sursa) => javac (compilator) => .class (fisier bytecode) =>java (interpretor, emulator de cod bytecode = JVM)

JVM = Java Virtual Machine 

JRE = Java Runtime Environment - contine tot ce e nevoie pentru a putea rula programe Java (inclusiv JVM) 

JDK = Java Development Kit - contine tot ce e nevoie pentru a putea crea programe java (inclusiv tot ce contine JRE)


'class' = cuvant cheie ce semnaleaza definitia unei clase
 De obicei, clasa este definita intr-un fisier cu acelasi nume (insa nu intotdeauna)
 Ex1_Primitive = numele clasei
 Reguli:
 - nu poate incepe cu numere (dar poate contine numere)
 - nu poate coincide cu cuvinte cheie (eg: 'package')
 - nu poate contine spatii si caractere speciale (exceptie "$" si "_")
 Conventii
 - camel case
 - incepe cu litera mare
 - substantive

Clasele din Java sunt organizate in pachete.
Cuvantul cheie 'package' => de obicei pe prima linie, si defineste pachetul in care se afla clasa
Clasa Main nu are nici un package definit => este inclusa in pachetul implicit, numit "default"
Ca si buna practica, este bine sa denumim intotdeauna pachetele.

 Pentru a folosi clase din alte pachete fata de cel curent => folosim cuvantul cheie import
 java.lang => pachet special din Java ce nu trebuie importat
 (de exemplu, clasa System folosita pentru a printa mesaje in consola, face parte din acest pachet)
