/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BhsException;

/**
 *
 * @author User
 */
// Exception Kustom (Pengecualian Buatan)
class TanggalLahirTidakValidException extends Exception {
    public TanggalLahirTidakValidException(String pesan) {
        super(pesan);
    }
}

// Menggunakan Exception Kustom
public class DataPasien{
    public static void validasi(int tahunLahir)throws TanggalLahirTidakValidException {
        
        if (tahunLahir < 1900 || tahunLahir > 2025) {
            throw new TanggalLahirTidakValidException(
                "Tahun lahir tidak valid: " + tahunLahir
            );
        }
        System.out.println("Tahun lahir valid: " + tahunLahir);
    }

    public static void main(String[] args) {
        DataPasien pasien = new DataPasien();
        try {
            validasi(1880);  // contoh input salah → akan lempar exception
        } catch (TanggalLahirTidakValidException e) {
            System.out.println("Tertangkap Exception: " + e.getMessage());
        }
    }
}
