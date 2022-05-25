package CSV;

import Company.Restaurant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVRestaurant implements Csv<Restaurant> {
    private static CSVRestaurant io = new CSVRestaurant();
    private CSVRestaurant(){}

    public static CSVRestaurant getIo() {
        if (io == null) {
            io = new CSVRestaurant();
        }
        return io;
    }
    @Override
    public void Write(Restaurant restaurant){
        try(FileWriter fileWriter = new FileWriter("D:\\Homework-Java-\\restaurant.csv")) {
            fileWriter.write(restaurant.getNume() + "," + restaurant.getAdresa() + "," + restaurant.getTelefon() + "," + restaurant.getIdComanda() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Restaurant> Read() {
        List<Restaurant> restaurants = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Homework-Java-\\restaurant.csv"))) {
            String l;
            while((l = bufferedReader.readLine()) != null) {
                String[] fields = l.split(",");
                Restaurant r = new Restaurant(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]));
                restaurants.add(r);
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }
        return restaurants;
    }

}
