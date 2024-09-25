package oop_mostenire;

public class Sportiv extends Persoana implements SportivInterface {

    private String sport;
    private boolean sportEchipa;
    private int vechime;
    private boolean performata;
    private int medali;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa, String sport, boolean sportEchipa, int experienta, boolean performata, int medali) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.vechime = experienta;
        this.performata = performata;
        this.medali = medali;
    }

    public void infoSportiv(){
        infoPersoana();
        System.out.println("sportul pe care il pratica este: " + sport);
        System.out.println("Sportivul face parte dintr-o echipa?: " + sportEchipa);
        System.out.println("experienta Sportivului este: " + vechime);
        System.out.println("practica sport de performata?: " + performata);
        System.out.println("medalii obtinute: " + medali);
    }

    public void mananca(){
        System.out.println("sportivul mananca dupa antrenament. ");
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public int getExperienta() {
        return vechime;
    }

    public void setExperienta(int experienta) {
        this.vechime = experienta;
    }

    public boolean isPerformata() {
        return performata;
    }

    public void setPerformata(boolean performata) {
        this.performata = performata;
    }

    public int getMedali() {
        return medali;
    }

    public void setMedali(int medali) {
        this.medali = medali;
    }

    public void manaca(){
        System.out.println("Sportivul mananca dupa antrenament. ");
    }

    @Override
    public void tineDietaSpecifica() {
        System.out.println("Tine dieta specifica");
    }

    @Override
    public void mergeLaAntrenamente() {
        System.out.println("Merge la antrenamente");
    }

    @Override
    public void nuSeDopeaza() {
        System.out.println("Nu se dopeaza");
    }

    @Override
    public void facePerformanta() {
        System.out.println("Face performanta");
    }
}
