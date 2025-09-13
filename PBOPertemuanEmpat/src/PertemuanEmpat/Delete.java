/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

/**
 *
 * @author HP
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Delete extends Koneksi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Input kolom yang ingin dihapus : ");
            String kolomTujuan = scan.nextLine();
            System.out.print("Input data dalam kolom yang ingin dIhapus : ");
            String nilaiTujuan = scan.nextLine();
            String QUERY = "DELETE FROM musik WHERE " + kolomTujuan + " = '" + nilaiTujuan + "'";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("\nData Berhasil di Hapus");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\nApakah anda ingin menghapus 1 baris data lagi? (Ya atau Tidak)");
            char pilih = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
            switch (pilih) {
                case 'y': //untuk ya
                    break;
                case 't':  //untuk tidak
                    System.out.println("\nKembali Ke Menu Utama");
                    return;
                default:
                    System.out.println("\nInput Tidak Valid, Kembali Ke Menu Utama");
                    return;
            }
        }
    }
}
