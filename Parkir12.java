import java.util.Scanner;

public class Parkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel
        int jenis, durasi, total = 0;

        do {
            // Input jenis kendaraan
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 keluar): ");
            jenis = sc.nextInt();

            // Jika jenis kendaraan valid, input durasi parkir
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                // Hitung biaya parkir berdasarkan jenis kendaraan dan durasi
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } 

            // Jika input 0, keluar dari loop
        } while (jenis != 0);

        // Tampilkan total biaya parkir
        System.out.println("Total biaya parkir: Rp " + total);
        
        sc.close();
    }
}
