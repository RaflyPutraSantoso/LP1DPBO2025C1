import java.util.ArrayList;
import java.util.Scanner;

class PetShop {
    // Atribut
    private int id; // ID produk
    private String nama; // Nama produk
    private String nkategori; // Kategori produk
    private String nharga; // Harga produk

    // Konstruktor default
    public PetShop() {
        this.id = 0;
        this.nama = "";
        this.nkategori = "";
        this.nharga = "";
    }

    // Konstruktor dengan parameter
    public PetShop(int id, String nama, String nkategori, String nharga) {
        this.id = id;
        this.nama = nama;
        this.nkategori = nkategori;
        this.nharga = nharga;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNkategori(String nkategori) {
        this.nkategori = nkategori;
    }

    public void setNharga(String nharga) {
        this.nharga = nharga;
    }

    // Getter methods
    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNkategori() {
        return this.nkategori;
    }

    public String getNharga() {
        return this.nharga;
    }

    // Method untuk menambahkan data baru
    public void tambah() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("= = = = Menambahkan Data Baru = = = =");
        System.out.print("Masukkan ID Anggota PetShop: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan Nama produk PetShop: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan kategori PetShop: ");
        this.nkategori = scanner.nextLine();
        System.out.print("Masukkan Harga produk: ");
        this.nharga = scanner.nextLine();
        System.out.println("\nData berhasil ditambahkan!");
        System.out.println("= = = = = = = = = = = = = = = = = = =\n");
    }

    // Method untuk menampilkan data
    public void tampil(ArrayList<PetShop> data) {
        System.out.println("= = =  = List Produk PetShop = = = =");
        if (data.isEmpty()) {
            System.out.println("Kosong \n");
        } else {
            for (PetShop item : data) {
                System.out.println("=================================");
                System.out.println("ID                 : " + item.getId());
                System.out.println("Nama Produk        : " + item.getNama());
                System.out.println("Kategori Produk    : " + item.getNkategori());
                System.out.println("Harga Produk       : " + item.getNharga());
                System.out.println("=================================\n");
            }
        }
    }

    // Method untuk mengubah data
    public void ubah(ArrayList<PetShop> data) {
        tampil(data);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID produk PetShop yang akan diubah: ");
        int cari = scanner.nextInt();
        boolean found = false;

        for (PetShop item : data) {
            if (cari == item.getId()) {
                scanner.nextLine(); // Consume newline
                System.out.print("Masukkan Nama Produk PetShop: ");
                item.setNama(scanner.nextLine());
                System.out.print("Masukkan kategori produk: ");
                item.setNkategori(scanner.nextLine());
                System.out.print("Masukkan harga produk: ");
                item.setNharga(scanner.nextLine());
                System.out.println("\nData berhasil diubah!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nID tidak ditemukan!");
        }
        System.out.println("= = = = = = = = = = = = = = = = = =\n");
    }

    // Method untuk mencari data
    public void cari(ArrayList<PetShop> data) {
        tampil(data);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID produk PetShop yang ingin dicari: ");
        int cari = scanner.nextInt();
        boolean found = false;

        for (PetShop item : data) {
            if (cari == item.getId()) {
                System.out.println("Produk ditemukan dengan ID          : " + item.getId());
                System.out.println("Nama Produk                         : " + item.getNama());
                System.out.println("Kategori Produk                     : " + item.getNkategori());
                System.out.println("Harga Produk                        : " + item.getNharga());
                System.out.println("=================================\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("ID tidak ditemukan!");
        }
    }

    // Method untuk menghapus data
    public void hapus(ArrayList<PetShop> data) {
        tampil(data);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID produk PetShop yang ingin dihapus: ");
        int cari = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < data.size(); i++) {
            if (cari == data.get(i).getId()) {
                data.remove(i);
                System.out.println("\nData berhasil dihapus!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nID tidak ditemukan!");
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");
    }
}