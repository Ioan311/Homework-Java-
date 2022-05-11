import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Audit {
    public void dateFormat (String actiune) {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyy/mm/dd");
        LocalDate date = LocalDate.now();
        Audit aud = new Audit();
        aud.write(actiune, d.format(date));
    }
    // aici nu am mai stiut sa fac, as fi vrut sa fac ceva de genul: de fiecare data cand avem o actiunde sa vedem de unde face parte si se citeste
    // fiecare csv file, iar daca actiunea face parte din User... apelez o functie care adauga un nou user in audit.csv
    public void write (String actiune, String data) {
        /*Scanner scanner = new Scanner(System.in);
        int caz = scanner.nextInt();
        if (caz > 0) {
            switch (caz) {
                case "User" {
                    readCSV();
                }

            }
        } */
    }
}
