1. Instalare java 21
 se va instala
 https://www.oracle.com/java/technologies/downloads/#jdk21-windows

  Pe Windows
 In Edit environment variables for your account:
 se va adauga in Path calea catre folderul unde s-a instalat java
 se va seta JAVA_HOME ca fiind calea catre folderul in care s-a instalat Java

 se va deschide un command line si se va verifica instalarea:
 java -version

2. Instalare intellij  
   a. Obtinere Licenta intellij
    https://www.jetbrains.com/shop/eform/students
   
   b. downloadati intellij
   https://www.jetbrains.com/idea/

   c. Instalare licenta:
     Open your Intellij.
     Go to Help | Register and click Activate New License.
     In the Get license from section, select Activation code.
     Drag and drop the file with the activation code into the dialog or copy the code and paste it into the corresponding field.
     Click Activate.

 (aceasta versiune ar fi free dar varianta cu licenta are mai multe optiuni
 https://www.jetbrains.com/idea/download/?fromIDE=&section=windows)
 
3. Creare cont de GitHub
 https://github.com/

4. Instalare git
 https://git-scm.com/download/win
 In environment variables for your account, in PATH se adauga calea catre bin : exemplu C:\Program Files\Git\bin

 verificare: se deschide un command line si se scrie comanda
 
 git --version

5.
Extragerea materialului de pe acest git repository:

git clone https://github.com/Lomenita/242PAOuniv.git

6.
daca deja aveti extrasa o varianta mai veche, pentru a lua latest, din folderul 242PAOuniv se da urmatoarea comanda:

git fetch