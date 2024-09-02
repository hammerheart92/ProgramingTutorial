package obiectConstructor.Hotel;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HotelTest {

    @Test
    public void metodaHotelTest() {

        Map<String, String> oferta = new HashMap<>();
        oferta.put("Durata oferta", "15 zile");
        oferta.put("Perioada sedere", "7 nopti");
        oferta.put("Numar persoane", "4");
        oferta.put("Offseason", "Da");
        Hotel continental = new Hotel();
        continental.prezentareHotel();
        continental.pretOferta(oferta);


    }

}
