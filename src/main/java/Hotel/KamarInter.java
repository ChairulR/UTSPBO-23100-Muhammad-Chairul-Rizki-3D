/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel;

import User.Customer;

public interface KamarInter {
    void pesanKamar(Customer customer, String jenisKamar, int jumlah);
    void cekKetersediaan();
    void setKamar(String jenisKamar, int jumlah);
    void tampilkanSemuaCustomer();
}
