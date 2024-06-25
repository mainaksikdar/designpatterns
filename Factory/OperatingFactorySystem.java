package Factory;

public class OperatingFactorySystem {

    public OS getInstance(String str) {
        if(str.equals("Android"))
            return new Android();
        else if (str.equals("Ios"))
            return new Ios();
        else
            return new Windows();
    }
}
