package No1;

public class Stove {

    String status = "mati";
    int panas = 0;

    public void nyala() {
        status = "Nyala";
    }

    public void mati() {
        status = "mati";
        panas = 0;
    }

    public void IncPanas() {
        if (status.equals("mati")) {
            System.err.println("Panas tidak bisa di tingkatkan karena kompor mati");
        } else {
            System.out.println("Maks Panas = 10");
            panas++;
            System.out.println("Panas saat ini :" + panas);
        }

    }

    public void DecPanas() {
        if (status.equals("mati")) {
            System.err.println("kompor mati");
        } else {
            System.out.println("Panas saat ini :" + panas);
            panas--;
        }

    }

    public void status() {
        System.out.println("Kompor saat ini :" + status);
        System.out.println("Panas kompor saat ini :" + panas);
    }

}
