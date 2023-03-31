package toko.online;
public class Laporan {
    public void laporan(Barang barang) {
        System.out.println("Laporan Barang");
        System.out.println("---------------");
        System.out.println("ID \t Nama Barang \t Stok \t Harga");
        for(int i=0; i<barang.getJmlBarang(); i++) {
            System.out.println(barang.getIdBarang(i) + " \t " + barang.getNamaBarang(i) + " \t\t " + barang.getStok(i) + " \t " + barang.getHarga(i));
        }
        System.out.println("");
    }
    
    public void laporan(Member member) {
        System.out.println("Laporan Member");
        System.out.println("---------------");
        System.out.println("ID \t Nama \t\t Alamat \t\t Telepon \t Saldo");
        for(int i=0; i<member.getJmlMember(); i++) {
            System.out.println(i+1 + " \t " + member.getNama(i) + " \t " + member.getAlamat(i) + " \t " + member.getTelepon(i) + " \t " + member.getSaldo(i));
        }
        System.out.println("");
    }
    
    public void laporan(Transaksi transaksi, Barang barang) {
        System.out.println("Laporan Transaksi");
        System.out.println("------------------");
        System.out.println("No. \t ID Member \t ID Barang \t Banyak \t Harga Satuan \t Total");
        int jmlTransaksi = transaksi.getJmlTransaksi();
        for(int i=0; i<jmlTransaksi; i++) {
            int idMember = transaksi.getIdMember(i);
            int idBarang = transaksi.getIdBarang(i);
            int banyak = transaksi.getIdBanyaknya(i);
            int hargaSatuan = barang.getHarga(idBarang);
            int total = hargaSatuan * banyak;
            System.out.println(i+1 + " \t " + idMember + " \t\t " + idBarang + " \t\t " + banyak + " \t\t " + hargaSatuan + " \t\t " + total);
        }
        System.out.println("");
    }
}

