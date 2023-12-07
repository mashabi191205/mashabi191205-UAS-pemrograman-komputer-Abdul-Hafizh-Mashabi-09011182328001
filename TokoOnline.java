import java.util.Scanner;

public class TokoOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang yang dibeli oleh pelanggan
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Input harga per barang
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = scanner.nextDouble();

        // Hitung total harga sebelum diskon
        double totalHarga = jumlahBarang * hargaPerBarang;

        // Hitung diskon berdasarkan jumlah pembelian
        double diskon = 0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.10; // Diskon 10%
        } else if (jumlahBarang > 20) {
            diskon = 0.20; // Diskon 20%
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Tampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);

        // Tutup scanner
        scanner.close();
    }
}
