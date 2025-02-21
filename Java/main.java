import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi list untuk menyimpan data produk Petshop
        ArrayList<PetShop> petshopData = new ArrayList<>();
        // Inisialisasi variabel untuk menyimpan pilihan menu
        int menu = 0;
        Scanner scanner = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("Latihan Praktikum DPBO 1 2025\n");

        // Looping untuk menampilkan menu secara terus-menerus
        while (true) {
            // Output pilihan menu
            System.out.println("Pilihan Menu:");
            System.out.println("1. Menambahkan data produk Petshop");
            System.out.println("2. Menampilkan data produk Petshop");
            System.out.println("3. Mengubah data produk Petshop");
            System.out.println("4. Cari produk");
            System.out.println("5. Hapus produk");
            System.out.println("6. Keluar dari Program");
            System.out.println();

            // Input user untuk menu di atas
            System.out.print("Masukkan menu pilihan: ");
            menu = scanner.nextInt();

            // Pilihan menu 1: Menambahkan data produk Petshop
            if (menu == 1) {
                // Membuat objek PetShop baru
                PetShop produk = new PetShop();
                // Menambahkan data produk
                produk.tambah();
                // Menyimpan data produk ke dalam list
                petshopData.add(produk);
            }
            // Pilihan menu 2: Menampilkan data produk Petshop
            else if (menu == 2) {
                // Menampilkan data produk
                new PetShop().tampil(petshopData);
            }
            // Pilihan menu 3: Mengubah data produk Petshop
            else if (menu == 3) {
                // Mengubah data produk
                new PetShop().ubah(petshopData);
            }
            // Pilihan menu 4: Cari produk
            else if (menu == 4) {
                // Mencari produk
                new PetShop().cari(petshopData);
            }
            // Pilihan menu 5: Hapus produk
            else if (menu == 5) {
                // Menghapus produk
                new PetShop().hapus(petshopData);
            }
            // Pilihan menu 6: Keluar dari Program
            else if (menu == 6) {
                // Keluar dari program
                break;
            }
            // Pilihan menu tidak valid
            else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close(); // Menutup scanner
    }
}