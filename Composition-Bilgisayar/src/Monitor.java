
public class Monitor {
    private String marka;
    private Resolution resolution;

    public Monitor(String marka, Resolution resolution) {
        this.marka = marka;
        this.resolution = resolution;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    public void calistir(){
    
    System.out.println("monitor calisiyor.");
    }
    
}
