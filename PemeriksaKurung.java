import java.util.Scanner;
import java.util.Stack;

public class PemeriksaKurung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca ekspresi matematika dari pengguna
        System.out.print("Masukkan ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        // Memeriksa apakah urutan kurung benar
        if (cekUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung benar.");
        } else {
            System.out.println("Urutan kurung salah.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk memeriksa urutan kurung menggunakan stack
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '{' || karakter == '[') {
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                if (stack.isEmpty()) {
                    return false; // Terdapat kurung tutup tanpa pasangan kurung buka
                }

                char kurungBuka = stack.pop();
                if (!pasanganKurung(kurungBuka, karakter)) {
                    return false; // Kurung buka dan tutup tidak sesuai
                }
            }
        }

        return stack.isEmpty(); // Urutan kurung benar jika stack kosong
    }

    // Metode untuk memeriksa pasangan kurung
    public static boolean pasanganKurung(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
               (kurungBuka == '{' && kurungTutup == '}') ||
               (kurungBuka == '[' && kurungTutup == ']');
    }
}
