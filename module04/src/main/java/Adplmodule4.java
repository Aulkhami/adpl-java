/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author rakha
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Adplmodule4 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/moduladpl";
        String user = "root"; // Sesuaikan dengan username database
        String password = "password"; // Sesuaikan dengan password database
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Koneksi berhasil!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
