package exceptions;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Concept {

    @Test
    public void testMethod(){
//        printFile();
//        afisareColegi();
//        verificaVarsta(15);
//        printFileV2();
    }

    public void printFile(){
        String filePath = "E://fisier.txt";
        File file = new File(filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("A intrat pe ramura de try! fisierul exista");
        } catch (FileNotFoundException e) {
            System.out.println("A intrat in ramura de catch! fisierul nu exista");
        } finally {
            System.out.println("A intrat pe remura de finally! indiferent daca a mers sau nu pe catch tot se apeleaza si finally");
        }
    }

    public void afisareColegi(){
        String[] Colegi = new String[2];
        Colegi[0] = "Magda";
        Colegi[1] = "Raresh";
        Colegi[2] = "Radu";

        for (int index=0; index<Colegi.length; index++){
            System.out.println("Numele colegului este: " + Colegi[index]);
        }
    }

    public void verificaVarsta(int varsta){
        if (varsta<18){
            throw new RuntimeException("Persoana este minora");
        }else{
            System.out.println("Persoana este majora");
        }
    }

    public void printFileV2() throws FileNotFoundException {
        String filePath = "E://fisier.txt";
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
