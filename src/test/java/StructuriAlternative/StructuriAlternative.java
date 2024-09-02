package StructuriAlternative;

import org.testng.annotations.Test;

import java.util.*;

public class StructuriAlternative {

    //In programare exista 2 tipuri de structuri :Alternative/repetitive
    //Structuri alternative: if...then...else/switch...case

    @Test
    public void metodaTest() {

        //verificaPersoanaMajora(17);
        //verificaPersoanaMajora(14);
        //verificaPersoanaMajora(17);
        System.out.println();
        //verificareNrPar(8);
        //verificareNrPar(3);
        //verificareNrPar(7);
        //verificareNrPar(20);
        //verificareNrPar(0);
        //verificareNrPar(-2);
        //verificareNrDivizibil(5);
        //verificareNrDivizibil(6);
        zileSaptamana(8);



    }

    public void verificaPersoanaMajora(int varsta) {
        ////facem o metoda care verifica daca o persoana este majora
        if (varsta >= 18) {

            System.out.println("Persoana cu varsta de: " + varsta + " este majora.");
        } else {

            System.out.println("Persoana cu varsta de: " + varsta + " este minora.");
        }

    }

    //verificam daca un nr este par si pozitiv
    //daca vrem catul unei impartiri => / (div)
    //daca vrem restul unei impartiri => % (mod)
    public void verificareNrPar(int nr) {
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este pozitiv si par");
            } else {
                System.out.println("Numarul " + nr + " este pozitiv si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este negativ si par");
            } else {
                System.out.println("Numarul " + nr + " este negativ si impar");
            }
        } else {
            System.out.println("Numarul " + nr + " este egal cu 0");

        }


    }

    //verificam daca un nr este pozitiv si divizibil cu 5
    public void verificareNrDivizibil (int numar){
        if (numar % 5==0 && numar > 0){
            System.out.println("numarul "+numar+" este divizibil si pozitiv.");
        }
        else {
            System.out.println("numarul "+numar+" nu este divizibil.");
        }
    }

    public void zileSaptamana(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile");


        }


    }

}





