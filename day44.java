package No1;


public class Switch {
    
    String status = "on";
    
    public void on(){
        status = "on";
        System.out.println("saklar dinyalakan");
    }
    public void off(){
        status = "off";
        System.out.println("saklar dimatikan");
    }
    public void status(){
        System.out.println("Saklar :"+ status);
    }
    

}
