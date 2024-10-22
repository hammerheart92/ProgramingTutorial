package oop_v1;

public class Persoana {

    //oop = programare orientata obiect
    //4 principii = mostenire,abstractizare,incapuslare,polimorfism
    //mostenire = conceputl prin care clasa copil mosteneste clasa parinte
    //in mometul cand copilul mosteneste parintele trebuie sa apeleze constructorul din parinte
    //acest lucru se realizeaza cu super
    //mostenirea se face la nivel de clasa cu cuvantul "extends"
    //in java o clasa poate mosteni doar 1 singura clasa

    //incapsulare = conceptul prin care excludem anumite proprietati/metode
    //conceptul se poate aplica la orice nivel de clase(parinte sau copil)

    //polimorfism = conceptul prin care o metoda poate avea impelemntari diferite
    //de 2 feluri - static(overload( si dinamic(override)
    //dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //polimorfismul dinamic se regaseste doar cand este aplicat conceptul de mostenire

    //polimorfism static = actiunea prin care putem avea metode cu acelasi nume insa diferentierea fiind facuta prin numar/tip parametrii

    private String nume;
    private String prenume;
    private int varsta;
    private String sex;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    public void infoPersoana(){
        System.out.println("numele persoanei este: " + nume);
        System.out.println("prenumele persoanei este: " + prenume);
        System.out.println("varsta persoanei este: " + varsta);
        System.out.println("sexul persoanei este: " + sex);
        System.out.println("adresa persoanei este: " + adresa);
    }

    //polimorfism dinamic
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame. ");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getSex() {
        return sex;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

}
