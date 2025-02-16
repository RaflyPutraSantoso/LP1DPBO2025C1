//library
#include <iostream>
#include <string>

using namespace std;

//deklarasi class
class PetShop
{
    private:
        int id;         //id 
        string nama;    //nama Produk
        string nkategori; //kategori produk
        string nharga; //harga produk
    
    public:
        //constructor
        PetShop()
        {
            this->id = 0;
            this->nama = "";
            this->nkategori = "";
            this->nharga = "";
        }
        PetShop(int n, string nama, string nkategori, string nharga)
        {
            this->id = n;
            this->nama = nama;
            this->nkategori = nkategori;
            this->nharga = nharga;
        }

        //setter
        void setId(int n)
        {
            this->id = n;
        }
        void setNama(string nama)
        {
            this->nama = nama;
        }
        void setnkategori(string nkategori)
        {
            this->nkategori = nkategori;
        }
        void setnharga(string nharga)
        {
            this->nharga = nharga;
        }

        //getter
        int getId()
        {
            return this->id;
        }
        string getNama()
        {
            return this->nama;
        }
        string getnkategori()
        {
            return this->nkategori;
        }
        string getnharga()
        {
            return this->nharga;
        }

        //methods
        //menambahkan data produk PetShop
        void tambah()
        {
            system("cls");
            cout << "= = = = Menambahkan Data Baru = = = =" << endl;
            cout << "Masukkan ID Anggota PetShop        : ";  
            cin >> this->id;
            cout << "Masukkan Nama produk PetShop       : ";
            cin >> this->nama;
            cout << "Masukkan kategori PetShop          : ";
            cin >> this->nkategori;
            cout << "Masukkan Harga produk              : ";
            cin >> this->nharga;
            cout << "\nData berhasil ditambahkan!" << endl;
            cout << "= = = = = = = = = = = = = = = = = = =\n" << endl;
        }

        //menampilkan data produk PetShop
        void tampil(PetShop data[], int n)
        {
            system("cls");
            cout << "= = =  = List Produk PetShop = = = =" << endl;
            
            if (n == 0) //kalau datanya kosong
            {
                cout << "Kosong \n" << endl;
            }
            else        //kalo ngga tampilin datanya
            {
                for (int i = 0; i < n; i++) 
                {
                    cout << "=================================" << endl;
                    cout << "ID                 : " << data[i].id << endl;
                    cout << "Nama Produk        : " << data[i].nama << endl;
                    cout << "Kategori Produk    : " << data[i].nkategori << endl;
                    cout << "Harga Produk       : " << data[i].nharga << endl;                  
                    cout << "=================================\n" << endl;
                }
            }
        }

        //mengubah data produk PetShop
        void ubah(PetShop data[], int n)
        {
            system("cls");
            tampil(data, n);

            int cari, flag = 0;
            //input user 
            cout << "= = = Update Data produk PetShop = = =" << endl;
            cout << "Masukkan ID produk PetShop yang akan diubah : ";
            cin >> cari;
            //update setiap atribut
            for (int i = 0; i < n; i++)
            {   
                //kalau data id sama dengan yg dicari
                if (cari == data[i].getId())
                {
                    cout << "\n";
                    cout << "Masukkan Nama Produk PetShop        : ";
                    cin >> data[i].nama;
                    cout << "Masukkan kategori produk            : ";
                    cin >> data[i].nkategori;
                    cout << "Masukkan harga produk               : ";
                    cin >> data[i].nharga;
                    cout << "\nData berhasil diubah!" << endl;
                    //flag menjadi 1
                    flag = 1;
                    break;
                }
            }
            //kalau flag != 1 maka
            if (flag != 1)
            {
                cout << "\nID tidak ditemukan!" << endl;
            }
            cout << "= = = = = = = = = = = = = = = = = =\n" << endl;
        }

        //mencari data produk
        void cari (PetShop data[],int n)
        {
            system("cls");
            tampil(data, n);

            int cari, flag = 0;
            //input user
            cout << "= = = = = = = = = = = = = = = = =" << endl;
            cout << "Masukkan ID produk PetShop yang ingin dicari : ";
            cin >> cari;
            //mencari data
            for (int i = 0; i < n; i++)
            {
                //kalau data id sama dengan yg dicari
                if (cari == data[i].getId())
                {
                    cout << "Produk ditemukan dengan ID          : " << data[i].id << endl;
                    cout << "Nama Produk                         : " << data[i].nama << endl;
                    cout << "Kategori Produk                     : " << data[i].nkategori << endl;
                    cout << "Harga Produk                        : " << data[i].nharga << endl;                  
                    cout << "=================================\n" << endl;
                }
            }

        }

        //menghapus data produk PetShop
        void hapus (PetShop data[], int &n)
        {
            system("cls");
            tampil(data, n);

            int cari, flag = 0;
            //input user
            cout << "= = = = = = Hapus data produk PetShop = = = = = =" << endl;
            cout << "Masukkan ID produk PetShop yang ingin dihapus : ";
            cin >> cari;
            //hapus semua atribut
            for (int i = 0; i < n; i++)
            {
                //kalau data id sama dengan yang dicari
                if (cari == data[i].getId())
                {
                    for (int j = i; j < n; j++)
                    {
                        data[j] = data[j+1];
                    }
                    n--;

                    cout << "\nData berhasil dihapus!" << endl;
                    //flag menjadi 1
                    flag = 1;   
                    break;
                }
            }
            //selain 1 maka
            if (flag != 1)
            {
                cout << "\nID tidak ditemukan!" << endl;
            }
            cout << "= = = = = = = = = = = = = = = = = = = = = = = =" << endl;
        }
       
        //destructors
        ~PetShop()
        {

        };
};
