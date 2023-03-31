package toko.online;
import java.util.ArrayList;

public class Barang implements User {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {}

    public void setNamaBarang(String nama) {
        this.namaBarang.add(nama);
    }

    public String getNamaBarang(int index) {
        return this.namaBarang.get(index);
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int index) {
        return this.stok.get(index);
    }

    public void editStok(int index, int stok) {
        int currentStok = this.stok.get(index);
        this.stok.set(index, currentStok + stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int index) {
        return this.harga.get(index);
    }

    @Override
    public void setNama(String nama) {}

    @Override
    public void setAlamat(String alamat) {}

    @Override
    public void setTelepon(String telepon) {}

    @Override
    public String getNama(int index) {
        return this.namaBarang.get(index);
    }

    @Override
    public String getAlamat(int index) {
        return null;
    }

    @Override
    public String getTelepon(int index) {
        return null;
    }
}
