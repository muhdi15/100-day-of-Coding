package No1;


public class FlashLight {
    
    String status= "off";
    
    int Contras = 0;
    
    public void Status(){
        System.out.println("saat ini senter sedang :"+status);
    }
    
    public void nyala(){
       status = "on";
    }
    public void mati(){
        status = "off";
        Contras = 0;
    }
    
    public void incTerang(){
        Contras += 1;
    }

}
