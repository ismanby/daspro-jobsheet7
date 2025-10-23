import java.util.Scanner;

public class Bioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi dan inisialisasi
        int harga_tiket = 50000;
        int totalTiket = 0;
        double totalPendapatan = 0, hargaTotal;
        int jumlahTiket;
        String jawaban;

        do {
            // Input jumlah tiket
            System.out.print("\nMasukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            // Jika input negatif, abaikan dan minta input lagi
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket > 0.");
                continue;
            }

            // Hitung harga total sebelum diskon
            hargaTotal = jumlahTiket * harga_tiket;

            // Diskon
            if (jumlahTiket > 10) {
                hargaTotal *= 0.85; // diskon 15%
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90; // diskon 10%
            }

            // Update total tiket dan pendapatan
            totalTiket += jumlahTiket;
            totalPendapatan += hargaTotal;

            // Output harga total untuk transaksi ini
            System.out.println("Harga untuk transaksi ini: Rp " + hargaTotal);
            System.out.println("-----------------------------------");

            sc.nextLine();

            System.out.print("Apakah ada transaksi lain? (ya/tidak): ");
            jawaban = sc.nextLine();

            // Keluar dari loop jika tidak ada transaksi lain
            if (jawaban.equalsIgnoreCase("tidak")) {
                break; 
            }

            // Lanjutkan loop
        } while (true);

        // Output rekap penjualan
        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);

        sc.close();
    }
}
