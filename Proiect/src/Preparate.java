import java.util.ArrayList;
import java.util.List;

public class Preparate {
    private int pret;
    private String numePreparat;
    private int cantitate;

    public Preparate(int pret, String numePreparat, int cantitate) {
        this.pret = pret;
        this.numePreparat = numePreparat;
        this.cantitate = cantitate;
    }

    public Preparate() {}

    public int getPret() {
        return pret;
    }

    public String getNumePreparat() {
        return numePreparat;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setNumePreparat(String numePreparat) {
        this.numePreparat = numePreparat;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
