package No1;


public class Traffic {
    String Warna = "Merah";
    String Status = "Berhenti";
    
    public void on(){
        while(true){
            System.out.println("===================================");
            Warna = "Hijau";
            Status = "Jalan";
            System.out.println("Lampu :"+ Warna);
            System.out.println("Status :"+Status);
            try{
                Thread.sleep(5000);
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("===================================");
            Warna = "Merah";
            Status = "Berhenti";
            System.out.println("Lampu :"+ Warna);
            System.out.println("Status :"+Status);
            
            try{
                Thread.sleep(5000);
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
            
            

}
