package tema;

import org.testng.annotations.Test;

public class Cars {

    public String marca;
    public String model;
    public String culoare;
    public int greutate;
    public double inaltime;
    public long kilometriiBord;
    public float lungime;
    public boolean areAbs;

    @Test
    public void metodaTest() {

        prezentareMasina("Honda", "Accord", "Rosu", 1200, 1.8, 5435435, 2.7f, true);
        prezentareMasina("Ford", "focus", "verde", 1870, 1.78,43434554, 1.9f,true );
        prezentareMasina("Renault","Scenic", "auriu", 1350, 1.97, 23443224, 2.23f,true);
        prezentareMasina("Mercesdes", "C Class", "rosu", 1230, 1.76, 6465546, 3f, true);


    }

    public void prezentareMasina(String param1, String param2, String param3, int param4, double param5, long param6, float param7, boolean param8) {

        System.out.println("marca masinii este: " + param1);
        System.out.println("modelul masinii este: " + param2);
        System.out.println("culoarea masinii este: " + param3);
        System.out.println("greutatea masinii este: " + param4);
        System.out.println("inaltimea masinii este: " + param5);
        System.out.println("kilomterii de bord al masinii sunt: " + param6);
        System.out.println("lungimea masinii este: " + param7);
        System.out.println("masina are ABS: " + param8);
        System.out.println();


    }


}

