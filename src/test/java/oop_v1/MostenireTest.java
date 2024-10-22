package oop_v1;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void testMethod(){
        Angajat angajat = new Angajat("Apaczai", "Laszlo", 32, "Masculin", "Cluj-Napoca, Ciucas 9", "Vodafone",
                "IT",5000, "6 ani");

        angajat.infoAngajat();
//        System.out.println(angajat.getVarsta());
//        angajat.setVarsta(33);
//        System.out.println(angajat.getVarsta());

//        angajat.marire();
//        angajat.marire(10);
//        angajat.marire("inginer");
//        angajat.marire(10, "inginer");
//        System.out.println();
        angajat.ajungeLaTimpLaBirou();
        angajat.munceste();
        angajat.nuAreAbsente();
        angajat.respectaConcuita();

        Sportiv sportiv = new Sportiv("Popescu", "Vlad", 37, "Masculin", "Valcea", "Mui Tai", true, 7,true,11);

        sportiv.infoSportiv();
        sportiv.tineDietaSpecifica();
        sportiv.mergeLaAntrenamente();
        sportiv.nuSeDopeaza();
        sportiv.facePerformanta();
        System.out.println();
        Student student = new Student("Crainic", "Adrian", 33, "Masculin", "Aiud", "matematica - informatica",
                "IT", 4, true, false);

        student.infoStudent();

        student.mergeLaCursuri();
        student.trebuieSaStudieze();
        student.saNuAibaRestante();
        student.saStieSaCopieze();

    }
}
