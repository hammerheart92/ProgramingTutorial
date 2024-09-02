package obiectConstructor;

import java.util.List;

public class Masina {

    //constructor = are ca rol sa initializeze variabilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constructori care se diferentiaza numarul/tipul de parametri
    //o clasa contine intotdeauna un constructor default (nu are parametrii)
    //exista 2 tipuri de contructori cu paramertii sau fara parametrii

    //obiect egal instanta unei clase
    //dintr-o clasa putem sa difinim mai multe obiecte care sa aibe valori diferite pentru proprietati
    //in momenutl cand avem un obiect de tipul unei clase putem accesa variabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"
    //structura: tipObiect numeObiect = new tipObiect(); (Masina Dacia = new Masina();

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    public Masina(String marca, String model, int an, String culoare,
                  List<String> dotariInterioare, String motorizare) {

        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;

    }

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina() {

        System.out.println("marca masinii este: " + marca);
        System.out.println("modelu masinii este: " + model);
        System.out.println("anul fabricatiei este: " + an);
        System.out.println("culoarea masinii este: " + culoare);
        System.out.println("dotariile interioare sunt: ");
        for (int index = 0; index < dotariInterioare.size(); index++) {
            System.out.println(dotariInterioare.get(index));
        }
        System.out.println("Motorizare: " + motorizare);
        calculPret();


    }


    //determinam impozitul in functie de anul de fabricatie
    //<2000--500 Ron
    //2005<x<2015--300 Ron
    //2020<--100 Ron
    public void calculImpozit() {
        if (an <= 2000) {
            System.out.println("Impozitul pe masina este 500 Ron ");
        } else if (an >= 2005 && an <= 2015) {
            System.out.println("Impozitul pe masina este 300 Ron");
        } else if (an > 2020) {
            System.out.println("Impozitul pe masina este 100 Ron");

        }
    }

    //determinam pretul standard si pretul final in functie de dotariile masinii
    public void calculPret() {
        if (pret != 0) {
            System.out.println("Pretul de pornire: " + pret);
        }
        if (dotariInterioare.isEmpty()) {
            System.out.println("Pretul final este " + pret);
        } else {
            //este indicat sa fie facuta o variabila dupa blocul conditional else nu va face pretul final va calcula separat dotariile masinii + pretul final!
            //in cazuri vom modifica dotari = dotari
            int dotari=0;
            for (int index = 0; index < dotariInterioare.size(); index++) {
                switch (dotariInterioare.get(index)) {
                    case "-Aer conditionat":
                        dotari = dotari + 600;
                        break;
                    case "-Airbag":
                        dotari = dotari + 1000;
                        break;
                    case "-Radio":
                        dotari = dotari + 350;
                        break;
                    case "-Incalzire scaun":
                        dotari = dotari + 750;
                        break;

                }

            }
            System.out.println("Pretul dotariilor este: " + dotari);
            pretFinal=pret+dotari;
            System.out.println("Pretul final este: "+pretFinal);
        }
    }

    public void calculReducere(int procentReducere){
        pretFinal=((100-procentReducere)*pretFinal)/100;
        System.out.println("Sa aplicat o reducere de "+procentReducere+ "din pretul final.");
        System.out.println("Pretul final cu reducere este:"+pretFinal);

    }
}











