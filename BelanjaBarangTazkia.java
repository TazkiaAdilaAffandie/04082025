import java.util.Scanner;

public class BelanjaBarangTazkia {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Nama barang1");
        String namabarang1 = input.nextLine(); 
        System.out.println("Harga barang1");
        double harga = input.nextDouble(); 


        System.out.println("Nama barang2");
        String namabaraang2 = input.next();
        System.out.println("Harga barang2");
        double harga2 = input.nextDouble();

        
        System.out.println("==============");
        System.out.println(" Barang yang debeli "+namabarang1+ " dan "+ namabaraang2);
        System.out.println("Harga "+harga+ " dan "+harga2);
       
    }
    
}
