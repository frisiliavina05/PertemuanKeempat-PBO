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

public class Insert extends Koneksi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Input ID Lagu : ");
            String idLagu = scan.nextLine();
            System.out.print("Input Judul Lagu : ");
            String judul = scan.nextLine();
            System.out.print("Input Nama Artis : ");
            String artis = scan.nextLine();
            System.out.print("Input Tahun Rilis : ");
            String tahun = scan.nextLine();

            String QUERY = "INSERT INTO musik VALUES ('" + idLagu + "', '" + judul + "', '"
                    + artis + "', '" + tahun + "') ";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("Data Berhasil Ditambahkan");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\nApakah anda ingin menambahkan data lagi? (Ya atau Tidak)");
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
