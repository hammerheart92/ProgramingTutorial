package obiectConstructor.Hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {

    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDeJun;
    public int etaje;
    public List<String> facilitati;
    public int pretPornire;


    public Hotel() {
        nume = "Continental";
        adresa = "Str.viilor 45";
        tara = "Romania";
        oras = "Sibiu";
        stele = "****";
        numarCamere = 65;
        micDeJun = true;
        etaje = 6;
        facilitati = Arrays.asList("Wifi,", "Tv", "Room Service", "Frigider", "Loc parcare");
        pretPornire = 1000;

    }

    public void prezentareHotel() {
        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Adresa hotelului este: " + adresa);
        System.out.println("Tara hotelului este: " + tara);
        System.out.println("Orasul in care se afla hotelulu este: " + oras);
        System.out.println("Numar Stele: " + stele);
        System.out.println("Numar camere: " + numarCamere);
        System.out.println("Mic dejul inclus: " + micDeJun);
        System.out.println("Numar etaje: " + etaje);
        System.out.println("Facilitatiile Hotelului Sunt: " + facilitati);
    }

    public void pretOferta(Map<String, String> oferta) {
        System.out.println("Pretul de pornire este: " + pretPornire);
        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calvuleaza pretul pe baza la diferite intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number > 5) {
                    pretPornire = pretPornire + 200;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 800;
                } else {
                    pretPornire = pretPornire + 850;
                }
            }
            if (optiune.equals("Perioada sedere")) {
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number > 5) {
                    pretPornire = pretPornire + 100;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 2000;
                } else {
                    pretPornire = pretPornire + 1750;
                }
            }
            if (optiune.equals("Numar persoane")) {
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number > 3) {
                    pretPornire = pretPornire + 800;
                }
                if (number == 3) {
                    pretPornire = pretPornire + 1000;
                } else {
                    pretPornire = pretPornire + 2500;
                }
            }
            if (optiune.equals("Offseason")) {
                if (oferta.get(optiune).equals("Da")) {
                    pretPornire = pretPornire - 1000;
                } else {
                    pretPornire = pretPornire + 500;
                }

            }
        }
        System.out.println("Pretul final este: " + pretPornire);
    }
}


