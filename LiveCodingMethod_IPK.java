import java.util.Scanner;

public class LiveCoding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nilai[] = new String[5];
        double nilaiConvert[] = new double[nilai.length];
        //masukkan nilai
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextLine();
            nilaiConvert[i] = konversiNilai(nilai[i]);
        }
        //ngitung
        double rata = hitungRata(nilaiConvert);
        double min = cariMin(nilaiConvert);
        double max = cariMax(nilaiConvert);
        
        //Pencetakan
        invalid(nilai);
        System.out.println("\n");
        System.out.println("=== HASIL PERHITUNGAN IPK ===");
        System.out.printf("%-16s : %,.2f%n", "IPK Rata-rata", rata);
        System.out.printf("%-16s : %,.2f%n", "IPK Tertinggi", max);
        System.out.printf("%-16s : %,.2f%n", "IPK Terendah", min);
        tampilkanHasil(rata);
    }
    
    static void invalid(String nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            if (!nilai[i].equalsIgnoreCase("a") && !nilai[i].equalsIgnoreCase("b+") && !nilai[i].equalsIgnoreCase("b") && !nilai[i].equalsIgnoreCase("c+") && !nilai[i].equalsIgnoreCase("c") && !nilai[i].equalsIgnoreCase("d+") && !nilai[i].equalsIgnoreCase("d") && !nilai[i].equalsIgnoreCase("e") && !nilai[i].equalsIgnoreCase("k")) {
                System.out.println("Nilai tidak valid: " + nilai[i]);
            } 
        }
    }

    static double konversiNilai(String nilai) {
        int invalid = 0;
        String tidakValid[];
        switch (nilai) {
            case "a":
                return 4.00;
                
            case "b+":
                return 3.50;
            
            case "b":
                return 3.00;
                
            case "c+":
                return 2.50;
                
            case "c":
                return 2.00;
            
            case "d+":
                return 1.50;
            
            case "d":
                return 1.00;
                
            case "e":
                return 0.00;
                
            case "k":
                return 0.00;
                
            default:
                return 0.00;

        }
    }

    static double hitungRata(double nilai[]) {
        double sum = 0;
        for (int i = 0; i < nilai.length; i++) {
            sum += nilai[i];
        }
        double rata = sum/nilai.length;
        return rata;
    }

    static double cariMin(double nilai[]) {
        double temp = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (temp > nilai[i]) 
                temp = nilai[i];
        }
        return temp;
    }

    static double cariMax(double nilai[]) {
        double temp = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (temp < nilai[i]) 
                temp = nilai[i];
        }
        return temp;
    }

    static void tampilkanHasil(double rata) {
        if (rata >= 2.75)
            System.out.println("Status: LULUS");
        else 
            System.out.println("Status: TIDAK LULUS");
    }
}
