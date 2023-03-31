package toko.online;
import java.util.ArrayList;

public class Member implements User {
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        // constructor
    }

    public void setSaldo(int index, int value) {
        saldo.set(index, value);
    }

    public int getSaldo(int index) {
        return saldo.get(index);
    }

    public void editSaldo(int index, int value) {
        saldo.set(index, saldo.get(index) + value);
    }

    public int getJmlMember() {
        return namaMember.size();
    }

    public void setNama(String nama) {
        namaMember.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNama(int index) {
        return namaMember.get(index);
    }

    public String getAlamat(int index) {
        return alamat.get(index);
    }

    public String getTelepon(int index) {
        return telepon.get(index);
    }
}
