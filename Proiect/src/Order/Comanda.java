package Order;

import Company.Restaurant;
import Products.Livrator;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.parser.DTDConstants.ID;

public class Comanda {
    private Integer idComanda = 0;
    private static int count = 0;
    private int durata; // durata se calculeaza in minute
    private List<Restaurant> restaurante = new ArrayList<>();
    private ArrayList<Livrator> livratori = new ArrayList<>();

    public Comanda(Integer idComanda, int durata, List<Restaurant> restaurante, ArrayList<Livrator> livratori) {
        this.idComanda = idComanda;
        this.durata = durata;
        this.restaurante = restaurante;
        this.livratori = livratori;
    }

    public Comanda() {
        count++;
        this.idComanda = count;
    }

    /*
    public Order.Comanda(Order.Comanda c, Integer idComanda) {
        super(c);
        this.idComanda = idComanda;
    }
     */  // aici nu am stiut sa depanez


    public Integer getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Integer idComanda) {
        this.idComanda = idComanda;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public List<Restaurant> getRestaurante() {
        return restaurante;
    }

    public ArrayList<Livrator> getLivratori() {
        return livratori;
    }

    public void addLivrator(Livrator l) {
        l.setID(ID);
        livratori.add(l);
    }
}
