package DayCode;

import java.util.Vector;
import java.util.Arrays;
import java.util.Scanner;

public class day14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Vector<Double> vc = new Vector<>();
        vc.add(91.35);
        vc.add(4.72);
        vc.add(26.0);
        vc.add(3.5);
        vc.add(8.0);
        vc.add(61.0);
        vc.add(65.36);
        vc.add(12.0);
        vc.add(5.6);
        vc.add(7.11);
        vc.add(27.0);
        vc.add(9.53);
        vc.add(549.0);
        vc.add(2.23);
        vc.add(17.31);
        vc.add(4.25);
        vc.add(2.13);
        vc.add(83.0);
        vc.add(7.0);
        vc.add(102.4);
        vc.add(53.21);
        vc.add(3.42);
        vc.add(0.21);
        vc.add(70.02);
        vc.add(819.4);
        vc.add(6173.0);
        vc.add(4.25);
        vc.add(19.8);
        vc.add(17.35);
        vc.add(5.768);

        //Menemukan Min
        double min = vc.get(0);
        for (int i = 0; i < vc.size(); i++) {
            if (vc.get(i) < min) {
                min = vc.get(i);
            }
        }
        System.out.println("Min value is =" + min);

        //Menemukan Max
        double max = vc.get(0);
        for (int i = 0; i < vc.size(); i++) {
            if (vc.get(i) > max) {
                max = vc.get(i);
            }
        }
        System.out.println("Max value is :" + max);

        // Sum the Vector
        double sum = 0;
        for (int i = 0; i < vc.size(); i++) {
            sum += vc.get(i);
            
        }
        System.out.println("Sum of all values in vector is :"+ sum);
        
        //Find the Averaage
        double sum1 = 0;
        int count = 0;
        for (int i = 0; i < vc.size(); i++) {
            sum1 += vc.get(i);
            count++;
            
        }
        double avg = sum1 / count;
        System.out.println("Average of the Vector is :"+ avg);


        
        
        

    }

}
