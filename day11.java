package Praktikum;

import java.util.Scanner;

public class Praktikum {
    double[][] data = {{91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11}, {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4}, {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}};

    public static void main(String[] args) {
        Praktikum pk = new Praktikum();
        pk.cetak();
        pk.max();
        pk.min();
        pk.sum();
    }
    
     void cetak(){
        for (int i = 0; i < data.length; i++) {
                System.out.println("");
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print(data[i][j] + ",");

                }

            }
            System.out.println("");
        
    }
     
     void max(){
         
         double m = data[0][0];
         for (int i = 0; i < data.length; i++) {
                System.out.println("");
                for (int j = 0; j < data[i].length; j++) {
                    if(data[i][j] > m){
                        m = data[i][j];
                    }

                }

            }
         System.out.println("Nilai Max Adalah ="+ m);
         
     }
     
     void min(){
         double m = data[0][0];
         for (int i = 0; i < data.length; i++) {
                System.out.println("");
                for (int j = 0; j < data[i].length; j++) {
                    if(data[i][j] < m){
                        m = data[i][j];
                    }

                }

            }
         System.out.println("Nilai Min Adalah ="+ m);
     }
     
     void sum(){
         
         double sum1 = 0;
         for (int i = 0; i < data.length; i++) {
             for (int j = 0; j < data[i].length; j++) {
                 
                 sum1 += data[i][j];
                 
             }
             
         }
         System.out.println("Hasil Sum adalah ="+ sum1);
         
     }
     
     
     
     

}
