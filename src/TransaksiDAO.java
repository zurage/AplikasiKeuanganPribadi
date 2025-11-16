import java.util.List;

public interface TransaksiDAO {
    void tambah(Transaksi transaksi);
    void ubah(Transaksi transaksi);
    void hapus(String id);
    Transaksi get(String id);
    List<Transaksi> getAll();
    void setAll(List<Transaksi> daftarTransaksi); // Ditambahkan untuk Impor CSV
    
}
