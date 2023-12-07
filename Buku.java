

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor untuk inisialisasi atribut buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Awalnya buku belum dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sudah dipinjam sebelumnya.");
        }
    }

    // Metode utama untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("sangkancil", "agus", 2009);

        // Menampilkan informasi buku
        buku1.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        buku1.tampilkanInformasi();
    }
}
