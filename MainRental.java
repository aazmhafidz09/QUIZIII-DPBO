import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar kendaraan
        List<Kendaraan> daftarKendaraan = new ArrayList<>();

        // Menambahkan beberapa kendaraan ke daftar
        daftarKendaraan.add(new Mobil("B1234XYZ", "Toyota Avanza", 2018, 7));
        daftarKendaraan.add(new Motor("B5678ABC", "Honda Beat", 2020, "Matic"));
        daftarKendaraan.add(new Truk("B9012DEF", "Mitsubishi Fuso", 2015, 10));

        System.out.println("=== Sistem Rental Kendaraan ===");

        // Menampilkan daftar kendaraan
        System.out.println("Daftar Kendaraan yang Tersedia:");
        for (int i = 0; i < daftarKendaraan.size(); i++) {
            Kendaraan k = daftarKendaraan.get(i);
            System.out.print((i + 1) + ". " + k.getMerk() + " (" + k.getPlatNomor() + ") - ");

            if (k instanceof Mobil) {
                System.out.println("Mobil");
            } else if (k instanceof Motor) {
                System.out.println("Motor");
            } else if (k instanceof Truk) {
                System.out.println("Truk");
            }
        }

        // Memilih kendaraan
        System.out.print("Pilih nomor kendaraan yang ingin disewa: ");
        int pilihanKendaraan = scanner.nextInt();
        Kendaraan kendaraanDipilih = daftarKendaraan.get(pilihanKendaraan - 1);

        // Memasukkan lama sewa
        System.out.print("Masukkan lama sewa (dalam hari): ");
        int hariSewa = scanner.nextInt();

        // Menentukan layanan tambahan
        List<LayananTambahan> layananTambahan = new ArrayList<>();
        System.out.print("Apakah ingin menambahkan asuransi? (y/n): ");
        String pilihAsuransi = scanner.next();
        if (pilihAsuransi.equalsIgnoreCase("y")) {
            layananTambahan.add(new Asuransi());
        }

        System.out.print("Apakah ingin menambahkan supir? (y/n): ");
        String pilihSupir = scanner.next();
        if (pilihSupir.equalsIgnoreCase("y")) {
            layananTambahan.add(new Supir());
        }

        // Menghitung biaya sewa kendaraan
        double totalBiaya = kendaraanDipilih.hitungBiayaSewa(hariSewa);

        // Menghitung biaya layanan tambahan
        for (LayananTambahan layanan : layananTambahan) {
            totalBiaya += layanan.hitungTambahan(hariSewa);
        }

        // Menampilkan rincian sewa
        System.out.println("\n=== Rincian Sewa ===");
        System.out.println("Kendaraan: " + kendaraanDipilih.getMerk() + " (" + kendaraanDipilih.getPlatNomor() + ")");
        System.out.println("Lama Sewa: " + hariSewa + " hari");
        System.out.println("Biaya Sewa Kendaraan: Rp" + kendaraanDipilih.hitungBiayaSewa(hariSewa));

        if (!layananTambahan.isEmpty()) {
            System.out.println("Biaya Layanan Tambahan:");
            for (LayananTambahan layanan : layananTambahan) {
                if (layanan instanceof Asuransi) {
                    System.out.println("- Asuransi: Rp" + layanan.hitungTambahan(hariSewa));
                } else if (layanan instanceof Supir) {
                    System.out.println("- Supir: Rp" + layanan.hitungTambahan(hariSewa));
                }
            }
        }

        System.out.println("Total Biaya Sewa: Rp" + totalBiaya);

        scanner.close();
    }
}
