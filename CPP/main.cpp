#include <iostream>
#include "PetShop.cpp"

using namespace std;

int main()
{
    system("cls");

    PetShop data[99];
    int menu, n = 0;

    cout << "Latihan Praktikum DPBO 1 2025\n" << endl;
    do
    {
        //output pilihan menu
        cout << "Pilihan Menu :" << endl;
        cout << "1. Menambahkan data produk Petshop" << endl;
        cout << "2. Menampilkan data produk Petshop" << endl;
        cout << "3. Mengubah data produk Petshop" << endl;
        cout << "4. cari produk" << endl;
        cout << "5. Hapus produk" << endl;
        cout << "6. Keluar dari Program" << endl;
        cout << "\n";

        //input user untuk menu diatas
        cout << "Masukkan menu pilihan : ";
        cin >> menu;

        switch (menu)
        {
            //case 1 untuk menambahkan data
            case 1:
                data[n].tambah();
                n++;
                break;
            //case 2 untuk menampilkan semua data
            case 2:
                data->tampil(data, n);
                break;
            //case 3 untuk mengubah data berdasarkan id
            case 3:
                data->ubah(data, n);
                break;
            case 4:
            //case 4 untuk mencari data berdasarkan id
                data->cari(data, n);
                break;
            case 5:
            //case 5 untuk menghapus data berdasarkan id
                data->hapus(data, n);
                break;
            default:
                break;
        }
    //6 untuk keluar dari program (stop looping)
    } while (menu != 6);
    
    return 0;
}