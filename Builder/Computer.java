package Builder;

public class Computer {

    //required parameters
        private String HDD;
        private String RAM;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;


        public String getHDD() {
            return HDD;
        }

        public String getRAM() {
            return RAM;
        }

        public boolean isGraphicsCardEnabled() {
            return isGraphicsCardEnabled;
        }

        public boolean isBluetoothEnabled() {
            return isBluetoothEnabled;
        }

        public Computer(String hdd, String ram, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
            this.HDD=hdd;
            this.RAM=ram;
            this.isGraphicsCardEnabled=isGraphicsCardEnabled;
            this.isBluetoothEnabled=isBluetoothEnabled;
        }

        @Override
        public String toString() {
            return "HDD :"+getHDD()+", ram :"+getRAM()+", isGraphicsEnabled :"+isGraphicsCardEnabled()+", isBluetoothEnabled :"+isBluetoothEnabled();
        }
}
