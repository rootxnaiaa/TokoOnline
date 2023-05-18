/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko_online;
import java.util.ArrayList;
/**
 *
 * @author Naila Rizki
 */
public class barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    public barang(){
        this.namaBarang.add("Chocolate");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("Bodywash");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("Mouse");
        this.stok.add(20);
        this.harga.add(15000);
    }

    public int getJmlgBrg() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public void setStok(Integer stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBarang) {
        return this.stok.get(idBarang);
    }

    public void editStok(int stok, int idBarang) {
        this.stok.set(idBarang,stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBarang) {
        return this.harga.get(idBarang);
    }
    
}
