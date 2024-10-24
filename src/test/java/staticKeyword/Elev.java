package staticKeyword;

public class Elev {

    public String nume;
    public String prenume;
    public static String scoala = "Bethlen Gabor Kollegium";
    public static int nrElevi = 0;

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        nrElevi++;
    }

    public void prezenta(){
        System.out.println("numele este: " + nume);
        System.out.println("prenumele este: " + prenume);
        System.out.println("scoala este: " + scoala);
        System.out.println("numarul de elevi de la scoala este:" + nrElevi);
    }
}
