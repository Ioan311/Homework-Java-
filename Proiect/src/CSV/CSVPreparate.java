package CSV;

import Products.Preparate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVPreparate implements Csv<Preparate> {
    private static CSVPreparate io = new CSVPreparate();
    private CSVPreparate(){}

    public static CSVPreparate getIo() {
        if (io == null) {
            io = new CSVPreparate();
        }
        return io;
    }
    @Override
    public void Write(Preparate food){
        try(FileWriter fileWriter = new FileWriter("D:\\Homework-Java-\\preparate.csv")) {
            fileWriter.write(food.getPret() + "," + food.getNumePreparat() + "," + food.getPret() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Preparate> Read() {
        List<Preparate> food = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Homework-Java-\\preparate.csv"))) {
            String l;
            while((l = bufferedReader.readLine()) != null) {
                String[] fields = l.split(",");
                Preparate p = new Preparate(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]));
                food.add(p);
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }
        return food;
    }

}
