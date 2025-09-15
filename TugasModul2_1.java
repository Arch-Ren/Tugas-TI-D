




import java.util.Scanner;

public class TugasModul2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Menghitung luas dan keliling persegi panjang \n2. Menghitung luas dan keliling lingkaran \n3. Menghitung luas dan keliling segitiga");
        System.out.println(" ");
        System.out.print("Pilihan anda: ");
        int _pilih = input.nextInt();

        switch (_pilih) {
            case 1:
                System.out.print("Masukkan alas persegi panjang: ");
                double alas_pg = input.nextDouble();
                System.out.print("Masukkan tinggi persegi panjang: ");
                double tinggi_pg = input.nextDouble();
                System.out.println(" ");
                System.out.printf("%-25s : %,.0f %s%n", "Keliling persegi panjang", 2*(alas_pg+tinggi_pg), "cm");
                System.out.printf("%-25s : %,.0f %s%n", "Luas persegi panjang", alas_pg*tinggi_pg, "cm2");
                
                break;
            
            case 2:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jari = input.nextDouble();
                System.out.println(" ");
                System.out.printf("%-20s : %,.0f %s%n", "Keliling lingkaran", 3.14*2*jari, "cm");
                System.out.printf("%-20s : %,.0f %s%n", "Luas lingkaran", 3.14*jari*jari, "cm2");

                break;
            
            case 3:
                System.out.print("Masukkan a: ");
                double a_sg = input.nextDouble();
                System.out.print("Masukkan b: ");
                double b_sg = input.nextDouble();
                System.out.print("Masukkan r: ");
                double r_sg = input.nextDouble();
                System.out.println(" ");
                System.out.printf("%-15s : %,.0f %s%n", "Keliling segitiga", a_sg+b_sg+r_sg, "cm");
                System.out.printf("%-15s : %,.0f %s%n", "Luas segitiga", a_sg*b_sg/2, "cm2");

                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
        }


        input.close();
    }
    
}
