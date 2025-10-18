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
public class Delete extends Koneksi {

    public static void main(String []args){
            // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Masukkan nama kolom yang mau dihapus :");
            String kolom = sc.nextLine();
            System.out.println("Masukkan data sesuai kolom yang mau dihapus : ");
            String data = sc.nextLine();
            String QUERY = "DELETE FROM Data_Pasien WHERE " + kolom + " = '" + data + "'";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("Data Berhasil dihapus");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Apakah ingin menghapus 1 baris data lagi? (y = ya atau t = tidak)");
            char jwb = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            switch (jwb) {
                case 'y':
                    break;
                case 't':
                    System.out.println("Kembali Ke Menu Utama");
                    return;
                default :
                    System.out.println("Input tidak valid, kembali ke Menu Utama");
                    return;
            }
        }
    }
}
