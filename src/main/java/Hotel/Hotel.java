package Hotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mchai
 */
import Hotel.Kamar;
import User.Admin;
import User.Customer;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Kamar hotel = new Kamar();

        Admin admin = new Admin("Admin", "081234567890", 1, "admin", "p123");

        while (true) {
            System.out.println("\nPilih level akses:");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Keluar");
            int pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String USER = scan.nextLine();
                    System.out.print("Masukkan password: ");
                    String PASS = scan.nextLine();

                    if (admin.autentikasi(USER, PASS)) {
                        System.out.println("\nLogin berhasil.");
                        System.out.println("\nMenu Admin:");
                        System.out.println("1. Lihat Ketersediaan Kamar");
                        System.out.println("2. Tambah Kamar");
                        System.out.println("3. Lihat Semua Customer");
                        int adminPilihan = scan.nextInt();
                        scan.nextLine(); 

                        switch (adminPilihan) {
                            case 1:
                                hotel.cekKetersediaan();
                                break;
                            case 2:
                                System.out.print("Masukkan jenis kamar yang ingin ditambah (Standard, Deluxe, Superior): ");
                                String jenisKamar = scan.nextLine();
                                System.out.print("Masukkan jumlah kamar yang ingin ditambahkan: ");
                                int jumlahKamar = scan.nextInt();
                                admin.tambahKamar(hotel, jenisKamar, jumlahKamar); 
                                break;
                            case 3:
                                admin.lihatSemuaCustomer(hotel); 
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    } else {
                        System.out.println("Username atau password salah. Akses ditolak.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String telepon = scan.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scan.nextInt();
                    scan.nextLine();

                    Customer customer = new Customer(nama, telepon, umur);
                    
                    customer.detailCustomer();  
                    
                    System.out.println("Pilih jenis kamar yang ingin dipesan:");
                    System.out.println("1. Standard");
                    System.out.println("2. Deluxe");
                    System.out.println("3. Superior");
                    System.out.print("Masukkan pilihan : ");
                    int pilihanKamar = scan.nextInt();
                    String jenisKamarPesan;

                    switch (pilihanKamar) {
                        case 1:
                            jenisKamarPesan = "Standard";
                            break;
                        case 2:
                            jenisKamarPesan = "Deluxe";
                            break;
                        case 3:
                            jenisKamarPesan = "Superior";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Kembali ke menu.");
                            continue; 
                    }
                    
                    System.out.print("Jumlah kamar yang ingin dipesan: ");
                    int jumlahPesan = scan.nextInt();
                    hotel.pesanKamar(customer, jenisKamarPesan, jumlahPesan);
                    hotel.tampilkanSemuaCustomer(); 
                    break;
                    
                case 3:
                    System.out.println("Keluar dari aplikasi.");
                    scan.close();
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}