public class Bike {
    private String name;
    private boolean isOn;
    private int gear;
    public Bike (String name, boolean isOn, int gear){
        this.name = name;
        this.isOn = isOn;
        this.gear = gear;

    }

    public Bike(){

    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setGear(5);
        System.out.println(bike.getGear());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (gear > 0 && gear <= 5){
            this.gear = gear;
        }
        else {
            this.gear = 0;
        }
    }
}
