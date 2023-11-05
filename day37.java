package No1;

public class Fan {

    String status = "mati";

    int speed = 0;

    public void status() {
        System.out.println("saat ini kipas sedang= " + status);
        System.out.println("Speed :" + speed);
    }

    public void on() {
        status = "hidup";
    }

    public void off() {
        status = "off";
    }

    public void IncrSpeed(int speed) {
        if (status.equals("hidup")) {
            if (speed >= 1 && speed <= 3) {
                this.speed = speed;

            }

        }
    }

}
