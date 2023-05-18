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
public class karyawan implements user {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public karyawan() {
        this.namaKaryawan.add("admin");
        this.alamat.add("Tulungagung");
        this.telepon.add("085768890121");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int id) {
        return this.jabatan.get(id);
    }

    public int getJmlKaryawan() {
        return this.namaKaryawan.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add("089891123654");
    }
    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }
    
}
