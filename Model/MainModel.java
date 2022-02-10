package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainModel {

    static ResultSet endResult = null;
    static Connection conn = null;
    static Statement stmt = null;

    public static ResultSet getData(String where) {

        try {
            conn = DBConnect.getKoneksi();
            stmt = conn.createStatement();

            String sql = "SELECT * FROM tbl_pegawai WHERE email='%s'";
            sql = String.format(sql, where);
            ResultSet result = stmt.executeQuery(sql);

            endResult = result;

            conn.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Koneksi Error");
            e.printStackTrace();
        }

        return endResult;
    }
}
