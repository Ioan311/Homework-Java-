package DBConnection;

import Company.Restaurant;
import DBConnection.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDB extends Restaurant {
    private ConnectionDB connectionDB;

    public RestaurantDB (ConnectionDB connectionDB1)  throws SQLException {
        this.connectionDB = connectionDB1;
    }

    public List<Restaurant> AllRestaurants () throws SQLException {
        List<Restaurant> restaurants = new ArrayList<>();
        String query = "SELECT * FROM restaurant";

        try {
            // create the java statement
            Connection conn = null;
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String nume = rs.getString("nume_restaurant");
                String adresa = rs.getString("adresa_restaurant");
                String telefon = rs.getString("telefon_restaurant");
                int idComanda = rs.getInt("idComanda_restaurant");
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return restaurants;
    }

    public void insert(List<Restaurant> restaurants) {
        String query = "INSERT INTO restaurant (nume_restaurant, adresa_restaurant, telefon_restaurant, idComanda_restaurant) " + "VALUES (?, ?, ?, ?)";
        try(PreparedStatement preparedStatement = connectionDB.prepareStatement(query)) {
            Connection conn1 = null;
            Statement st1 = conn1.createStatement();
            ResultSet rs1 = st1.executeQuery(query);
            for (Restaurant r1 : restaurants) {
                preparedStatement.setString(0, r1.getNume());
                preparedStatement.setString(1, r1.getAdresa());
                preparedStatement.setString(2, r1.getTelefon());
                preparedStatement.setString(3, String.valueOf(r1.getIdComanda()));
            }
            st1.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete (Restaurant restaurant) throws SQLException {
        try {
            String query = "delete from restaurant, where id =  ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(Integer.parseInt(String.valueOf(10)), String.valueOf(27));
            preparedStatement.execute();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update (Restaurant restaurant) throws SQLException {
        try{
            String query = "update restaurant set idComanda = ? where nume = ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, 12);
            preparedStatement.setString(2, "Evelin");
            preparedStatement.execute();
            conn.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
    }
}
