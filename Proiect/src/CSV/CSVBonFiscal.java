package CSV;

import Order.BonFiscal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVBonFiscal implements Csv<BonFiscal> {
    private static CSVBonFiscal io = new CSVBonFiscal();
    private CSVBonFiscal(){}

    public static CSVBonFiscal getIo() {
        if (io == null) {
            io = new CSVBonFiscal();
        }
        return io;
    }
    @Override
    public void Write(BonFiscal bonFiscal){
        try(FileWriter fileWriter = new FileWriter("D:\\Homework-Java-\\bonFiscal.csv")) {
            fileWriter.write(bonFiscal.getIdBon() + "," + bonFiscal.getPret() + "," + bonFiscal.getTva() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<BonFiscal> Read() {
        List<BonFiscal> bonFiscals = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Homework-Java-\\bonFiscal.csv"))) {
            String l;
            while((l = bufferedReader.readLine()) != null) {
                String[] fields = l.split(",");
                BonFiscal b = new BonFiscal(Integer.parseInt(fields[0]), Float.parseFloat(fields[1]), Float.parseFloat(fields[2]));
                bonFiscals.add(b);
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }
        return bonFiscals;
    }
}
