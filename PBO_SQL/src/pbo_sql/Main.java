/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_sql;
import java.util.Scanner;
/**
 *
 * @author Falaq
 */
public class Main {

    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        int pilihan;
//        Create.main(null);

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Create Data");
            System.out.println("2. Insert Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete 1 baris Data");
            System.out.println("5. Read Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // biar buffer scanner aman

            switch (pilihan) {
                case 1:
                    Create.createTable();
                    break;
                case 2:
                    Insert insert = new Insert();
                    insert.inputData();// jalankan class Insert
                    break;
                case 3:
                    Update.main(null);   // jalankan class Update
                    break;
                case 4:
                    Delete.main(null);   // jalankan class Delete
                    break;
                case 5:
                    Read.main(null);
                    break;
                case 6:
                    System.out.println("Terima kasih, keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
    }
}
