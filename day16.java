package Praktikum;
import java.util.Scanner;
import java.util.Stack;

public class no08 {
    
    public static void main(String[] args) {
        Stack kata = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan String :");
        String kata1 = sc.nextLine();
        
        int s = kata1.length();
        
        for (int i = s-1 ; i >= 0; i--) {
            kata.add(kata1.charAt(i));
            //System.out.println(chat);
            
        }
        for (int i = 0; i < kata.size(); i++) {
            System.out.print(kata.get(i));
            
        }
        System.out.println();
        
        
        
        
        
        
        
        
       
    }

}
