import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class VPL4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Masukkan id
        int id = input.nextInt();
        
        //Masukkan panjang kode
        int n = input.nextInt();
        
        //Array sepanjang n
        int kode[] = new int[n];
        String alfabet[] = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U","V", "W", "X", "Y", "Z", " "};
        ArrayList<String> pesan = new ArrayList<>();
        ArrayList<Integer> invalid = new ArrayList<>();
        
        for (int i = 0; i < n ; i++) {
            //Masukkan kode
            kode[i] = input.nextInt();
            if ((kode[i] - id) < 0 || (kode [i] - id) > 26) {
                invalid.add(kode[i]);
            }
            else {
                pesan.add(alfabet[(kode[i]-id)]);
            }
        }
        System.out.print("Output pesan: ");
        for(int i = 0; i < pesan.size(); i++) {
            System.out.print(pesan.get(i));
        }
        System.out.print("\nElemen tidak valid ditemukan: ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < invalid.size(); i++) {
            sb.append(invalid.get(i));
            if (i < invalid.size()-1) {
                sb.append(", ");
            }
        }
        System.out.print(sb.toString());
    }
}