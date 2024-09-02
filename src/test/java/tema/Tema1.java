package tema;

import org.testng.annotations.Test;

public class Tema1 {

    @Test
    public void metodaTest() {
        afisamHelloWorld();
        afisamVarsta();
        afisamNumePrenume();
        addMLaSalut();
        addHLaHello();
        addZLaVocalaFinalaZ();
        addMesajFinal();
        afisamSalariuAngajat();
        afisamIdSiDepartament();
        afisamNrDepartament(400);


    }

    //Afisam Hello World
    public void afisamHelloWorld() {
        String mesaj = "Hello World";
        System.out.println(mesaj);

    }

    //Afisam varsta
    public void afisamVarsta() {
        int varsta = 32;
        System.out.println(varsta);

    }

    //Afisam nume si prenume pe 2 randuri
    public void afisamNumePrenume() {
        String nume = "Apaczai";
        String prenume = "Laszlo";
        System.out.println(nume);
        System.out.println(prenume);
    }

    //Adaugam la Salut caracterul M la final
    public void addMLaSalut() {
        String mesaj = "Salut";
        String rezultat = mesaj + "M";
        System.out.println(rezultat);
    }

    //Adaugam la Hello caracterul H la inceput
    public void addHLaHello() {
        String mesaj = "Hello";
        String rezultat = "H" + mesaj;
        System.out.println(rezultat);
    }

    //Adaugam la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    public void addZLaVocalaFinalaZ() {
        String propozitie = "Ana are mere, pere, prune";
        String rezultat = propozitie.replaceAll("e\\b", "eZ")
                .replaceAll("a\\b", "aZ")
                .replaceAll("u\\b", "uZ");
        System.out.println(rezultat);
    }

    //Adaugam la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
    public void addMesajFinal() {
        String mesaj = "Poti pleca acasa dupa ce iti verific munca!";
        String[] rezultat = {
                "Hello World ",
                "Varsta ta: 32 ",
                "Apaczai ",
                "Laszlo ",
                "SalutM ",
                "HHello ",
                "AnaZ are mereZ, pereZ, pruneZ "
        };
        for (String rezultate : rezultat) {
            System.out.println(rezultate + mesaj);
        }
    }

    //Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
    public void afisamSalariuAngajat() {
        String prenume = "Andrei ";
        int salariu = 4000;
        if (prenume.equals(prenume)) {
            System.out.println("Salariul lui " + prenume + " este: " + salariu);

        }
    }

    //Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
    public void afisamIdSiDepartament() {
        String nume = "Popescu";
        int idAngajat = 1356765;
        String departament = "IT";
        if (nume.equals(nume)) {
            System.out.println("ID angajat: " + idAngajat);
            System.out.println("Departament: " + departament);
        }
    }

    //Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
    public void afisamNrDepartament(int numarDepartament) {
        if (numarDepartament > 287) {
            System.out.println("Numar departament: " + numarDepartament);
        }
    }


}










