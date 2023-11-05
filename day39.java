package No1;
import java.time.LocalDate;
import java.time.LocalTime;

public class Jam {
    LocalDate date = LocalDate.now();
    LocalTime jam = LocalTime.now();
    
    public void JamSekarang(){
        
        System.out.println("Jam Saat ini adalah : "+ jam);
    }
    
    public void TanggalSekarang(){
        
        
        
        System.out.println("Tanggal saat ini : "+date);
    }
    
    public void JamdanTanggal(){
        System.out.println("Sekarang Jam :"+ jam+" dan Tanggal saat ini : "+date);
        
    }

}
