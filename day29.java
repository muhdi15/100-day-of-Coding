package No1;


public class Bike {
    String status = "mati";
    
    public void statusMotor(){
        System.out.println("Keadaan Motor ="+status);
    }
    
    public void on(){
        status = "nyala";
        
    }
    public  void off(){
        status = "mati";
        
    }

}
