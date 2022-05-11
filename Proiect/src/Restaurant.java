import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String nume;
    private String adresa;
    private String telefon;
    private int idComanda;
    private List<Preparate> mancaruri = new ArrayList<>();
    private ArrayList<Comanda> comenzi = new ArrayList<>();

    public Restaurant(String nume, String adresa, String telefon, int idComanda, List<Preparate> mancaruri, ArrayList<Comanda> comenzi) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.idComanda = idComanda;
        this.mancaruri = mancaruri;
        this.comenzi = comenzi;
    }

    public Restaurant() {}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public List<Preparate> getMancaruri() {
        return mancaruri;
    }

    public ArrayList<Comanda> getComenzi() {
        return comenzi;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setMancaruri(List<Preparate> mancaruri) {
        this.mancaruri = mancaruri;
    }

    public void setComenzi(ArrayList<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

    public void addPreparate(Preparate p) {
        mancaruri.add(p);
    }

    public void addComanda(Comanda c) {
        c.setIdComanda(idComanda);
        comenzi.add(c);
    }
}
