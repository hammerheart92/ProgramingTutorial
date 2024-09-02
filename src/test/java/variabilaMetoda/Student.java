package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //acesta este un comentariu
    //clasa = sablonul care defineste comportamentul unei entitati din viata reala
    //intr-un fisier java, recunoastem o clasa dupa cuvantul cheie "class"
    //este obligatoriu ca o clasa sa aiba un nume
    //intr-un fisier java putem avea mai multe clase diferentiate prin numele acestora (nu se poate face asa ceva niciodata!)
    //o clasa contine variabile si metode
    //variabila = proprietatea unei clase
    //variabila este de 2 feluri : globala si locala
    //variabila globala = variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    //variabila locala = pe care o definesti intr-o metoda care are vizibilitate doar in metoda respectiva
    //variabila globala trebuie sa contina acces control (public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //metoda = actiunea unei clase
    //o clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //metoda poate sa fie de doua feluri: void si return
    //o metoda ca void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebue sa contina: acces control (public) void numemetoda () {}

    @Test
    public void prezentareStrundet() {

        nume = "Apaczai";
        prenume = "Laszlo Istvan";
        varsta = 32;
        inaltime = 1.78;
        greutate = 64f;
        adresa = "Jud. Cluj, Loc. Cluj - Napoca, Nr. 9";
        sex = 'M';
        areRestante = true;

        //concatenare = lipirea a unu sau mai multe stringuri

        //System.out.print(nume+" "+prenume+" "+varsta);

        System.out.println("Numele stundetului este: "+nume);
        System.out.println("Prenumele stundetului este: "+prenume);
        System.out.println("Varsta stundetului este: "+varsta);
        System.out.println("Inatimea stundetului este: "+inaltime);
        System.out.println("Greutatea stundetului este: "+greutate);
        System.out.println("Adresa stundetului este: "+adresa);
        System.out.println("Sexul stundetului este: "+sex);
        System.out.println("Are restante: "+areRestante);

    }


}




