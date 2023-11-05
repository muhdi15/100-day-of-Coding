package No1;


public class Matches {
    String korek = "mati";
    int gas = 5;
    
    public void on(){
        korek = "Nyala";
        while(gas >= 0){
            if(gas <= 0){
                System.out.println("gas :" + gas +"%");
                System.err.println("Korek Kehabisan Gas");
                break;
            }
            System.out.println(" korek :"+ korek);
            System.out.println("gas :" + gas +"%");
            gas--;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}
