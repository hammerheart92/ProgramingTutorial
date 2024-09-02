package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    public String rasa;
    public Boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest() {


        prezentareAnimal("caine",true,"alb",6,24.8);
        prezentareAnimal("pisica",true,"negru",3,4.5);
        prezentareAnimal("urs",true,"brun",5,445);

    }

    public void prezentareAnimal(String param1,Boolean param2, String param3, int param4,double param5) {

        int pret = 60;
        System.out.println("Pretul animalului este: " +pret);
        System.out.println("Rasa animalului este: " + param1);
        System.out.println("Este mamifer: " + param2);
        System.out.println("Culoarea animalului este: " + param3);
        System.out.println("Varsta animalului este: " + param4);
        System.out.println("Greutatea animalului este: " + param5);
        System.out.println();

    }

}
