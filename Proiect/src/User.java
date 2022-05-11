import java.util.Objects;

public class User {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected String nrTelefon;
    protected String adresa;

    public User(String nume, String prenume, int varsta, String nrTelefon, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public User(Livrator baiat) {
        return;
    }

    public User() {

    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta='" + varsta + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa=" + adresa +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, varsta, nrTelefon, adresa);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob)
            return true;
        if (ob == null)
            return false;
        if(this.getClass() != ob.getClass())
            return false;
        User user = (User) ob;
        return nume == user.nume && prenume.equals(user.prenume);
    }
}
