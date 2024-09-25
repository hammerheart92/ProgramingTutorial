package oop_mostenire;

public class SportivAngajat extends Persoana implements SportivInterface, AngajatInterface{

    private String sport;
    private boolean sportEchipa;
    private int vechime;
    private boolean performata;
    private int medali;

    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public SportivAngajat(String nume, String prenume, int varsta, String sex, String adresa, String sport, boolean sportEchipa, int vechime,
                          boolean performata, int medali, String firma, String pozitie, int salariu, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.vechime = vechime;
        this.performata = performata;
        this.medali = medali;
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    @Override
    public void tineDietaSpecifica() {

    }

    @Override
    public void mergeLaAntrenamente() {

    }

    @Override
    public void nuSeDopeaza() {

    }

    @Override
    public void facePerformanta() {

    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConcuita() {

    }
}
