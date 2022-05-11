package model;


public class Vehicle {

    private int weight;
    private int speed;
    private String gears;
    private String steer;

    private static int MAX_SPEED = 200;
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > MAX_SPEED){
            System.out.println("Can't go faster than 200 Km/h");
        }else{
            this.speed = speed;
        }
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = (gears != null)? gears : "N";
    }

    public String getSteer() {
        return steer;
    }

    public void setSteer(String steer) {
        this.steer = (steer != null)? steer : "Straight";
    }


    public Vehicle() {
        setWeight(2000);
        setSpeed(0);
        setGears(gears);
        setSteer(steer);
    }
    public Vehicle(int weight, int speed, String gears, String steer) {
        setWeight(weight);
        setSpeed(speed);
        setGears(gears);
        setSteer(steer);

    }

}