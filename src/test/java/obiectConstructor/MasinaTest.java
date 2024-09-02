package obiectConstructor;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MasinaTest {

    @Test
    public void testMasinaMetoda(){
//        Masina Dacia = new Masina("Dacia", "Duster",2000,"rosu",
//                Arrays.asList("-Aer conditionat","-Airbag","-Radio","-Incalzire scaun"),"benzina");
//        Dacia.prezentareMasina();
//        Dacia.calculImpozit();
//        System.out.println();
//
//
//        Masina viitoare = new Masina("Honda", "Accord",2005,"albastru",
//                Arrays.asList("-Aer conditionat","-Airbag","-Radio","-Incalzire scaun"),"diesel");
//        viitoare.prezentareMasina();
//        viitoare.calculImpozit();
//        System.out.println();

        Masina viitoare1 = new Masina("Kia", "Sportage",2024,"rosu",
                Arrays.asList("-Aer conditionat","-Airbag","-Radio","-Incalzire scaun"),"benzina + electric", 25800);
        viitoare1.prezentareMasina();
        viitoare1.calculImpozit();
        viitoare1.calculReducere(10);





        }
    }

