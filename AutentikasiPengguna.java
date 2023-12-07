import java.util.Scanner;

public class AutentikasiPengguna {
    public static void main(String[] args) {
        // Menentukan username dan password yang benar
        String usernameBenar = "AbdulHafizh";
        String passwordBenar = "akucintakamu";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa autentikasi
        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
        scanner.close();
    }
}
