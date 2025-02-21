#library
from PetShop import PetShop
import os

if __name__ == "__main__":
    # Inisialisasi list untuk menyimpan data produk Petshop
    petshop_data = []
    # Inisialisasi variabel untuk menyimpan pilihan menu
    menu = 0

    # Menampilkan judul program
    print("Latihan Praktikum DPBO 1 2025\n")

    # Looping untuk menampilkan menu secara terus-menerus
    while True:
        # Output pilihan menu
        print("Pilihan Menu:")
        print("1. Menambahkan data produk Petshop")
        print("2. Menampilkan data produk Petshop")
        print("3. Mengubah data produk Petshop")
        print("4. Cari produk")
        print("5. Hapus produk")
        print("6. Keluar dari Program")
        print("\n")

        # Input user untuk menu di atas
        menu = int(input("Masukkan menu pilihan: "))

        # Pilihan menu 1: Menambahkan data produk Petshop
        if menu == 1:
            # Membuat objek PetShop baru
            produk = PetShop()
            # Menambahkan data produk
            produk.tambah()
            # Menyimpan data produk ke dalam list
            petshop_data.append(produk)
        # Pilihan menu 2: Menampilkan data produk Petshop
        elif menu == 2:
            # Menampilkan data produk
            PetShop().tampil(petshop_data)
        # Pilihan menu 3: Mengubah data produk Petshop
        elif menu == 3:
            # Mengubah data produk
            PetShop().ubah(petshop_data)
        # Pilihan menu 4: Cari produk
        elif menu == 4:
            # Mencari produk
            PetShop().cari(petshop_data)
        # Pilihan menu 5: Hapus produk
        elif menu == 5:
            # Menghapus produk
            PetShop().hapus(petshop_data)
        # Pilihan menu 6: Keluar dari Program
        elif menu == 6:
            # Keluar dari program
            break
        # Pilihan menu tidak valid
        else:
            print("Pilihan tidak valid!")