public class LandLinePhone extends Phone{
    private boolean isCallable;
    public LandLinePhone(String number, String modelName, double weight, boolean isCallable) {
        super(number, modelName, weight);
        this.isCallable=isCallable;
    }
    public boolean getisCallable() {
        return isCallable;
    }

    public void setisCallable(boolean isCallable) {
        this.isCallable = isCallable;
    }
    @Override
    public String toString() {
        return super.toString() + ", isCallable: " + isCallable;
    }
    @Override
    public void ring() {
        System.out.println("Пищит стационарный телефон");
    }
}
