package No1;


public class Car {
    String status = "off";
    int speed = 0;
    
    public void engineStatus(){
        System.out.println("Engine is :"+ status);
        System.out.println("Speed is :"+ speed);
    }
    public void on(){
        status = "on";
    }
    
    public void off(){
        status = "off";
        speed = 0;
    }
    public void gass(){
        if(status != "off"){
            speed += 20;
            
        }
        else{
            System.err.println("Engine is off");
        }
    }
    
    

}
