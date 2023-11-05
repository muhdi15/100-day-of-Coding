package No1;
import java.util.Scanner;

public class Calculator {
    
    Scanner sc = new Scanner(System.in);
    
    public void tambah(int angka1,int angka2){
        int hasil = angka1 + angka2;
        System.out.println("hasil penjumlahan "+angka1+" dan"+angka2+" adalah ="+hasil);
    }
    
    public void kurang(int angka1,int angka2){
        int hasil = angka1 - angka2;
        System.out.println("hasil pengurangan "+angka1+" dan"+angka2+" adalah ="+hasil);
    }
    public void kali(int angka1,int angka2){
        int hasil = angka1 * angka2;
        System.out.println("hasil perkalian "+angka1+" dan"+angka2+" adalah ="+hasil);
    }
    public void bagi(int angka1,int angka2){
        int hasil = angka1 / angka2;
        System.out.println("hasil pembagian "+angka1+" dan"+angka2+" adalah ="+hasil);
    }

}
