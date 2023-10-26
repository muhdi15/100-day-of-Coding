package Day18;
import java.util.Scanner;

public class Hari18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukkan Kalimat");
        String kata = sc.nextLine();
        
        
        for (int i = kata.length()-1; i >= 0; i--) {
            System.out.print(kata.charAt(i));
            
        }
        System.out.println("");
    }
        
}
