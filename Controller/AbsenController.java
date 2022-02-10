package Controller;

import Model.MainModel;
import View.FormAbsensi;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AbsenController {
    public static void utama() {
        String ResultEmail = FormAbsensi.form();
        ResultSet data = MainModel.getData(ResultEmail);

        try {
            if(!data.next()) {
                System.out.println("Data Kosong");
            } else {
                String email = data.getString("email");
                System.out.println(email);
            }

        } catch (SQLException e) {
            System.out.println("Koneksi Error");
            e.printStackTrace();
        }
    }
}
