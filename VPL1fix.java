import java.util.Locale;
import java.util.Scanner;                           //import util scanner untuk membaca input

public class VPL1fix {
    public static void main(String[] args) {        //main method
         Scanner input = new Scanner(System.in);    //masukkan scanner untuk input data
         input.useLocale(Locale.US);                //agar diskon dibaca dengan titik dan bukan koma (tidak bisa menggunakan koma sebagai ganti)
         
         //Sistem input tanggal pembelian
         System.out.print("Masukkan tanggal pembelian: ");
         int tanggalBeli = input.nextInt();
         System.out.print("Masukkan bulan pembelian: ");
         int bulanBeli = input.nextInt();
         System.out.print("Masukkan tahun pembelian: ");
         int tahunBeli = input.nextInt();
         input.nextLine();                          //membuang newline agar string dapat diinput setelah int

         //Sistem input pembelian barang
         System.out.print("Masukkan barang pembelian: ");
         String belanjaBarang = input.nextLine();     
         System.out.print("Masukkan jumlah pembelian: ");
         int jumlahBarang = input.nextInt();
         System.out.print("Masukkan harga barang: ");
         double hargaBarang = input.nextDouble();
         System.out.print("Masukkan diskon barang: ");
         float diskon = input.nextFloat();
         System.out.print("Masukkan metode pembayaran : ");
         boolean jenisPembayaran = input.nextBoolean();
         double totalHarga = jumlahBarang*hargaBarang;
         double jumlahPembayaran = totalHarga-(totalHarga*(diskon/100));
         
         //Sistem output
         System.out.println("========= List Barang =========");
         System.out.printf("%-17s : %d-%d-%d%n", "Tanggal", tanggalBeli, bulanBeli, tahunBeli);
         System.out.printf("%-17s : %s%n","Barang belanja", belanjaBarang);
         System.out.printf("%-17s : %d%n", "Jumlah barang", jumlahBarang);
         System.out.printf(Locale.US, "%-17s : %,.2f%n", "Harga barang", hargaBarang);
         System.out.printf("%-17s : %.1f %% %n", "Diskon", diskon);
         System.out.println("-------------------------------");
         System.out.printf(Locale.US, "%-17s : Rp%,.2f%n", "Total harga", totalHarga);
         System.out.printf(Locale.US, "%-17s : Rp%,.2f%n", "Pembayaran", jumlahPembayaran);
         System.out.printf("%-17s : %s%n", "Pembayaran tunai", jenisPembayaran);

         input.close();
    }
    
}
