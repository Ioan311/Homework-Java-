import java.util.List;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Marcu", "Ioan", 20, "0721054623", "Traian Vuia, 4, Ploiesti");
        User u2 = new User("Dima", "Marian", 35, "0712345769", "Bulevardul Unirii, 26, Bucuresti");
        Preparate p1 = new Preparate(125, "Somon Fume", 250);
        Preparate p2 = new Preparate(400, "Beef Steak", 400);
        //Livrator l1 = new Livrator("Sima", "Marian", 32, "0721434221", 22);
        //BonFiscal b1 = new BonFiscal(56, 67.8f, 3.5f, (List<Preparate>) p1);
    }
}
