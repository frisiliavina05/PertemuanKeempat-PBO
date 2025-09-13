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

public class Create extends Koneksi {

    public static void main(String[] args) {

        String QUERY = "CREATE TABLE musik ("
                + "id VARCHAR(10) PRIMARY KEY, "
                + "judul VARCHAR(100), "
                + "artis VARCHAR(50), "
                + "tahun INT4);";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(QUERY);
            System.out.println("Tabel dengan nama 'musik' berhasil dibuat");
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
