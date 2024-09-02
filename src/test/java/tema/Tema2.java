package tema;

import org.testng.annotations.Test;

public class Tema2 {

    @Test
    public void metodaTest() {
    //    cuvantDa5Ori();
      //  primele3nrDeLa1La3();
     //  afisamNrCelMaiMare();
        afisamNrCelMaiMic();


    }

    //Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    public void cuvantDa5Ori() {

        String rezultat = "";
        for (int index = 0; index < 5; index++) {
            rezultat += "Da ";

        }

        System.out.println(rezultat.trim()); //trim() elimina spatiul suplimentar la final


    }

    //Afisam in consola primele 3 numere de la 1 la 3;
    public void primele3nrDeLa1La3() {
        for (int index = 1; index <= 3; index++){
            System.out.println(index);
        }


    }

    //Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void afisamNrCelMaiMare(){
        int a = 15;
        int i = 20;
        int numarCelMaiMare = (a > i) ? a : i; //Am folosit operatorul ternar care determina care nr este mai mare operatorul ternar: condiție ? valoare_dacă_adevărată : valoare_dacă_falsă;
        System.out.println("Numarul cel mai mare dintre " + a + " si " + i + " este " + numarCelMaiMare);
    }

    //Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void afisamNrCelMaiMic(){
        double a = 4.5;
        double i = 3.25;
        double numarCelMaiMic = (a < i) ? a : i;
        System.out.println("Numarul cel mai mic dintre " + a + " si " + i + " este " + numarCelMaiMic);
        }
    }

    //Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");




