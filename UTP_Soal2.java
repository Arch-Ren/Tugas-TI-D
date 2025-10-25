import java.util.*;

public class UTP_Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Masukkan baris kolom
        int baris = input.nextInt();
        int kolom = input.nextInt();
        boolean kursi[][] = new boolean[baris][kolom];
        
        //masukkan status kursi
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                kursi[i][j] = input.nextBoolean();
            }
        }
        
        //masukkan jumlah input
        int inputOperasi = input.nextInt();
        input.nextLine();
        //harga awal belum di-set
        int harga = 0;
        
        //loop dan switch operasi
        for (int i = 0; i < inputOperasi; i++) {
            //masukkan operasi
            String operation = input.nextLine().toUpperCase();
            String newOperation = operation.substring(0, 6);

            switch(newOperation) {
                case "CEK_KU" :
                    for (int j = 0; j < baris; j++) {
                        for (int k = 0; k < kolom; k++) {
                            if (kursi[j][k]) {
                                System.out.print("X ");
                            } else {
                                System.out.print("O ");
                            }
                        }
                        System.out.println("");
                    }
                break;

                case "KOSONG" :
                    for (int j = 0; j < baris; j++) {
                        for (int k = 0; k < kolom; k++) {
                            if (kursi[j][k]) {
                                kursi[j][k] = false;
                            }
                        }
                    }
                    System.out.println("Semua kursi telah dikosongkan.");
                break;

                case "HITUNG":
                    if (harga == 0) {
                        System.out.println("Harga kursi belum ditetapkan!");
                    } else {
                        //cek kursi terisi
                        int sum = 0;
                        for (int j = 0; j < baris; j++) {
                            for (int k = 0; k < kolom; k++) {
                                if(kursi[j][k]) {
                                    sum +=1;
                                }
                            } 
                        }
                        int pendapatan = harga*sum;
                        System.out.println("Pendapatan: " + pendapatan);
                    }
                break;

                case "SETHAR":
                    String setHarga = operation.substring(9);
                    harga = Integer.parseInt(setHarga);
                    System.out.println("Harga kursi diubah menjadi " + harga + ".");
                break;
                
                case "PESAN ":
                    int pesanBaris = Integer.parseInt(String.valueOf(operation.charAt(6)));
                    int pesanKolom = Integer.parseInt(String.valueOf(operation.charAt(8)));
                    for (int j = 1; j < (baris + 1); j++) {
                        for (int k = 1; k < (kolom + 1); k++) {
                            if (j == pesanBaris && k == pesanKolom) {
                                if (kursi[(j-1)][(k-1)]) {
                                    System.out.println("Kursi baris " + j + " kolom " + k + " sudah dipesan sebelumnya!");
                                } else {
                                    kursi[(j-1)][(k-1)] = true;
                                    System.out.println("Kursi baris " + j + " kolom " + k + " berhasil dipesan.");
                                }
                            }
                        }
                    }
                break;
            }
        }
        
    }
}