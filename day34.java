package No1;
import java.util.Scanner;

public class Circle {
    Scanner sc = new Scanner(System.in);
    
    public void diameter(int jari_jari){
        
        int hasil = jari_jari * jari_jari;
        
        System.out.println("diameter dari lingkaran diatas"+hasil);
        
    }
    
    public void keliling(int jari2){
        double hasil = (2 * 3.14 * jari2);
        System.out.println("Keliling nya adalah = "+hasil);
    }

}
