package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi: array, list, set, map


    @Test
    public void metodaTest() {
        //cursantiArray();
        //cursantiList();
        //listaMasini();
        //listaTelefoane();
        //listaPiesebarometru();
        //mapExaple();
        //tariOrase();
        caietRetete();


    }

    //afisam cursanti din cursul de automation
    public void cursantiArray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Rares";
        cursanti[1] = "Cristina";
        cursanti[2] = "Radu";
        cursanti[3] = "Magda";
        cursanti[4] = "Laszlo";
        cursanti[5] = "Andrei";
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("numele cursantului este: " + cursanti[index]);
        }
    }

    //v2 - List
    //Lista in loc de lenght are size
    //intr-o lista elementul il accesezi cu .get
    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Cristina");
        cursanti.add("Radu");
        cursanti.add("Magda");
        cursanti.add("Laszlo");
        cursanti.add("Andrei");
        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("numele cursantului este: " + cursanti.get(index));
        }
    }

    //afisam o multime de masini
    //definim o multime de masini din care afisam doar masiniile pe pozitii impare
    public void listaMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Mazda");
        masini.add("BMW");
        masini.add("Opel");
        masini.add("Dacia");
        masini.add("Honda");
        for (int index = 0; index < masini.size(); index++) {
            if (index % 2 != 1) {
                System.out.println("numele masinii este: " + masini.get(index));
            }
        }


    }

    //afisam o multime de telefone
    public void listaTelefoane() {
        List<String> telefoane = new ArrayList<>();
        telefoane.add("Iphone 15 pro max");
        telefoane.add("Samsung Galaxy 23SE");
        telefoane.add("Motorola Edge 50 Pro");
        telefoane.add("Xiaomi Redmi 10");
        telefoane.add("Huawei Pura 70 Pro");
        telefoane.add("Oppo Reno 12 Pro");
        telefoane.add("Nokia Lumia 520");
        for (int index = 0; index < telefoane.size(); index++) {
            System.out.println("Telefoanele sunt: " + telefoane.get(index));

        }


    }

    //Emerson barometre
    public void listaPieseBarometru() {
        List<String> barometru = new ArrayList<>();
        barometru.add("Flansa Dp0001-2023-S6");
        barometru.add("Diafragma");
        barometru.add("Display");
        barometru.add("Bord");
        barometru.add("Seal");
        barometru.add("Lower Hausing");
        barometru.add("Capilar");
        barometru.add("Ceas");
        barometru.add("Electronica");

        for (int index = 0; index < barometru.size(); index++) {
            System.out.println("Barometrele cu piesele respective sunt: " + barometru.get(index));

        }


    }

    //map: key=value
    //parcurgerea se face pe baza cheilor(folosing un set)
    public void mapExaple() {
        Map<String, String> element = new HashMap<>();
        element.put("Masina", "Dacia");
        element.put("Persoana", "Laszlo");
        element.put("Telefon", "Samsung");
        for (String key : element.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + element.get(key));
        }
    }

    //afisam tara cu anumite orase
    public void tariOrase() {
        Map<String, List<String>> obiecte = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj-Napoca", "Bistrita", "Aiud", "Turda", "Suceava");
        List<String> oraseItalia = Arrays.asList("Roma", "Napoli", "Venetia", "Torino", "Milano");
        List<String> oraseNorvegia = Arrays.asList("Bergen", "Oslo", "Vestfold", "Lillehammer", "Alesund");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Norvegia", oraseNorvegia);

        for (String key : obiecte.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + obiecte.get(key));
        }
    }

    //ingrediente pentru retete de gatit

    public void caietRetete(){
        Map<String, List<String>> ingrediente = new HashMap<>();
        List<String> ingredienteSupaPui = Arrays.asList("Apa", "Piept de pui", "fidea", "Morcori", "Ceapa");
        List<String> ingredienteGulyas = Arrays.asList("Apa", "Fasole", "Ceapa", "Morcori", "Ardei", "Carne de porc");
        List<String> ingredienteClatite = Arrays.asList("Faina", "Lapte", "Banane", "Fineti");

        ingrediente.put("Supa Pui", ingredienteSupaPui);
        ingrediente.put("Gulyas", ingredienteGulyas);
        ingrediente.put("Clatite", ingredienteClatite);

        for (String key : ingrediente.keySet()) {
            System.out.println("Reteta este " + key);
            System.out.println("Ingredientele sunt " + ingrediente.get(key));
        }


    }
}

