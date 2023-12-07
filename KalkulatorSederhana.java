import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input 
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Memanggil operator yang dimasukkan
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operator tidak valid.");
                break;
        }

        // Menampilkan hasil perhitungan
        System.out.println("Hasil: " + hasil);
        scanner.close();
    }

    // penjumlahan
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    // pengurangan
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    // perkalian
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    // pembagian
    public static double bagi(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
            return 0;
        }
    }
}

