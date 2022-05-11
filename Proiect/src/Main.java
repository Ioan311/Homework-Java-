/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List; */

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Marcu", "Ioan", 20, "0721054623", "Traian Vuia, 4, Ploiesti");
        User u2 = new User("Dima", "Marian", 35, "0712345769", "Bulevardul Unirii, 26, Bucuresti");
        Preparate p1 = new Preparate(125, "Somon Fume", 250);
        Preparate p2 = new Preparate(400, "Beef Steak", 400);
        //Livrator l1 = new Livrator("Sima", "Marian", 32, "0721434221", 22);
        //BonFiscal b1 = new BonFiscal(56, 67.8f, 3.5f, (List<Preparate>) p1);

        // USER
        String filePath = "D:\\Homework-Java-\\user.csv";
        System.out.println("Scriem user.csv file: " + filePath);
        ReadWriteCSV.writeCSV(filePath);
        System.out.println("Citim user.csv file: " + filePath);
        ReadWriteCSV.readCSV(filePath);

        // PREPARATE
        String filePath2 = "D:\\Homework-Java-\\preparate.csv";
        System.out.println("Scriem preparate.csv file: " + filePath2);
        ReadWriteCSV.writeCSV2(filePath2);
        System.out.println("Citim preparate.csv file: " + filePath2);
        ReadWriteCSV.readCSV2(filePath2);

        // RESTAURANT
        String filePath3 = "D:\\Homework-Java-\\restaurant.csv";
        System.out.println("Scriem restaurant.csv file: " + filePath3);
        ReadWriteCSV.writeCSV3(filePath3);
        System.out.println("Citim restaurant.csv file: " + filePath3);
        ReadWriteCSV.readCSV3(filePath3);

        // BON FISCAL
        String filePath4 = "D:\\Homework-Java-\\bonFiscal.csv";
        System.out.println("Scriem bonFiscal.csv file: " + filePath4);
        ReadWriteCSV.writeCSV4(filePath4);
        System.out.println("Citim bonFiscal.csv file: " + filePath4);
        ReadWriteCSV.readCSV4(filePath4);

    }
}
