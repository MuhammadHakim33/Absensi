package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection koneksi;

    public static Connection getKoneksi() {
        if(koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/pbo_absensi";
                String user = "root";
                String pass = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                koneksi = DriverManager.getConnection(url, user, pass);

            } catch (SQLException e) {
                System.out.println("Koneksi Error");
                e.printStackTrace();
            }
        }

        return koneksi;
    }
}
