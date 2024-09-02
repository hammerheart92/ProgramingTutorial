package StructuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive: for/while/foreach/do...while
    @Test
    public void metodaTest(){
        afisareNumereFor(30);
        System.out.println();
        //afisamNumerePare(50);
        System.out.println();
        afisareNumereWhile(30);

    }

    //afisam primele n numere - for
    public void afisareNumereFor(int capat){
        for (int index =0;index<capat;index++){
            System.out.println("vreau sa fisez numarul "+index);
        }
    }
    //afisam primele n numere - while

    public void afisareNumereWhile(int capat){
        int index =0;
        while (index<capat){
            System.out.println("vreau sa fisez numarul "+index);
            index++;
        }
    }

    //afisam numerele pare de la 0 la 50

    public void afisamNumerePare(int capat){
        for (int index =0;index<capat;index++){
            if (index %2==0){
                System.out.println("Afisam numerele pare "+index);
            }
        }
    }
}
