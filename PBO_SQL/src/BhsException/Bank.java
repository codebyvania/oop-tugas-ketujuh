/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BhsException;

/**
 *
 * @author User
 */
class SaldoTidakCukupException extends RuntimeException {

    public SaldoTidakCukupException(String pesan) {
        super(pesan);
    }
}

// Menggunakan Exception Kustom
public class Bank {

    public static void tarikSaldo(int saldo, int jumlahTarik) {
        if (jumlahTarik > saldo) {
            throw new SaldoTidakCukupException("Saldo tidak mencukupi untuk menarik: " + jumlahTarik);
        }
        System.out.println("Penarikan berhasil. Sisa saldo: " + (saldo - jumlahTarik));
    }

    public static void main(String[] args) {
        try {
            tarikSaldo(50000, 100000); // coba tarik lebih besar dari saldo
        } catch (SaldoTidakCukupException e) {
            System.out.println("Tertangkap Exception: " + e.getMessage());
        }
    }
}
