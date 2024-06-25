package Factory;

public class FactoryMain {

    public static void main(String[] args) {
        OperatingFactorySystem osf = new OperatingFactorySystem();
        OS obj = osf.getInstance("Android");
        obj.spec();
    }
}
