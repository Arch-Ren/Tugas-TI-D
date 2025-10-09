import java.util.Scanner;
import java.util.Arrays;

public class LiveCoding2_1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih jenis array (1 untuk 1D, 2 untuk 2D): ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.print("Masukkan panjang array: ");
            int n = input.nextInt();
            int arr[] = new int[n];
            System.out.print("Masukkan elemen array: ");
            for (int i = 0; i < n; i++) {
                int elemenArray = input.nextInt();
                arr[i] = elemenArray;
            }
            System.out.print("Array awal: ");
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("\nArray terbalik: ");
            int x = n;
            do {
                System.out.print(arr[(x-1)] + " ");
                x -= 1;
            } while (x != 0);
        } else if (pilihan == 2) {
            System.out.print("Masukkan jumlah baris: ");
            int baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = input.nextInt();
            int matriks[][] = new int [baris][kolom];
            System.out.print("Masukkan elemen array: ");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    int elemenArray = input.nextInt();
                    matriks[i][j] = elemenArray;
                }
            }
            System.out.println("\nArray awal: ");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(matriks[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Array terbalik: ");
            int y = baris;
            do {
                int z = kolom;
                do {
                   System.out.print(matriks[(y-1)][(z-1)] + " ");
                    z -= 1; 
                } while (z != 0);
                System.out.println(" ");
                y -= 1;
            } while (y != 0);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}