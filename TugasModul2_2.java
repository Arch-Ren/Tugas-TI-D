import java.util.Scanner;
import java.util.Locale;

public class TugasModul2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Menentukan Kriteria Kegemukan Berdasarkan IMT");
        System.out.println(" ");
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();
        double imt = berat/(tinggi*tinggi);
        if (imt <= 18.5) {
            System.out.printf("%s = %,.2f   %s%n", "IMT", imt, "Termasuk kurus");
        }   else if (imt > 18.5 && imt <= 25 ) {
            System.out.printf("%s = %,.2f   %s%n", "IMT", imt, "Termasuk normal");
        }   else if (imt > 25 && imt <= 30) {
            System.out.printf("%s = %,.2f   %s%n", "IMT", imt, "Termasuk gemuk");
        }   else if (imt > 30) {
            System.out.printf("%s = %,.2f   %s%n", "IMT", imt, "Termasuk kegemukan");
        }   else if (imt <= 0)

        input.close();
    }
    
}
