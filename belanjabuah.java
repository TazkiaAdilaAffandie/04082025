
import java.util.Scanner;

public class belanjabuah {
public static void main(String[] args) {
    int watermelon = 12, avocado =15;
    double hargawatermelon = 14500, hargaavocado = 10500;
    double total, bayar, kembalian;

    total=(watermelon*hargawatermelon)+(avocado*hargaavocado);
    System.out.println("Jumlah watermelon yand di beli: "+watermelon+" dan avocado : "+avocado);
    System.out.println("Total pembayaran: "+total);
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan Pembayaran : ");
    bayar=input.nextDouble();
    kembalian = bayar-total;
    System.out.println("Kembalian anda adalah : "+kembalian);

}

}
