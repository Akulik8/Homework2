public class MobilePhone extends Phone{
    private double screenSize;
    private boolean isFoldable ;
    public MobilePhone(String number, String modelName, double weight, double screenSize, boolean isFoldable ) {
        super(number, modelName, weight);
        this.screenSize = screenSize;
        this.isFoldable  = isFoldable ;
    }
    public double getscreenSize() {
        return screenSize;
    }

    public void setscreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public boolean getisFoldable() {
        return isFoldable;
    }

    public void setisFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }
    public void sendMessage(String message, int number){
        System.out.println(message + ": " + number);
    }
    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSize + ", isFoldable: " + isFoldable;
    }
    @Override
    public void ring() {
        System.out.println("Играет полифония мобильника");
    }
}
