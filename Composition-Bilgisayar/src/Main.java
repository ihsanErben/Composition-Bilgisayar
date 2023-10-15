
public class Main {
    public static void main(String[] args){
    Resolution resolution = new Resolution(40,70);
    Monitor monitor = new Monitor( "asus", resolution);
    Anakart anakart = new Anakart("lenovo");
    Bilgisayar pc = new Bilgisayar(anakart, monitor);
    
    pc.calistir();
    pc.getAnakart().calistir();
    pc.getMonitor().calistir();
    
    }
}
