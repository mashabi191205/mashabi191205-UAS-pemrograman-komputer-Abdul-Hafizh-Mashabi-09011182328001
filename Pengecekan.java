import java.util.Scanner;

public class Pengecekan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input 
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Menampilkan hasil palindrom
        if (isPalindrom(input)) {
            System.out.println("Kata atau frase tersebut adalah palindrom.");
        } else {
            System.out.println("Kata atau frase tersebut bukan palindrom.");
        }
        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata atau frase adalah palindrom
    public static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah ke huruf kecil
        str = str.replaceAll("\\s", "").toLowerCase();

        int panjang = str.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (str.charAt(i) != str.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
