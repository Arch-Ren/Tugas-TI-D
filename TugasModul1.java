import java.util.Scanner;

public class TugasModul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input data
        System.out.println("Program Penghitung Pemakaian Listrik Sederhana");
        System.out.printf("%-31s : ", "Masukkan Nama");
        String _nama = input.nextLine();
        System.out.printf("%-31s : ", "Kelurahan");
        String _kelurahan = input.nextLine();
        System.out.printf("%-31s : ", "Masukkan posisi awal KwH Meter");
        int _kwhawal = input.nextInt();
        System.out.printf("%-31s : ", "Masukkan posisi akhir KwH meter");
        int _kwhakhir = input.nextInt();
        System.out.printf("%-31s : ", "Masukkan biaya beban saat ini");
        int _biaya = input.nextInt();
        System.out.printf("%-31s : ", "Masukkan PPJ (dalam persen)");
        int _ppj = input.nextInt();
        int _pemakaian = _kwhakhir - _kwhawal;
        int _tarif = _biaya*_pemakaian; 
        int _pajak = _tarif*_ppj/100;

        //System.out.println(_pemakaian);
        //System.out.println(_tarif);
        //System.out.println(_pajak);

        //Output data
        System.out.println("=================== PLN Java ===================");
        System.out.printf("%-20s : %s%n", "Nama", _nama);
        System.out.printf("%-20s : %s%n", "Kelurahan", _kelurahan);
        System.out.printf("%-20s : %d %s%n", "Pemakaian bulan ini", _pemakaian, "KwH Meter");
        System.out.printf("%-20s : %s %d%s%n", "Tarif Listrik", "Rp", _tarif, ",-");
        System.out.printf("%-20s : %s %d%s%n", "PPJ 10%", "Rp", _pajak, ",-");
        System.out.printf("%-20s : %s %d%s%n", "Total Bayar", "Rp", _tarif+_pajak, ",-");
        System.out.println("================================================");

        input.close();
    }
    
}
