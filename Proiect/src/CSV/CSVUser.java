package CSV;

import Person.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUser implements Csv<User> {
    private static CSVUser io = new CSVUser();
    private CSVUser(){}

    public static CSVUser getIo() {
        if (io == null) {
            io = new CSVUser();
        }
        return io;
    }
    @Override
    public void Write(User user){
        try(FileWriter fileWriter = new FileWriter("D:\\Homework-Java-\\user.csv")) {
            fileWriter.write(user.getNume() + "," + user.getPrenume() + "," + user.getVarsta() + "," + user.getNrTelefon() + "," + user.getAdresa() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<User> Read() {
        List<User> users = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Homework-Java-\\user.csv"))) {
            String l;
            while((l = bufferedReader.readLine()) != null) {
                String[] fields = l.split(",");
                User u = new User(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3], fields[4]);
                users.add(u);
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }
        return users;
    }
}
