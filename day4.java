package Days;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4{
  public static void main(String[] args){
      
      File fl = new File("");
      
      try{
          Scanner sc = new Scanner(fl);
          
          while(sc.hasNextLine()){
              System.out.println(sc.nextLine);
          }
          
          
      }catch (FileNotFoundException ex){
          ex.printStackTrace();
          
      }
    
  }
}
