/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import User.Customer;
import java.util.ArrayList;

public class Kamar implements KamarInter {
    private int kamarStandard = 30;
    private int kamarDeluxe = 20;
    private int kamarSuperior = 15;
    private ArrayList<Customer> daftarCustomer = new ArrayList<>();

    @Override
    public void pesanKamar(Customer customer, String jenisKamar, int jumlah) {
        switch (jenisKamar.toLowerCase()) {
            case "standard":
                if (kamarStandard >= jumlah) {
                    kamarStandard -= jumlah;
                    daftarCustomer.add(customer);
                    System.out.println(jumlah + " kamar Standard berhasil dipesan.");
                } else {
                    System.out.println("Kamar Standard tidak mencukupi.");
                }
                break;
            case "deluxe":
                if (kamarDeluxe >= jumlah) {
                    kamarDeluxe -= jumlah;
                    daftarCustomer.add(customer);
                    System.out.println(jumlah + " kamar Deluxe berhasil dipesan.");
                } else {
                    System.out.println("Kamar Deluxe tidak mencukupi.");
                }
                break;
            case "superior":
                if (kamarSuperior >= jumlah) {
                    kamarSuperior -= jumlah;
                    daftarCustomer.add(customer);
                    System.out.println(jumlah + " kamar Superior berhasil dipesan.");
                } else {
                    System.out.println("Kamar Superior tidak mencukupi.");
                }
                break;
            default:
                System.out.println("Jenis kamar tidak valid.");
                break;
        }
    }

    @Override
    public void cekKetersediaan() {
        System.out.println("Ketersediaan Kamar:");
        System.out.println("Standard: " + kamarStandard);
        System.out.println("Deluxe: " + kamarDeluxe);
        System.out.println("Superior: " + kamarSuperior);
    }

    @Override
    public void setKamar(String jenisKamar, int jumlah) {
        switch (jenisKamar.toLowerCase()) {
            case "standard":
                kamarStandard += jumlah;
                break;
            case "deluxe":
                kamarDeluxe += jumlah;
                break;
            case "superior":
                kamarSuperior += jumlah;
                break;
            default:
                System.out.println("Jenis kamar tidak valid.");
                break;
        }
    }

    @Override
    public void tampilkanSemuaCustomer() {
        if (daftarCustomer.isEmpty()) {
            System.out.println("Belum ada customer yang memesan kamar.");
        } else {
            System.out.println("Daftar Customer:");
            for (Customer customer : daftarCustomer) {
                customer.detailCustomer();
            }
        }
    }
}