package Products;

import Person.User;

public class Livrator extends User {
    private long ID;

    public Livrator(String nume, String prenume, int varsta, String nrTelefon, String adresa, long ID) {
        super(nume, prenume, varsta, nrTelefon, adresa);
        this.ID = ID;
    }

    public Livrator(Livrator baiat, long ID) {
        super(baiat);
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Products.Livrator{" +
                "ID=" + ID +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta='" + varsta + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa=" + adresa +
                '}';

    }
}
