import java.io.IOException;

public class CompanieDelivery implements License {
    private String nume;
    private int currentYear = 2022;

    public void check(int Expire) throws IOException {
        if(Expire > currentYear)
            System.out.println("Licenta este in conformitate cu prevederile legale");
        else
            throw new IOException("Licenta este expirata");
    }

    public CompanieDelivery(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}