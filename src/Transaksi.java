import java.util.Date;
import java.util.UUID;

public class Transaksi {
    private String id;
    private String deskripsi;
    private double jumlah;
    private TipeTransaksi tipe;
    private Date tanggal;

    public Transaksi(String id, String deskripsi, double jumlah, TipeTransaksi tipe, Date tanggal) {
        this.id = (id == null) ? UUID.randomUUID().toString() : id;
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
        this.tipe = tipe;
        this.tanggal = tanggal;
    }

    // --- Getter dan Setter (Encapsulation) ---
    public String getId() { return id; }
    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
    public double getJumlah() { return jumlah; }
    public void setJumlah(double jumlah) { this.jumlah = jumlah; }
    public TipeTransaksi getTipe() { return tipe; }
    public void setTipe(TipeTransaksi tipe) { this.tipe = tipe; }
    public Date getTanggal() { return tanggal; }
    public void setTanggal(Date tanggal) { this.tanggal = tanggal; }

    /**
     * INI PENTING!
     * JList akan otomatis memanggil method ini untuk menampilkan teks.
     */
    @Override
    public String toString() {
        String prefix = (tipe == TipeTransaksi.PEMASUKAN) ? "[+]" : "[-]";
        // Format string sederhana untuk JList
        return String.format("%s %s (Rp%.0f)", prefix, deskripsi, jumlah);
    }


}
