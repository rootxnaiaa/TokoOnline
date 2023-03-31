package toko.online;
import java.util.ArrayList;

public class TokoOnline {
    public static void main(String[] args) {
        // Data Barang
        Barang barang = new Barang();
        barang.setNama("Keyboard");
        barang.setStok(10);
        barang.setHarga(300000);

            System.out.println("Data Barang:");
    System.out.println("Jumlah Barang: " + barang.getJmlBarang());
    System.out.println("Nama Barang: " + barang.getNamaBarang(0));
    System.out.println("Stok Barang: " + barang.getStok(0));
    System.out.println("Harga Barang: " + barang.getHarga(0));
    System.out.println();

    // Data Member
    Member member = new Member();
    member.setNama("Fulan");
    member.setAlamat("Jakarta");
    member.setTelepon("08123456789");
    member.setSaldo(0, 1000000);

    System.out.println("Data Member:");
    System.out.println("Jumlah Member: " + member.getJmlMember());
    System.out.println("Nama Member: " + member.getNama(0));
    System.out.println("Alamat Member: " + member.getAlamat(0));
    System.out.println("Telepon Member: " + member.getTelepon(0));
    System.out.println("Saldo Member: " + member.getSaldo(0));
    System.out.println();

    // Laporan Transaksi
    Transaksi transaksi = new Transaksi();
    transaksi.setTransaksi(barang, 0, 0, 2);
    int idMember = member.getJmlMember() - 1;
    int idBarang = barang.getJmlBarang() - 1;
    transaksi.setTransaksi(barang, idMember, idBarang, 3);
    int totalHarga = transaksi.prosesTransaksi(member, transaksi, barang);

    System.out.println("Laporan Transaksi:");
    System.out.println("Jumlah Transaksi: " + transaksi.getJmlTransaksi());
    System.out.println("Qty Barang: " + transaksi.getIdBanyaknya(0));
    System.out.println("ID Member: " + member.getIdMember(idMember));
    System.out.println("ID Barang: " + barang.getIdBarang(idBarang));
    System.out.println("Banyak Barang: " + transaksi.getIdBanyaknya(0));
    System.out.println("Harga Barang: " + barang.getHarga(idBarang));
    System.out.println("Total: " + totalHarga*barang.getHarga(idBarang));
    System.out.println("Saldo Member: " + member.getSaldo(idMember));
    System.out.println("Kembalian: " + (member.getSaldo(idMember)-(totalHarga*barang.getHarga(idBarang))));
}
}