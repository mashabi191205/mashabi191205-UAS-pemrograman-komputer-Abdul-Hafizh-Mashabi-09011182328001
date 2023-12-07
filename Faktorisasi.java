import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input 
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan faktorisasi
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);
        scanner.close();
    }

    //  melakukan faktorisasi
    public static void faktorisasi(int bilangan) {
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;

                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
