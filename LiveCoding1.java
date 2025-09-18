import java.util.Scanner;

public class LiveCoding1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Kode: A > Susu > Harga: Rp. 7.500 > Stok: 3 \n2. Kode: B > Snack > Harga: Rp. 10.000 > Stok: 4 \n3. Kode: C > Air Mineral > Harga: Rp. 6.500 > Stok: 1");
        System.out.print("Masukkan kode barang yang dibeli: ");
        String kodeBarang = input.nextLine();
        int jumlahBarang;
        double jumlahUang;
        
        switch(kodeBarang) {
            case "A":
                System.out.print("Masukkan jumlah pembelian: ");
                jumlahBarang = input.nextInt();
                if (jumlahBarang > 3){
                    System.out.println("Stok tidak mencukupi");
                } else if (jumlahBarang == 0) {
                        System.out.println("Anda tidak melakukan pembelian apapun");
                  } else {
                    System.out.println("harga pembelian anda = " + 7500*jumlahBarang);
                    System.out.print("Masukkan uang anda: ");
                    jumlahUang = input.nextDouble();
                    if (jumlahUang < 7500*jumlahBarang) {
                        System.out.println("Uang anda tidak cukup");
                    } else {
                        System.out.printf("%s%,.2f%n", "Kamu sudah beli susu, dan mendapat kembalian sejumlah Rp", jumlahUang-7500*jumlahBarang);
                    }
                }
                break;
            
            case "B":
                System.out.print("Masukkan jumlah pembelian: ");
                jumlahBarang = input.nextInt();
                if (jumlahBarang > 4){
                    System.out.println("Stok tidak mencukupi");
                } else if (jumlahBarang == 0) {
                        System.out.println("Anda tidak melakukan pembelian apapun");
                } else {
                    System.out.println("harga pembelian anda = " + 10000*jumlahBarang);
                    System.out.print("Masukkan uang anda: ");
                    jumlahUang = input.nextDouble();
                    if (jumlahUang < 10000*jumlahBarang) {
                        System.out.println("Uang anda tidak cukup");
                    } else {
                        System.out.printf("%s%,.2f%n", "Kamu sudah beli susu, dan mendapat kembalian sejumlah Rp", jumlahUang-10000*jumlahBarang);
                    }
                }
                break;
                
            case "C":
                System.out.print("Masukkan jumlah pembelian: ");
                jumlahBarang = input.nextInt();
                if (jumlahBarang > 1){
                    System.out.println("Stok tidak mencukupi");
                } else if (jumlahBarang == 0) {
                        System.out.println("Anda tidak melakukan pembelian apapun");
                } else {
                    System.out.println("harga pembelian anda = " + 6500*jumlahBarang);
                    System.out.print("Masukkan uang anda: ");
                    jumlahUang = input.nextDouble();
                    if (jumlahUang < 6500*jumlahBarang) {
                        System.out.println("Uang anda tidak cukup");
                    } else {
                        System.out.printf("%s%,.2f%n", "Kamu sudah beli susu, dan mendapat kembalian sejumlah Rp", jumlahUang-6500*jumlahBarang);
                    }
                }
                break;
            default: 
                System.out.println("Kode barang tidak valid");
        }
        
        input.close();
    }
}