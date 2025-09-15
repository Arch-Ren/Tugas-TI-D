




import java.util.Scanner;

public class TugasModul2_3 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("Masukkan Jam kerja: ");
     int jam = input.nextInt();
     int upahasli = jam*5000;
     if (jam <= 0) {
        System.out.println("Tidak bekerja = Tidak digaji");
     } else {
            if (jam < 50) {
            int denda = (50-jam)*1000;
            int total = upahasli - denda;
                if (total <= 0) {
                    System.out.println("Gaji anda minus, silahkan membayar sebesar: Rp. "+ Math.abs(total));
                } else {
                    System.out.printf("%-10s : %d%n", "Jam kerja", jam);
                    System.out.printf("%-10s = %s %6d%n", "Upah", "Rp.", upahasli);
                    System.out.printf("%-10s = %s %6d%n", "Lembur", "Rp.", 0);
                    System.out.printf("%-10s = %s %6d%n", "Denda", "Rp.", denda);
                    System.out.println("----------------------------");
                    System.out.printf("%-10s = %s %6d%n", "Total", "Rp.", total);
                }
            } else {
                if (50 <= jam && jam <= 60) {
                    System.out.printf("%-10s : %d%n", "Jam kerja", jam);
                    System.out.printf("%-10s = %s %6d%n", "Upah", "Rp.", upahasli);
                    System.out.printf("%-10s = %s %6d%n", "Lembur", "Rp.", 0);
                    System.out.printf("%-10s = %s %6d%n", "Denda", "Rp.", 0);
                    System.out.println("--------------------------");
                    System.out.printf("%-10s = %s %6d%n", "Total", "Rp.", upahasli);
            
                } else {
                    int upahasli1 = 60*5000;
                    int lembur = (jam-60)*6000;
                    //int total1 = upahasli1+lembur;
                    System.out.printf("%-10s : %d%n", "Jam kerja", jam);
                    System.out.printf("%-10s = %s %6d%n", "Upah", "Rp.", upahasli1);
                    System.out.printf("%-10s = %s %6d%n", "Lembur", "Rp.", lembur);
                    System.out.printf("%-10s = %s %6d%n", "Denda", "Rp.", 0);
                    System.out.println("--------------------------");
                    System.out.printf("%-10s = %s %6d%n", "Total", "Rp.", upahasli1+lembur);
            }
        }

     }
     
     input.close();
    }
    
}