import java.util.Scanner;

public class latihan2nestedloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelas: ");
        int kelas = input.nextInt();
        System.out.print("Masukkan jumlah siswa per kelas: ");
        int siswa = input.nextInt();
        
        for(int i = 1;i <= kelas; i++){
            System.out.println("Kelas "+ i+":");
            for(int j = 1;j <= siswa; j++){
                System.out.print("  Masukkan nilai siswa ke-"+j+": ");
                int nilai = input.nextInt();
                System.out.println("     Nilai siswa ke-"+j+" adalah "+nilai);
            }
        } 

        input.close();
    }
}