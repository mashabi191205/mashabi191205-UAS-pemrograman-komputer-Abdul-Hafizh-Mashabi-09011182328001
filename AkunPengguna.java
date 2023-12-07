

public class AkunPengguna {
    private String username;
    private boolean aktif;

    // Konstruktor untuk inisialisasi atribut akun
    public AkunPengguna(String username, String password) {
        this.username = username;
        this.aktif = true; // Awalnya akun aktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInformasi() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + "********"); // Untuk keamanan, hanya menampilkan panjang password
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (!aktif) {
            aktif = true;
            System.out.println("Akun " + username + " berhasil diaktifkan.");
        } else {
            System.out.println("Akun " + username + " sudah aktif.");
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (aktif) {
            aktif = false;
            System.out.println("Akun " + username + " berhasil dinonaktifkan.");
        } else {
            System.out.println("Akun " + username + " sudah dinonaktifkan sebelumnya.");
        }
    }

    // Metode utama untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek akun
        AkunPengguna akun1 = new AkunPengguna("mamatbotak", "masasiii");

        // Menampilkan informasi akun
        akun1.tampilkanInformasi();

        // Menonaktifkan akun
        akun1.nonaktifkanAkun();

        // Menampilkan informasi akun setelah dinonaktifkan
        akun1.tampilkanInformasi();

        // Mengaktifkan akun
        akun1.aktifkanAkun();

        // Menampilkan informasi akun setelah diaktifkan
        akun1.tampilkanInformasi();
    }
}
