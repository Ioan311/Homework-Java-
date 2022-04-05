package FactoryMethod;

public class CititorCaractere implements Cititor {
    Decodificator decodificare;

    public CititorCaractere(String mesaj){
        this.decodificare = new Decodificator(mesaj);
    }

    @Override
    public Decodificator getDecodifText(){
        return decodificare;
    }
}
