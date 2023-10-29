package test;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Vector;
public class revString {
    
    public static void main(String[] args) {
       
        String k = "informatika jaya";
        
        Vector k1= new Vector();
        
        for (int i = 0; i < k.length(); i++) {
            k1.add(k.charAt(i));
            
        }
        for (int i = k1.size(); i > 0; i--) {
            System.out.print(k1.get(i));
            
        }
        
            
        
        
        
            
        
    }

}
