package No1;

import java.util.Scanner;
import java.util.Arrays;

public class Bag {

    int size = 10;
    String[] barang = new String[size];

    public void capacity() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= size; i++) {
            System.out.println("Kapasitas penyimpanan =" + size);
            if (size != 0) {
                System.out.print("Masukkan barang anda :");
                barang[i] = sc.nextLine();

                size--;
                System.out.println("daftar barang " + barang[i]);
            }
            System.err.print("masih ingin menyimpan barang? y/n :" );
            String op = sc.nextLine();
            if (op.equals("n")) {
                break;
            }

            System.out.println("barang yg tersimpan :" + Arrays.toString(barang));
        }

    }
}
