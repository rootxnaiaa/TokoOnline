package toko.online;
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Integer> idMember = new ArrayList<>();
    private ArrayList<Integer> idBarang = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();

    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyak) {
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyak);
        barang.editStok(idBarang, -banyak);
    }

    public int prosesTransaksi(Member member, Transaksi transaksi, Barang barang) {
        int totalHarga = 0;
        for (int i = 0; i < idBarang.size(); i++) {
            int idBrg = idBarang.get(i);
            int qty = banyak.get(i);
            int harga = barang.getHarga(idBrg);
            totalHarga += qty * harga;
        }
        int idMbr = idMember.get(0);
        int saldoMbr = member.getSaldo(idMbr);
        if (saldoMbr < totalHarga) {
            return -1; // Saldo tidak cukup
        } else {
            member.editSaldo(idMbr, -totalHarga);
            int kembalian = saldoMbr - totalHarga;
            return kembalian;
        }
    }

    public int getIdMember(int index) {
        return idMember.get(index);
    }

    public int getIdBarang(int index) {
        return idBarang.get(index);
    }

    public int getIdBanyaknya(int index) {
        return banyak.get(index);
    }

    public int getJmlTransaksi() {
        return idBarang.size();
    }
}
