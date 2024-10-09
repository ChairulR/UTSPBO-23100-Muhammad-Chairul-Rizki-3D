package User;

import Hotel.Kamar;

public class Customer {
    protected String nama;
    protected String telepon;
    protected int umur;

    public Customer(String nama, String telepon, int umur) {
        this.nama = nama;
        this.telepon = telepon;
        this.umur = umur;
    }

    public void pesanKamar(Kamar kamar, String jenisKamar, int jumlah) {
        kamar.setKamar(jenisKamar, jumlah);
    }

    public void detailCustomer() {
        System.out.println("Detail Pelanggan:");
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Telepon: " + telepon);
        System.out.println("Umur: " + umur);
    }
}
