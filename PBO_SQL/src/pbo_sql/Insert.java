/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_sql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Falaq
 */
public class Insert extends Koneksi {

    Scanner sc = new Scanner(System.in);

    public void inputData() {
        // TODO code application logic here
        
            System.out.println("Input Id_Pasien");
            String id = sc.nextLine();
            System.out.println("Input Nama_Pasien");
            String nama = sc.nextLine();
            System.out.println("Input Tanggal_Lahir(YYYY-MM-DD)");
            String ttl = sc.nextLine();
            System.out.println("Input Alamat");
            String alamat = sc.nextLine();
            System.out.println("Input No_Hp");
            String nomor = sc.nextLine();
            System.out.println("Input Diagnosa");
            String diagnosa = sc.nextLine();
            

            String QUERY = "INSERT INTO Data_Pasien VALUES ('" + id + "', '" + nama + "', '"
                    + ttl + "', '" + alamat + "', '" + nomor + "', '" + diagnosa + "') ";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("Data Berhasil Ditambahkan");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Apakah ingin menambahkan data lagi? (y = ya atau t = tidak)");
            char jwb = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            switch (jwb) {
                case 'y':
                    break;
                case 't':
                    System.out.println("Kembali Ke Menu Utama");
                    return;
                default:
                    System.out.println("Input tidak valid, kembali ke Menu Utama");
                    return;
            }
        }
    
}
