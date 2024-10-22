package oop_v2;

public class Sportiv extends Persoana {

    private String sport;
    private boolean sportEchipa;
    private int vechime;
    private boolean performata;
    private int medali;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa, String sport, boolean sportEchipa, int vechime, boolean performata, int medali) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.vechime = vechime;
        this.performata = performata;
        this.medali = medali;
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
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}
