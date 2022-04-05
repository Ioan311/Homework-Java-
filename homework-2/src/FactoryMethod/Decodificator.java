package FactoryMethod;

public class Decodificator {
    String mesaj;

    public Decodificator(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public String toString(){
        return mesaj + "este decodificat";
    }
}
