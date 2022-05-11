import java.util.ArrayList;
import java.util.List;

public class BonFiscal {
    private Integer idBon;
    private float pret;
    private float tva;
    private List<Preparate> produse = new ArrayList<>();
    
    public BonFiscal(Integer idBon, float pret, float tva, List<Preparate> produse) {
        this.idBon = idBon;
        this.pret = pret;
        this.tva = tva;
        this.produse = produse;
    }

    public BonFiscal() {}

    public Integer getIdBon() {
        return idBon;
    }

    public void setIdBon(Integer idBon) {
        this.idBon = idBon;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public List<Preparate> getProduse() {
        return produse;
    }

    public float TotalDePlata(Preparate prod) {
        produse.add(prod);
        return pret = pret + pret * tva;
    }

    @Override
    public String toString() {
        return "BonFiscal{" +
                "idBon=" + idBon +
                ", pret='" + pret +
                ", tva='" + tva +
                ", produse=" + produse +
                '}';
    }
}
