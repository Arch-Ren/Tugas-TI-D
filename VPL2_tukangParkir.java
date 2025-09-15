import java.util.Scanner;
import java.util.Locale;

public class VPL2_tukangParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int mtrawal = 5000;
        int mblawal = 5000;

        //input
        System.out.print("Masukkan berapa lama anda parkir (dalam menit): ");
        double menitParkir = input.nextDouble();
        input.nextLine();
        if (menitParkir <= 0) {
                System.out.println("Misiiii input ga valid nihh!!");
        } else {
            double jam = menitParkir/60;
            System.out.print("Masukkan jenis kendaraan: ");
            String kendaraan = input.nextLine().toLowerCase();

        //kondisi
            if (kendaraan.equalsIgnoreCase("mobil") || kendaraan.equalsIgnoreCase("motor")){
                    if (menitParkir <= 5) {
                        System.out.printf(Locale.US, "%s%s%s%,.2f%s%n", "Biaya parkir ", kendaraan, " selama ", (double)jam, " jam adalah Rp. 3,000.00");
                    } else {
                        if (menitParkir <= 120) {
                            System.out.printf(Locale.US, "%s%s%s%,.2f%s%n", "Biaya parkir ", kendaraan, " selama ", (double)jam, " jam adalah Rp. 5,000.00");
                        } else {
                            if (kendaraan.equalsIgnoreCase("mobil")) {
                                double lebih = menitParkir - 120;
                                double tambah = (lebih/10)*2000;
                                System.out.printf(Locale.US, "%s%s%s%,.1f%s%,.2f%n", "Biaya parkir ", kendaraan, " selama ", jam, " jam adalah Rp. ", 5000 + tambah);
                            } else {
                                double lebih = menitParkir - 120;
                                double tambah = (lebih/10)*1000;
                                System.out.printf(Locale.US, "%s%s%s%,.1f%s%,.0f%n", "Biaya parkir ", kendaraan, " selama ", jam, " jam adalah Rp. ", 5000 + tambah);
                            }
                        }
                    }
            } else {
                System.out.println("Jalan kaki tidak perlu bayar parkir");
            }
        }
        
        input.close();
    
    }
}
        
