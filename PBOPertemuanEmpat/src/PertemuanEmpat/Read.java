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

public class Read extends Koneksi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Berikut Data dari Tabel Musik : ");

        String QUERY = "SELECT * FROM musik ";

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                //Display values
                System.out.println("ID Lagu : " + String.valueOf(rs.getObject(1)));
                System.out.println("Judul : " + String.valueOf(rs.getObject(2)));
                System.out.println("Artis : " + String.valueOf(rs.getObject(3)));
                System.out.println("Tahun  : " + String.valueOf(rs.getObject(4)));
                System.out.println("                                                     ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\nApakah anda ingin kembali ke menu? (Ya atau Tidak)");
        char pilih = scan.next().toLowerCase().charAt(0);
        scan.nextLine();
        switch (pilih) {
            case 'y':  //untuk ya
                System.out.println("\nKembali Ke Menu Utama");
                return;
            default:  //untuk tidak
                System.out.println("\nInput Tidak Valid, Kembali Ke Menu Utama");
                return;
        }
    }
}
