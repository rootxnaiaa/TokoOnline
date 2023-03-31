package toko.online;
import java.util.ArrayList;

public class Karyawan implements User {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        // constructor
    }

    public void setJabatan(int index, int value) {
        jabatan.set(index, value);
    }

    public int getJabatan(int index) {
        return jabatan.get(index);
    }

    public int getJmlKaryawan() {
        return namaKaryawan.size();
    }

    public void setNama(String nama) {
        namaKaryawan.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNama(int index) {
        return namaKaryawan.get(index);
    }

    public String getAlamat(int index) {
        return alamat.get(index);
    }

    public String getTelepon(int index) {
        return telepon.get(index);
    }
}
