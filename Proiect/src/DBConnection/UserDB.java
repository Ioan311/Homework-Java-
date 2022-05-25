package DBConnection;

import DBConnection.ConnectionDB;
import Person.User;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDB extends User {
    private ConnectionDB connectionDB;

    public UserDB (ConnectionDB connectionDB1)  throws SQLException {
        this.connectionDB = connectionDB1;
    }

    public List<User> AllUsers () throws SQLException {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM userr";

        try {
            // create the java statement
            Connection conn = null;
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String nume = rs.getString("nume_utilizator");
                String prenume = rs.getString("prenume_utilizator");
                int varsta = rs.getInt("varsta_utilizator");
                String nrTelefon = rs.getString("nrTelefon_utilizator");
                String adresa = rs.getString("adresa_utilizator");
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void insert(List<User> user) {
        String query = "INSERT INTO users (nume_utilizator, prenume_utilizator, varsta_utilizator, nrTelefon_utilizator, adresa_utilizator) " + "VALUES (?, ?, ?, ?, ?)";
        try(PreparedStatement preparedStatement = connectionDB.prepareStatement(query)) {
            Connection conn1 = null;
            Statement st1 = conn1.createStatement();
            ResultSet rs1 = st1.executeQuery(query);
            for (User u1 : user) {
                preparedStatement.setString(0, u1.getNume());
                preparedStatement.setString(1, u1.getPrenume());
                preparedStatement.setString(2, String.valueOf(u1.getVarsta()));
                preparedStatement.setString(3, u1.getNrTelefon());
                preparedStatement.setString(4, u1.getAdresa());
            }
            st1.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete (User user) throws SQLException {
        try {
            String query = "delete from userr, where id =  ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(Integer.parseInt(String.valueOf(1)), String.valueOf(4));
            preparedStatement.execute();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update (User user) throws SQLException {
        try{
            String query = "update users set varsta = ? where nume = ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, 45);
            preparedStatement.setString(2, "Albert");
            preparedStatement.execute();
            conn.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
    }

}
