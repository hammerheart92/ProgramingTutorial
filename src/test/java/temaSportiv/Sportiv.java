package temaSportiv;

import java.util.List;

public class Sportiv {

    //definim proprietariile sportivului
    public String nume;
    public String prenume;
    public int varsta;
    public String echipa;
    public boolean esteCapitan;
    public List<String> pozitie;
    public double salariu;
    public double bonusuri;
    public String antrenor;


    public Sportiv(String nume, String prenume, int varsta, String echipa, boolean esteCapitan,
                   List<String> pozitie, double salariu, double bonusuri, String antrenor) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.echipa = echipa;
        this.esteCapitan = esteCapitan;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.bonusuri = bonusuri;
        this.antrenor = antrenor;
    }



    public double calculSalariuTotal(){
        return salariu+bonusuri;
    }

    public void actualizareBonusuri(double performata){
        if (performata>8.0){
            bonusuri = salariu * 0.20;
            System.out.println("Performanta sportivului este: "+performata);
        }else {
            bonusuri = 0.0;
        }
    }


    public void prezentareSportiv() {
        System.out.println("Numele sportivului este: " + nume);
        System.out.println("Prenumele sportivului este: " + prenume);
        System.out.println("Varsta sportivului este: " + varsta);
        System.out.println("Echipa in care joaca sportivul este: " + echipa);
        System.out.println("Sportivul este capitan: " + esteCapitan);
        System.out.println("Antrenorul sportivului este: " + antrenor);
        System.out.println("Bonusuri: " + bonusuri);
        for (int index = 0; index < pozitie.size(); index++) {
            System.out.println(pozitie.get(index));
        }
        System.out.println("Salariul total este: " + calculSalariuTotal());
    }


}

