import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TransaksiListDAO implements TransaksiDAO {
    private List<Transaksi> db;

    public TransaksiListDAO() {
        this.db = new ArrayList<>();
        // Data dummy
        db.add(new Transaksi(null, "Gaji Bulanan", 5000000, TipeTransaksi.PEMASUKAN, new Date()));
        db.add(new Transaksi(null, "Bayar Listrik", 350000, TipeTransaksi.PENGELUARAN, new Date()));
    }

    public void tambah(Transaksi transaksi) {
        db.add(transaksi);
    }

    public void ubah(Transaksi transaksi) {
        Transaksi txLama = get(transaksi.getId());
        if (txLama != null) {
            int index = db.indexOf(txLama);
            db.set(index, transaksi);
        }
    }

    public void hapus(String id) {
        Transaksi tx = get(id);
        if (tx != null) {
            db.remove(tx);
        }
    }

    public Transaksi get(String id) {
        for (Transaksi tx : db) {
            if (tx.getId().equals(id)) {
                return tx;
            }
        }
        return null;
    }

    public List<Transaksi> getAll() {
        // Urutkan (contoh: paling baru di atas)
        List<Transaksi> reversedList = new ArrayList<>(db);
        Collections.reverse(reversedList); // Membalik urutan
        return reversedList;
    }
    
    // Ditambahkan untuk Impor CSV
    public void setAll(List<Transaksi> daftarTransaksi) {
        this.db = new ArrayList<>(daftarTransaksi); // Timpa database lama
    }
    
}
