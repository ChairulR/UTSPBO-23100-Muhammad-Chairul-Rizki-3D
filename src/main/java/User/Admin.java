/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Hotel.Kamar;

public class Admin extends Customer {
    private String username;
    private String password;

    public Admin(String nama, String telepon, int umur, String username, String password) {
        super(nama, telepon, umur);
        this.username = username;
        this.password = password;
    }

    public boolean autentikasi(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    public void tambahKamar(Kamar kamar, String jenisKamar, int jumlahTambahan) {
        kamar.setKamar(jenisKamar, jumlahTambahan);
        System.out.println(jumlahTambahan + " kamar jenis " + jenisKamar + " berhasil ditambahkan.");
    }

    @Override
    public void detailCustomer() {
        System.out.println("Detail Admin:");
        super.detailCustomer(); 
    }

    public void lihatSemuaCustomer(Kamar kamar) {
        kamar.tampilkanSemuaCustomer();
    }
}


