import java.util.Scanner;

public class CaseBased1PemDas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan suhu dalam Celcius: ");
    int _suhuC = input.nextInt();
    int _suhuF = (_suhuC*9/5)+32;
    System.out.println("Suhu dalam fahrenheit adalah: "+_suhuF);

    input.close();
        
    }
    
}
