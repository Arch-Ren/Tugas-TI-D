import java.util.Scanner;
import java.util.ArrayList;

public class StudiKasusArrayBertingkat {
    static Scanner input = new Scanner(System.in);

    static void MenuUtama () {
        System.out.println("Menu: ");
        System.out.println(" 1. Daftar buah stok dan harga\n 2. Ubah data\n 3. Pembelian\n 0. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    static void MenuUbahData() {
        System.out.println(" 1. Ubah data buah\n 2. Ubah stok buah\n 3. Ubah harga buah\n 0. Keluar");
        System.out.print("Pilih data yang ingin diubah: ");
    }

    static void MenuUbahDataBuah () {
        System.out.print("Pilih menu: \n 1. Tambah buah\n 2. Hapus buah\n 0. Keluar");
        System.out.print("\n Masukkan pilihan: ");
    }

    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        ArrayList<Integer> stok = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        buah.add("Pisang"); buah.add("Apel"); buah.add("Jeruk");
        stok.add(20); stok.add(30); stok.add(25);
        harga.add(10000); harga.add(8000); harga.add(7000);
        String Ulang;

        MenuUtama();
        int pilih = input.nextInt();
        input.nextLine();
        while(pilih != 0) {
            if (pilih < 0 || pilih > 3) {
                System.out.print("Opsi tidak ditemukan.");
            } else {  
                switch(pilih) {     //pilihan menu utama
                    case 1:             //Tampilkan daftar buah stok harga
                        System.out.printf("%14s%7s%10s%n", "Buah", "Stok", "Harga");
                        for (int i = 0; i < buah.size(); i++) {
                            System.out.printf("%2d. %10s%7d%10d%n", (i+1), buah.get(i), stok.get(i), harga.get(i));
                        }
                        System.out.println();
                        break;

                    case 2:             //Ubah data
                        MenuUbahData();
                        int ubah = input.nextInt();
                        input.nextLine();
                        while (ubah != 0) {
                            if (ubah < 0 || ubah > 3) {
                                System.out.print("Opsi tidak ditemukan.");
                            } else {
                                switch (ubah) {         //pengubahan data
                                    case 1:         //Ubah data buah
                                        MenuUbahDataBuah();
                                        int pilih2 = input.nextInt();
                                        input.nextLine();
                                        while (pilih2 != 0) {
                                            if (pilih2 < 0 || pilih2 > 2) {
                                                System.out.print("Opsi tidak ditemukan.");
                                            } else {
                                                switch(pilih2) {
                                                    case 1:         //Tambah buah
                                                        do {
                                                            System.out.print("Masukkan nama buah: ");
                                                            String buahbaru = input.next();
                                                            buah.add(buahbaru);
                                                            System.out.print("Masukkan stok buah: ");
                                                            int stokbaru = input.nextInt();
                                                            stok.add(stokbaru);
                                                            System.out.print("Masukkan harga buah: ");
                                                            int hargabaru = input.nextInt();
                                                            harga.add(hargabaru);
                                                            input.nextLine();
                                                            System.out.print("Data berhasil ditambahkan. Tambah data lagi? (Y/T) ");
                                                            Ulang = input.nextLine().toUpperCase();
                                                        } while (Ulang.charAt(0) == 'Y');
                                                        break;

                                                    case 2:             //Hapus buah
                                                        do {    
                                                            System.out.printf("%14s%7s%10s%n", "Buah", "Stok", "Harga");
                                                            for (int i = 0; i < buah.size(); i++) {
                                                                System.out.printf("%2d. %10s%7d%10d%n", (i+1), buah.get(i), stok.get(i), harga.get(i));
                                                            }
                                                            System.out.print("Pilih buah yang ingin dihapus: ");
                                                            int hapus = input.nextInt();
                                                            buah.remove(hapus-1);
                                                            stok.remove(hapus-1);
                                                            harga.remove(hapus-1);
                                                            input.nextLine();
                                                            System.out.print("Penghapusan selesai. Hapus lagi? (Y/T) ");
                                                            Ulang = input.nextLine().toUpperCase();
                                                            } while (Ulang.charAt(0) == 'Y');
                                                        break;
                                                }
                                            }
                                            System.out.println("Keluar dari ubah data buah");
                                            MenuUbahDataBuah();
                                            pilih2 = input.nextInt();
                                        }
                                        break;

                                    case 2:         //Ubah stok buah
                                    do {
                                        System.out.printf("%14s%7s%n", "Buah", "Stok");
                                        for (int i = 0; i < buah.size(); i++) {
                                            System.out.printf("%2d. %10s%7d%n", (i+1), buah.get(i), stok.get(i));
                                        }
                                        System.out.print("Pilih buah yang ingin diubah stoknya: ");
                                        int ubahstok = input.nextInt();
                                        System.out.print("Masukkan stok sekarang: ");
                                        int stokbaru = input.nextInt();
                                        stok.set((ubahstok-1), stokbaru);
                                        input.nextLine();
                                        System.out.print("Stok " + buah.get(ubahstok-1) + " berhasil diubah. Ingin mengubah stok lagi? (Y/T) ");
                                        Ulang = input.next().toUpperCase();
                                    } while (Ulang.charAt(0) == 'Y');
                                    break;

                                    case 3:         //Ubah harga buah
                                        do {
                                            System.out.printf("%14s%10s%n", "Buah", "Harga");
                                            for (int i = 0; i < buah.size(); i++) {
                                                System.out.printf("%2d. %10s%10d%n", (i+1), buah.get(i), harga.get(i));
                                            }
                                            System.out.print("Pilih buah yang ingin diubah harganya: ");
                                            int ubahharga = input.nextInt();
                                            System.out.print("Masukkan harga baru: ");
                                            int hargabaru = input.nextInt();
                                            harga.set((ubahharga-1), hargabaru);
                                            input.nextLine();
                                            System.out.print("Harga " + buah.get(ubahharga-1) + " berhasil diubah. Ingin mengubah harga lagi? (Y/T) ");
                                            Ulang = input.next().toUpperCase();
                                            } while (Ulang.charAt(0) == 'Y');
                                        break;
                                }
                            }

                            System.out.println("Keluar dari menu ubah data buah \n Menu Ubah Data");
                            MenuUbahData();
                            ubah = input.nextInt();
                        }
                        System.out.println("Keluar dari menu ubah data");
                        break;

                    case 3:
                        System.out.print("Masukkan buah yang dibeli: ");
                        int beli = input.nextInt();
                        System.out.print("Beli berapa kilo: ");
                        int kiloan = input.nextInt();
                        //ambil stoklama
                        int stoklama = stok.get(beli-1);
                        //stok buah dibeli
                        stok.set((beli-1), (stoklama - kiloan));
                        System.out.println("Pembelian berhasil.");
                        System.out.println("Stok " + buah.get((beli-1)) + " sekarang adalah " + stok.get(beli-1));
                        break;
                }

                for(int i = 0; i < stok.size(); i++) {              //program peringatan
                    if (stok.get(i) <= 10) {
                        System.out.println("\n=== Peringatan Stok Rendah ===");
                        System.out.println("Stok " + buah.get(i) + " sisa " + stok.get(i));
                        System.out.println();
                    }
                }

                System.out.println("Kembali ke menu utama");
                MenuUtama();
                pilih = input.nextInt();
            }
        }           //Keluar dari while menu utama

        System.out.println("Keluar dari program. Terima kasih");   
        input.close();
    }
}