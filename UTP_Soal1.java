import java.util.*;

public class UTP_Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //masukkan jumlah nama
        int jumlahNama = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan " + jumlahNama + " nama lengkap:");
        String nama[] = new String[jumlahNama];
        //Masukkan nama
        for(int i = 0; i < jumlahNama; i++) {
            System.out.print("Nama ke-" + (i+1) + ": ");
            nama[i] = input.nextLine();
        }
        //print inisial
        StringBuilder namaProper = new StringBuilder("");
        System.out.println("\nInisial dari setiap nama: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + " -> ");
            String bagian[] = nama[i].split(" ");
            for (int j = 0; j < bagian.length; j++) {
                String inisial1 = String.valueOf(bagian[j].charAt(0)).toUpperCase();
                System.out.print(inisial1 + ".");
                String perbaikanNama = bagian[j].toLowerCase();
                StringBuilder sb = new StringBuilder(perbaikanNama);
                sb.replace(0,1, inisial1);
                namaProper.append(sb + " ");
            }
            System.out.println("");
            namaProper.append(",");
        }
        String namaAkhir = namaProper.toString();
        //masukkan inisial dicari
        String inisialDicari = input.nextLine().toUpperCase();
        System.out.println("Nama yang berawalan huruf '" + inisialDicari + "':");
        String namaFinal[] = namaAkhir.split(",");
        boolean cariNama = false;
        int cariInisial = 0;
        for (int i = 0; i < namaFinal.length; i++) {
            String inisialNama = String.valueOf(namaFinal[i].charAt(0));
            if (inisialNama.equalsIgnoreCase(inisialDicari)) {
                cariNama = true;
                cariInisial = i;
            }
        }
        if (cariNama) {
            System.out.println(namaFinal[cariInisial]);
        } else {
            System.out.println("Tidak ada nama yang berawalan '" + inisialDicari + "'");
        }
        //total huruf tanpa spasi
        StringBuilder hurufTotal = new StringBuilder("");
        for (int i = 0; i < nama.length; i++) {
            hurufTotal.append(nama[i]);
        }
        String hurufTotal1 = hurufTotal.toString();
        hurufTotal1 = hurufTotal1.replaceAll(" ", "").trim();
        int totalHuruf = hurufTotal1.length();
        System.out.println("\nTotal huruf (tanpa spasi): " + totalHuruf);
    }
}