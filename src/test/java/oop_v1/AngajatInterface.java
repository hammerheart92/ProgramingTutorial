package oop_v1;

public interface AngajatInterface {
    //Abstractizarea=conceptul prin care putem defini comportamentul unei clase
    //Abstractizarea se poate face prin 2 feluri: interfete si clase abstracte
    //interfata doar metode abstracte (metode care nu au body)
    //toate aceste metode abstracte sunt publice
    //intr-o interfata putem defini cu void si return
    //intr=o interfata nu putem avea constructor -> nu putem face un obiect
    //interfata se implementeaza
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele din ea
    //o clasa poate implementa mai multe interfete
    //o interfata poate mosteni o alta interfata

    void ajungeLaTimpLaBirou();
    void munceste();
    void nuAreAbsente();
    void respectaConcuita();

}
