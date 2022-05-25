package DBConnection;

import Order.BonFiscal;
import Products.Preparate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BonFiscalDB extends BonFiscal {
    private ConnectionDB connectionDB;

    public BonFiscalDB (ConnectionDB connectionDB1)  throws SQLException {
        this.connectionDB = connectionDB1;
    }

    public List<BonFiscal> AllBonFiscals () throws SQLException {
        List<BonFiscal> bonFiscals = new ArrayList<>();
        String query = "SELECT * FROM BonFiscal";

        try {
            // create the java statement
            Connection conn = null;
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int idBon = rs.getInt("idBon_BonFiscal");
                int pret = (int) rs.getFloat("pret_BonFiscal");
                int tva = (int) rs.getFloat("tva_BonFiscal");
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bonFiscals;
    }

    public void insert(List<BonFiscal> bonFiscals) {
        String query = "INSERT INTO BonFiscal (idBon_BonFiscal, pret_BonFiscal, tva_BonFiscal) " + "VALUES (?, ?, ?)";
        try(PreparedStatement preparedStatement = connectionDB.prepareStatement(query)) {
            Connection conn1 = null;
            Statement st1 = conn1.createStatement();
            ResultSet rs1 = st1.executeQuery(query);
            for (BonFiscal b1 : bonFiscals) {
                preparedStatement.setString(0, String.valueOf(b1.getIdBon()));
                preparedStatement.setString(1, String.valueOf(b1.getPret()));
                preparedStatement.setString(2, String.valueOf(b1.getTva()));
            }
            st1.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete (BonFiscal bonFiscal) throws SQLException {
        try {
            String query = "delete from BonFiscal, where id =  ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(Integer.parseInt(String.valueOf(1)), String.valueOf(41));
            preparedStatement.execute();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update (BonFiscal bonFiscal) throws SQLException {
        try{
            String query = "update BonFiscal set pret = ? where tva = ?";
            Connection conn = null;
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, 145);
            preparedStatement.setString(2, String.valueOf(5));
            preparedStatement.execute();
            conn.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
    }
}
