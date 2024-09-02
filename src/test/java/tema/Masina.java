package tema;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public String culoare;
    public int greutate;
    public double inaltime;
    public long kilometriiBord;
    public float lungime;
    public boolean areAbs;


    @Test
    public void prezentareMasina() {

        marca = "Honda";
        model = "Accord";
        culoare = "Albastru";
        greutate = 1200;
        inaltime = 1.6;
        kilometriiBord = 4005045004l;
        lungime = 2.8f;
        areAbs = false;

        System.out.println("Marca: "+marca);
        System.out.println("Model: "+model);
        System.out.println("Culoare: "+culoare);
        System.out.println("Greutate: "+greutate);
        System.out.println("Inaltime: "+inaltime);
        System.out.println("Kilometrii Bord: "+kilometriiBord);
        System.out.println("Lungime: "+lungime);
        System.out.println("Are abs: "+areAbs);


    }

}
