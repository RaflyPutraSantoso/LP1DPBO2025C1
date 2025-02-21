```php
<?php
/**
 * Kelas PetShop digunakan untuk mengelola data produk pet shop.
 */
class PetShop
{
    // Atribut private untuk menyimpan data produk
    private $id;
    private $nama;
    private $nkategori;
    private $nharga;
    private $foto;

    /**
     * Konstruktor untuk menginisialisasi objek PetShop.
     * 
     * @param int $id ID produk
     * @param string $nama Nama produk
     * @param string $nkategori Kategori produk
     * @param string $nharga Harga produk
     * @param string $foto Foto produk
     */
    public function __construct($id = 0, $nama = '', $nkategori = '', $nharga = '', $foto = '')
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->nkategori = $nkategori;
        $this->nharga = $nharga;
        $this->foto = $foto;
    }

    // Setter untuk mengatur nilai atribut
    public function setId($id)
    {
        $this->id = $id;
    }

    public function setNama($nama)
    {
        $this->nama = $nama;
    }

    public function setnKategori($nkategori)
    {
        $this->nkategori = $nkategori;
    }

    public function setNharga($nharga)
    {
        $this->nharga = $nharga;
    }

    public function setFoto($foto)
    {
        $this->foto = $foto;
    }

    // Getter untuk mendapatkan nilai atribut
    public function getId()
    {
        return $this->id;
    }

    public function getNama()
    {
        return $this->nama;
    }

    public function getnKategori()
    {
        return $this->nkategori;
    }

    public function getNharga()
    {
        return $this->nharga;
    }

    public function getFoto()
    {
        return $this->foto;
    }

    /**
     * Metode untuk menampilkan data produk.
     */
    public function tampil()
    {
        // Buat objek produk
        $item1 = new PetShop("1", "Wiskas", "Makanan kucing", "55000", "PetShop.jpg");
        $item2 = new PetShop("2", "Bolt", "Makanan kucing", "19400", "PetShop.jpg");
        $item3 = new PetShop("3", "Poocha", "Makanan basah kucing", "8750", "PetShop.jpg");
        $item4 = new PetShop("4", "Pedigree", "Makanan anjing", "100350", "PetShop.jpg");
        $item5 = new PetShop("5", "Miso", "Makanan anjing", "90000", "PetShop.jpg");

        // Simpan objek dalam array
        $items = array($item1, $item2, $item3, $item4, $item5);

        // Tampilkan data
        $this->outputTable($items);

        // Buat objek produk baru
        $item6 = new PetShop("6", "Cesar", "Makanan anjing", "18500", "PetShop.jpg");
        // Tambahkan objek baru ke array
        array_push($items, $item6);
        // Tampilkan data yang telah diperbarui
        $this->outputTable($items);

        // Hapus objek dari array
        array_splice($items, 5, 1);
        // Tampilkan data setelah penghapusan
        $this->outputTable($items);
    }

    /**
     * Metode untuk menampilkan data produk dalam bentuk tabel.
     * 
     * @param array $items Array objek produk
     */
    private function outputTable($items)
    {
        echo "<br> +-----------------------+ <br>";
        echo "| Data Produk PetShop | <br>";
        echo "+-----------------------+ <br>";
        // Buat tabel
        echo "<table>";
        echo "<tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Kategori</th>
                <th>Harga</th>
                <th>Foto</th>
            </tr>";
        // Tampilkan isi tabel
        foreach ($items as $item) {
            echo "<tr>";
            echo "<td>" . $item->getId() . "</td>";
            echo "<td>" . $item->getNama() . "</td>";
            echo "<td>" . $item->getnKategori() . "</td>";
            echo "<td>" . $item->getNharga() . "</td>";
            echo "<td><img src='image/" . $item->getFoto() . "' alt='" . $item->getNama() . "'</td>";
            echo "</tr>";
        }
        echo "</table>";
    }
}
?>
