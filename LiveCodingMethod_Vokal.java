import java.util.Scanner;

//Mau kalian pakai method string atau tidak kerangka besarnya sama
public class LiveCodingMethod_Vokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //masukkan teks
        String kalimat = input.nextLine().trim().toUpperCase();
        int jumlahVokal = hitungVokal(kalimat);
        kalimat = ubahFormat(kalimat);
        tampilkanHasil(kalimat, jumlahVokal);
    }

    static String ubahFormat(String kalimat) {
        kalimat = kalimat.replaceAll(" ","-");
        return kalimat;
    }

    static int hitungVokal(String teks) {
        int jumlahVokal = 0;
        for (int i = 0; i < teks.length(); i++) {
            char a = teks.charAt(i);
            if(a == 'A' || a == 'I' || a == 'U' || a == 'E' || a == 'O')
                jumlahVokal += 1;
        }
        return jumlahVokal;
    }

    static void tampilkanHasil(String kalimat, int vokal) {
        System.out.printf("%-22s : %s%n", "Kalimat hasil format", kalimat);
        System.out.printf("%-22s : %d%n", "Jumlah huruf vokal", vokal);
    }
}