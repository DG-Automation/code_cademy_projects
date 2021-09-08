package oop;

public class Droid {

    // instance fields
    private String name;
    private int batteryLevel = 100;

    // constructor
    public Droid(String droidName) {
        this.name = droidName;
    }

    // methods
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport(){
        System.out.println("Current battery level is: " + batteryLevel);
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", batteryLevel=" + batteryLevel +
                '}';
    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("Dom");
        System.out.println(myDroid);

        myDroid.performTask("Walking");
        myDroid.energyReport();
    }
}
