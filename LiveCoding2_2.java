import java.util.Scanner;
import java.util.Arrays;

public class LiveCoding2_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks A: ");
        int barisA = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        int kolomA = input.nextInt();
        int A[][] = new int [barisA][kolomA];
        System.out.print("Masukkan jumlah baris matriks B: ");
        int barisB = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int kolomB = input.nextInt();
        int B[][] = new int [barisB][kolomB];
        int total = 0;
        if (kolomA != barisB) {
            System.out.println("Perkalian tidak dapat dilakukan! \nJumlah kolom A harus sama dengan jumlah baris B.");
        } else {
            System.out.print("Masukkan elemen matriks A: ");
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomA; j++) {
                    int ElemenMatriks = input.nextInt();
                    A[i][j] = ElemenMatriks;
                }
            }
            System.out.print("Masukkan elemen matriks B: ");
            for (int i = 0; i < barisB; i++) {
                for (int j = 0; j < kolomB; j++) {
                    int ElemenMatriks = input.nextInt();
                    B[i][j] = ElemenMatriks;
                }
            }
            
            int hasil[][] = new int [barisA][kolomB];
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomB; j++) {
                    for (int k = 0; k < kolomA; k++) {
                        hasil[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            
            System.out.println("Hasil perkalian matriks A x B adalah: ");
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomB; j++) {
                    System.out.print(hasil[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}