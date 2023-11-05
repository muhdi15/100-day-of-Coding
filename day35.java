package No1;


public class Door {
    String warna = "Merah";
    String posisi = "tertutup";
    
    
    public void posisi(){
        System.out.println("Saat ini pintu sedang : "+posisi);
        
    }
    public void buka(){
        posisi = "terbuka";
    }
    public void tutup(){
        posisi = "tertutup";
    }
    
    
    
}
