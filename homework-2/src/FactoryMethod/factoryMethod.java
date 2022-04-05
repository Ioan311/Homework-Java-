package FactoryMethod;

/*
pe scurt definesc o interfata (in cazul meu aceasta este Cititor-ma refer la ala de texte) pt a crea obiecte (mesajul),
dar las subclasele sa decida ce clasa sa instantieze.
De asemenea, trec obiectul(mesajul) printr-un "filtru" de clase pentru a-l decodifica
 */
public class factoryMethod {
    public static void main(String[] args){
        Decodificator decodificare;
        Cititor reader = null;
        String mesaj = args[0];
        String format = mesaj.substring(mesaj.indexOf('.') + 1, (mesaj.length()));
        if (format.equals("AbC3")) {
            reader = new CititorCaractere(mesaj);
        } // aici m-am gandit ca primul cititor sa citeasca caractere gen litere si numere
        if (format.equals("UTF-8")) {
           reader = new CititorCodificareCaractere(mesaj);
        } // iar acesta sa citeasca tot, adica si pe cele precedente, dar si simboluri de exemplu
        assert reader != null;
        decodificare = reader.getDecodifText();
        System.out.println(decodificare);
    }
}
