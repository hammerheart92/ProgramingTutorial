package temaSportiv;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SportivMetodaTest {

    @Test
    public void metodaTest(){

        Sportiv sportiv = new Sportiv("Backham","David",45,"Manchester United",true,
                Arrays.asList("-Mijlocas","-Fundas","-Atacant"),900000.443,0.0,"Sir Alex Ferguson");
        sportiv.prezentareSportiv();
        System.out.println();

        sportiv.actualizareBonusuri(9.5);

        sportiv.calculSalariuTotal();

        sportiv.prezentareSportiv();

    }
}
