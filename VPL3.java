import java.util.Scanner;

public class VPL3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double hasil = 0.0, nilai1 = 0.0;
        int operator;
        boolean kondisi = true;
        
        operator = sc.nextInt();
        while (operator != 0) {
            if (operator > 4 || operator < 0) {
                System.out.println ("Opsi tidak ditemukan");
                operator = sc.nextInt();
            } else {
                nilai1 = sc.nextDouble();
                switch (operator) {
                    case 1: 
                        hasil += nilai1;
                        break;
                    
                    case 2:
                        hasil -= nilai1;
                        break;
                        
                    case 3:
                        hasil *= nilai1;
                        break;
                    
                    case 4:
                        hasil /= nilai1;
                        break;
                }
                operator = sc.nextInt();
            }   
        }
        System.out.print ("Hasil akhir: " + hasil);
        System.out.print ("\nKalkulator dimatikan");
    }
}
