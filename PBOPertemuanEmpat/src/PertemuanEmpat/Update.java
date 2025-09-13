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

public class Update extends Koneksi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Input kolom yang ingin diubah : ");
            String kolomDiubah = scan.nextLine();
            System.out.print("Input data yang ingin diubah : ");
            String nilaiBaru = scan.nextLine();
            System.out.print("Input nama kolom yang menjadi acuan perubahan : ");
            String kolomTujuan = scan.nextLine();
            System.out.print("Input data pada kolom yang menjadi acuan perubahan : ");
            String nilaiTujuan = scan.nextLine();

            String QUERY = "UPDATE musik SET " + kolomDiubah + " = '" + nilaiBaru + "' WHERE "
                    + kolomTujuan + " = '" + nilaiTujuan + "' ";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("Data Berhasil Di Perbarui");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\nApakah anda ingin memperbarui data lagi? (Ya atau Tidak)");
            char pilih = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
            switch (pilih) {
                case 'y':  //untuk ya
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
