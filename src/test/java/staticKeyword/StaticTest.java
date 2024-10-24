package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev elev = new Elev("Apaczai", "Laszlo");
        elev.prezenta();
        Elev elev1 = new Elev("Dragan", "Razvan");
        elev1.prezenta();
        Elev elev2 = new Elev("Balasz", "Csaba");
        elev2.prezenta();

    }
}
