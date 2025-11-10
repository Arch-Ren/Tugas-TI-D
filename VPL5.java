import java.util.*;

public class VPL5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 0;
        boolean cekRiwayat[] = new boolean[10];
        String riwayat[] = new String[10];
        int history[] = new int[10];
        //loop pilihan
        int pilih = 0;
        do {
            System.out.println("Menu: \n1. Cek Saldo \n2. Setor Uang \n3. Tarik Uang \n4. Lihat Riwayat Transaksi \n5. Keluar \n Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    cekSaldo(saldo);
                    break;
                
                case 2:
                    saldo = setorUang(saldo, cekRiwayat, riwayat, history);
                    break;
                    
                case 3:
                    saldo = tarikUang(saldo, cekRiwayat, riwayat, history);
                    break;
                    
                case 4:
                    riwayatTransaksi(cekRiwayat, riwayat, history);
                    break;
            }
        } while (pilih != 5);
        System.out.println("Terima kasih telah menggunakan ATM ini.");
    }
    
    static void cekSaldo(int saldo) {
        System.out.println("Saldo Anda saat ini: Rp" + saldo);
    }
    
    static int setorUang(int saldo, boolean[] cekRiwayat, String[] riwayat, int[] history) {
        Scanner input = new Scanner(System.in);
        int setor = 0;
        System.out.print("Masukkan jumlah setoran: ");
        setor = input.nextInt();
        input.nextLine();
        if (setor > 0) {
            saldo += setor;
            System.out.println("\nSetoran berhasil! Saldo sekarang: Rp" + saldo);
            for (int i = 0; i < riwayat.length; i++) {
                if (!cekRiwayat[i]) {
                    riwayat[i] = "Setor";
                    history[i] = setor;
                    cekRiwayat[i] = true;
                    break;
                }
            }
        } else {
            System.out.println("\nJumlah setoran tidak valid!");
        }
        return saldo;
    }
    
    static int tarikUang(int saldo, boolean[] cekRiwayat, String[] riwayat, int[] history) {
        Scanner input = new Scanner(System.in);
        int tarik = 0;
        System.out.print("Masukkan jumlah penarikan: ");
        tarik = input.nextInt();
        if (tarik > 0) {
            int sisa = saldo - tarik;
            if ((sisa) >= 0) {
                saldo -= tarik;
                System.out.println("\nPenarikan berhasil! Saldo sekarang: Rp" + sisa);
                for (int i = 0; i < riwayat.length; i++) {
                    if (!cekRiwayat[i]) {
                        riwayat[i] = "Tarik";
                        history[i] = tarik;
                        cekRiwayat[i] = true;
                        break;
                    }
                }
            } else {
                System.out.println("\nSaldo tidak mencukupi!");
            }
        } else {
            System.out.println("\nJumlah tidak valid!");
        }
        return saldo;
    }
    
    static void riwayatTransaksi(boolean[] cekRiwayat, String[] riwayat, int[] history) {
        if(cekRiwayat[0]) {
            System.out.println("=== Riwayat Transaksi ===");
            int i = 0;
            while (i < cekRiwayat.length && cekRiwayat[i] != false) {
                System.out.println((i+1) + ". " + riwayat[i] + " - Rp" + history[i]);
                i++;
            }
        } else {
            System.out.println("Belum ada transaksi.");
        }
    }
}