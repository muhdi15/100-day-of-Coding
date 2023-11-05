package No1;


public class Book {
    
    String buku = "Tertutup";
    
    public void kondisi(){
        System.out.println("Buku saat ini :"+ buku);
    }
    public void buka(){
        buku = "terBuka";
    }
    
    public void tutup(){
        buku = "Tertutup";
    }
}
