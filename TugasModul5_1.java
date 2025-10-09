import java.util.Scanner;
import java.util.ArrayList;

public class TugasModul5_1 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println(" 1. Input Data\n 2. Lihat Data\n 3. Average\n 4. Sum\n 5. Max\n 6. Min\n 7. Keluar");
        System.out.print("Masukkan nilai: ");
        int x = masukkan.nextInt();
        ArrayList<Double> data = new ArrayList<>();
        double max = 0.0, min = 0.0;
        while (x != 7) {
            if (x < 1 || x > 7) {
                System.out.println("Opsi tidak ditemukan");
                System.out.print("Masukkan nilai: ");
                x = masukkan.nextInt();
            }
            else {
                switch (x) {
                    case 1:
                        System.out.print("Masukkan data: ");
                        double i = masukkan.nextDouble();
                        data.add(i);
                        break;
                    case 2:
                        System.out.print( "{ ");
                        StringBuilder sb = new StringBuilder();
                        for(int j = 0; j < data.size(); j++) {
                            sb.append(data.get(j));
                            if (j < data.size()-1) {
                                sb.append(", ");
                            }
                        }
                        System.out.println(sb.toString() + " }");
                        break;
                    case 3:
                        double sum = 0;
                        for(int j = 0; j < data.size(); j++) {
                            sum += data.get(j);
                        }
                        double average = sum / data.size();
                        System.out.println("Rata-rata dari data adalah " + average);
                        break;
                    case 4:
                        double sum1 = 0;
                        for(int j = 0; j < data.size(); j++) {
                            sum1 += data.get(j);
                        }
                        System.out.println("Jumlah semua data adalah " + sum1);
                        break;
                    case 5:
                        for (int j = 0; j < data.size(); j++) {
                            if (data.get(j) >= max) {
                                max = data.get(j);
                            }
                        }
                        System.out.println("Nilai maksimum adalah " + max);
                        break;
                    case 6:
                        //min = data.get(0);
                        for(int j = 0; j < data.size(); j++) {
                            if (data.get(j) <= data.get(0)) {
                                min = data.get(j);
                            }
                        }
                        System.out.println("Nilai minimum adalah " + min);
                        break;
                }
                System.out.print("Masukkan nilai: ");
                x = masukkan.nextInt();
            }
        }
        System.out.println("Keluar");
        masukkan.close();
    }
}
