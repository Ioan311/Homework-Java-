package DBConnection;

import DBConnection.ConnectionDB;
import Products.Preparate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreparateDB extends Preparate {
    private ConnectionDB connectionDB;

    public PreparateDB (ConnectionDB connectionDB1)  throws SQLException {
        this.connectionDB = connectionDB1;
    }

    public List<Preparate> AllFoods () throws SQLException {
        List<Preparate> food = new ArrayList<>();
        String query = "SELECT * FROM preparate";

        try {
            // create the java statement
            Connection conn = null;
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int pret = rs.getInt("pret_preparat");
                String numePreparat = rs.getString("numePreparat_preparat");
                int contitate = rs.getInt("cantitate_preparat");
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return food;
    }

    public void insert(List<Preparate> preparates) {
        String query = "INSERT INTO preparate (pret_preparat, numePreparat_preparat, contitate_preparat) " + "VALUES (?, ?, ?)";
        try(PreparedStatement preparedStatement = connectionDB.prepareStatement(query)) {
            Connection conn1 = null;
            Statement st1 = conn1.createStatement();
            ResultSet rs1 = st1.executeQuery(query);
            for (Preparate p1 : preparates) {
                preparedStatement.setString(0, String.valueOf(p1.getPret()));
                preparedStatement.setString(1, p1.getNumePreparat());
                preparedStatement.setString(2, String.valueOf(p1.getCantitate()));
            }
            st1.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete (Preparate preparate) throws SQLException {
        try {
            String query = "delete from preparate, where id =  ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(Integer.parseInt(String.valueOf(18)), String.valueOf(7));
            preparedStatement.execute();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update (Preparate preparate) throws SQLException {
        try{
            String query = "update preparate set pret = ? where numePreparat = ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, 310);
            preparedStatement.setString(2, "Cartofi Gratinati");
            preparedStatement.execute();
            conn.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
    }
}
