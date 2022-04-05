package FactoryMethod;

//clasa asta citeste caractere de genul UTF-8(chiar la astea m-am gandit)
public class CititorCodificareCaractere implements Cititor {
    Decodificator decodificare;

    public CititorCodificareCaractere(String mesaj){
        decodificare = new Decodificator(mesaj);
    }

    @Override
    public Decodificator getDecodifText(){
        return decodificare;
    }
}
