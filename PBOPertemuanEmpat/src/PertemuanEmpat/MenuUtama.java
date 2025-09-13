/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class MenuUtama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        Create.main(null);

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Select Data");
            System.out.println("5. Keluar");
            System.out.print("\nPilih Menu : ");
            pilihan = scan.nextInt();
            scan.nextLine(); // biar buffer scanner aman

            switch (pilihan) {
                case 1:
                    Insert.main(null);   //untuk class Insert
                    break;
                case 2:
                    Update.main(null);   //untuk class Update
                    break;
                case 3:
                    Delete.main(null);   //untuk class Delete
                    break;
                case 4:
                    Read.main(null);     //untuk class Read
                    break;
                case 5:
                    System.out.println("\nAnda Keluar Dari Program");
                    break;
                default:
                    System.out.println("\nPilihan Tidak Valid");
            }
        } while (pilihan != 5);
    }
}
