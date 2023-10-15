
public class Bilgisayar {
    private Anakart anakart;
    private Monitor monitor;

    public Bilgisayar(Anakart anakart, Monitor monitor) {
        this.anakart = anakart;
        this.monitor = monitor;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    public void calistir(){
    
    System.out.println("bilgisayar calisiyor.");
    }
}
