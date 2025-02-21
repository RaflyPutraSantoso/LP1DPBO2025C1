class PetShop:
    # Konstruktor untuk menginisialisasi atribut PetShop
    def __init__(self, n=0, nama="", nkategori="", nharga=""):
        self.id = n  # ID produk PetShop
        self.nama = nama  # Nama produk PetShop
        self.nkategori = nkategori  # Kategori produk PetShop
        self.nharga = nharga  # Harga produk PetShop

    # Setter methods untuk mengubah nilai atribut
    def set_id(self, n):
        self.id = n  # Mengubah ID produk PetShop

    def set_nama(self, nama):
        self.nama = nama  # Mengubah nama produk PetShop

    def set_nkategori(self, nkategori):
        self.nkategori = nkategori  # Mengubah kategori produk PetShop

    def set_nharga(self, nharga):
        self.nharga = nharga  # Mengubah harga produk PetShop

    # Getter methods untuk mengambil nilai atribut
    def get_id(self):
        return self.id  # Mengambil ID produk PetShop

    def get_nama(self):
        return self.nama  # Mengambil nama produk PetShop

    def get_nkategori(self):
        return self.nkategori  # Mengambil kategori produk PetShop

    def get_nharga(self):
        return self.nharga  # Mengambil harga produk PetShop

    # Method untuk menambahkan data baru
    def tambah(self):
        print("= = = = Menambahkan Data Baru = = = =")
        self.id = int(input("Masukkan ID Anggota PetShop: "))
        self.nama = input("Masukkan Nama produk PetShop: ")
        self.nkategori = input("Masukkan kategori PetShop: ")
        self.nharga = input("Masukkan Harga produk: ")
        print("\nData berhasil ditambahkan!")
        print("= = = = = = = = = = = = = = = = = = =\n")
        return self

    # Method untuk menampilkan data
    def tampil(self, data):
        print("= = =  = List Produk PetShop = = = =")
        if len(data) == 0:
            print("Kosong \n")
        else:
            for item in data:
                print("=================================")
                print(f"ID                 : {item.get_id()}")
                print(f"Nama Produk        : {item.get_nama()}")
                print(f"Kategori Produk    : {item.get_nkategori()}")
                print(f"Harga Produk       : {item.get_nharga()}")
                print("=================================\n")

    # Method untuk mengubah data
    def ubah(self, data):
        self.tampil(data)
        cari = int(input("Masukkan ID produk PetShop yang akan diubah: "))
        flag = 0

        for item in data:
            if cari == item.get_id():
                item.set_nama(input("Masukkan Nama Produk PetShop: "))
                item.set_nkategori(input("Masukkan kategori produk: "))
                item.set_nharga(input("Masukkan harga produk: "))
                print("\nData berhasil diubah!")
                flag = 1
                break

        if flag != 1:
            print("\nID tidak ditemukan!")
        print("= = = = = = = = = = = = = = = = = =\n")

    # Method untuk mencari data
    def cari(self, data):
        self.tampil(data)
        cari = int(input("Masukkan ID produk PetShop yang ingin dicari: "))
        flag = 0

        for item in data:
            if cari == item.get_id():
                print(f"Produk ditemukan dengan ID          : {item.get_id()}")
                print(f"Nama Produk                         : {item.get_nama()}")
                print(f"Kategori Produk                     : {item.get_nkategori()}")
                print(f"Harga Produk                        : {item.get_nharga()}")
                print("=================================\n")
                flag = 1
                break

        if flag == 0:
            print("ID tidak ditemukan!")

    # Method untuk menghapus data
    def hapus(self, data):
        self.tampil(data)
        cari = int(input("Masukkan ID produk PetShop yang ingin dihapus: "))
        flag = 0

        for i in range(len(data)):
            if cari == data[i].get_id():
                del data[i]
                print("\nData berhasil dihapus!")
                flag = 1
                break

        if flag != 1:
            print("\nID tidak ditemukan!")
        print("= = = = = = = = = = = = = = = = = = = = = = = =")

# Contoh penggunaan
if __name__ == "__main__":
    petshop_data = []
    while True:
        print("1. Tambah Produk")
        print("2. Tampilkan Produk")
        print("3. Ubah Produk")
        print("4. Cari Produk")
        print("5. Hapus Produk")
        print("6. Keluar")
        choice = int(input("Pilih opsi: "))

        if choice == 1:
            produk = PetShop()
            petshop_data.append(produk.tambah())
        elif choice == 2:
            PetShop().tampil(petshop_data)
        elif choice == 3:
            PetShop().ubah(petshop_data)
        elif choice == 4:
            PetShop().cari(petshop_data)
        elif choice == 5:
            PetShop().hapus(petshop_data)
        elif choice == 6:
            break
        else:
            print("Pilihan tidak valid!")