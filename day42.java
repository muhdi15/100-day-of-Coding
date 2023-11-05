package No1;

import java.util.Scanner;


public class Pen {
    Scanner sc = new Scanner(System.in);
    public void Tulis(){
        
        System.out.println("Masukkan kata :");
        String kata = sc.nextLine();
        
        System.out.println("Masukkan Warna. \n 1. Hitam \n 2. Merah \n =>");
        int warna = sc.nextInt();
        
        if(warna == 1){
            System.out.println("================================ \n"+ kata);
        }
        else{
            System.err.println("================================ \n"+ kata);
        }
        
    }

}
