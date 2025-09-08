import java.util.Scanner;

public class TugasModul1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-22s : ", "Masukkan angka pertama");
        double angka1 = input.nextDouble();
        System.out.printf("%-22s : ", "Masukkan angka kedua");
        double angka2 = input.nextDouble();

        System.out.printf("%-18s: %.0f%n", "Hasil Penjumlahan", angka1+angka2);
        System.out.printf("%-18s: %.0f%n", "Hasil Pengurangan", angka1-angka2);
        System.out.printf("%-18s: %.0f%n", "Hasil Perkalian", angka1*angka2);
        System.out.printf("%-18s: %.1f%n", "Hasil Pembagian", angka1/angka2);

        input.close();
    }
    
}
