/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_sql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Falaq
 */
public class Create extends Koneksi{
    public static void createTable(){
        System.out.println("Membuat Table Data_Pasien. . . ");

        String QUERY = "CREATE TABLE Data_Pasien ("
                + "Id_Pasien VARCHAR(10)PRIMARY KEY, "
                + "Nama_Pasien VARCHAR(100), "
                + "Tanggal_Lahir DATE, "
                + "Alamat VARCHAR(10), "
                + "No_Hp INT, "
                + "Diagnosa VARCHAR(10))";
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(QUERY);
            System.out.println("Tabel berhasil dibuat");
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
