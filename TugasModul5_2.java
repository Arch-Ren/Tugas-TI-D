import java.util.Scanner;
import java.util.ArrayList;

public class TugasModul5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][]kereta = new String [][] {
        {"Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada"},
        {"Bisnis", "100000", "5%", "Ada", "Tidak ada"},
        {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"},
        {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };
        int pilihan, jamberangkat, menitberangkat;
        ArrayList<Integer> Penumpang = new ArrayList<>();
        ArrayList<String> Berangkat = new ArrayList<>();
        ArrayList<String> Tujuan = new ArrayList <>();
        ArrayList<Integer> JamBerangkat = new ArrayList <>();
        ArrayList<Integer> MenitBerangkat = new ArrayList<>();
        ArrayList<Integer> PilihKereta = new ArrayList<>();
        boolean belitiket = false;

        //Pilih  menu
        do {
            System.out.println("Menu: \n 1. Daftar kereta api\n 2. Daftar kereta api ber-AC\n 3. Daftar kereta api yang memiliki colokan\n 4. Pesan tiket kereta api\n 5. Lihat tiket pesanan\n 0. Keluar");
            System.out.print("Masukkan nilai: ");
            pilihan = input.nextInt();
                if(pilihan < 0 || pilihan > 5) {
                    System.out.println("Opsi tidak ditemukan. Kembali ke menu.");
                }
                switch(pilihan) {
                    case 1:
                        System.out.printf("%12s%12s%12s%12s%12s%n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                        for(int i = 0; i < kereta.length; i++) {
                            for(int j = 0; j < kereta[i].length; j++) {
                                System.out.printf("%12s", kereta[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println("Kembali ke menu utama.");
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Daftar kereta ber-AC: ");
                        System.out.printf("%12s%12s%12s%12s%12s%n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                        for(int i = 0; i < kereta.length; i++) {
                            if(kereta[i][3].equalsIgnoreCase("ada")) {
                                for(int j = 0; j < kereta[i].length; j++) {
                                    System.out.printf("%12s", kereta[i][j]);
                                }
                                System.out.println();
                            }
                        }
                        System.out.println("Kembali ke menu utama.");
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Daftar kereta memiliki colokan: ");
                        System.out.printf("%12s%12s%12s%12s%12s%n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                        System.out.println("===============================================================");
                        for(int i = 0; i < kereta.length; i++) {
                            if(kereta[i][4].equalsIgnoreCase("ada")) {
                                for(int j = 0; j < kereta[i].length; j++) {
                                    System.out.printf("%12s", kereta[i][j]);
                                }
                                System.out.println();
                            }
                        }
                        System.out.println("===============================================================");
                        System.out.println("Kembali ke menu utama.");
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Anda akan memesan sebuah tiket kereta api.");
                        System.out.print("Masukkan jumlah penumpang: ");
                        int penumpang = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan kota keberangkatan: ");
                        String berangkat = input.nextLine();
                        System.out.print("Masukkan kota tujuan: ");
                        String tujuan = input.nextLine();
                        do {
                            System.out.print("Masukkan jam keberangkatan (Format 24 jam): ");
                            jamberangkat = input.nextInt();
                            System.out.print("Masukkan menit keberangkatan (Format 24 jam): ");
                            menitberangkat = input.nextInt();
                            if(jamberangkat < 0 || jamberangkat > 24) {
                                System.out.println("Format jam tidak valid. silahkan pilih ulang!");
                            } else if (menitberangkat < 0 || menitberangkat > 59) {
                                System.out.println("Format menit tidak valid. silahkan pilih ulang!");
                            }
                        } while (jamberangkat < 0 || jamberangkat > 24 || menitberangkat < 0 || menitberangkat > 59);                        
                        System.out.println();
                        System.out.println("====================    Pilihan Kereta    ====================");
                        System.out.printf("%12s%12s%12s%12s%12s%n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                        for(int i = 0; i < kereta.length; i++) {
                            for(int j = 0; j < kereta[i].length; j++) {
                                System.out.printf("%12s", kereta[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println("====================    Pilihan Kereta    ====================");
                        System.out.println();
                        System.out.print("Pilih jenis kereta yang diinginkan: ");
                        int pilihkereta = input.nextInt();                        
                        input.nextLine();
                        //Struk
                        System.out.println("Anda akan membeli tiket kereta dengan ketentuan: ");
                        System.out.printf("%12s%12s%15s%12s%12s%n", "Jenis", "Penumpang", "Jam Berangkat", "Asal Kota", "Tujuan");
                        System.out.printf("%12s%12d%15s%12s%12s%n", kereta[(pilihkereta)-1][0], penumpang, String.format("%02d.%02d", jamberangkat, menitberangkat), berangkat, tujuan);
                        System.out.print("Apakah anda menyetujui pembelian ini? (Y/T): ");
                        String setuju = input.nextLine().toUpperCase();
                        if(setuju.charAt(0) == 'Y') {
                            belitiket = true;
                            System.out.println("Struk Pembelian: ");
                            System.out.println("====================    Struk Pemesanan    ====================");
                            System.out.printf("%12s%12s%15s%12s%12s%n", "Jenis", "Penumpang", "Jam Berangkat", "Asal Kota", "Tujuan");
                            System.out.printf("%12s%12d%15s%12s%12s%n", kereta[(pilihkereta)-1][0], penumpang, String.format("%02d.%02d", jamberangkat, menitberangkat), berangkat, tujuan);
                            System.out.println("===============================================================");
                            System.out.println();
                            Penumpang.add(penumpang);
                            Berangkat.add(berangkat);
                            Tujuan.add(tujuan);
                            JamBerangkat.add(jamberangkat);
                            MenitBerangkat.add(menitberangkat);
                            PilihKereta.add(pilihkereta);
                        } else if(setuju.charAt(0) == 'T') {
                            System.out.println("Anda membatalkan pesanan. Kembali ke menu utama");
                            System.out.println();
                        } else {
                            System.out.println("Format tidak valid.");
                            System.out.println();
                        }
                        break;

                    case 5:
                        if (belitiket == false) {
                            System.out.println("Anda belum memesan tiket kereta. Kembali ke menu utama.");
                            System.out.println();
                        } else {
                            System.out.println("Daftar pemesanan kereta api: ");
                            for(int i = 0; i < Penumpang.size(); i++) {
                                System.out.print((i+1) + ".");
                                System.out.println("    ====================    Struk Pemesanan    ====================");
                                System.out.printf("    %12s%12s%15s%12s%12s%n", "Jenis", "Penumpang", "Jam Berangkat", "Asal Kota", "Tujuan");
                                System.out.printf("    %12s%12d%15s%12s%12s%n", kereta[(PilihKereta.get(i))-1][0], Penumpang.get(i), String.format("%02d.%02d", JamBerangkat.get(i), MenitBerangkat.get(i)), Berangkat.get(i), Tujuan.get(i));
                                System.out.println("    ===============================================================");
                            }
                            System.out.println("Kembali ke menu utama.");
                            System.out.println();
                        }

                }
        } while (pilihan != 0);
        System.out.println("Keluar");
        input.close();
    }
}