package model;

import enums.Brand;
import enums.Model;

public class Minivan extends Car{

    private int seats;
    private String color;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = (seats != 0)? seats : 6;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color != null)? color : "White";
    }

    public Minivan(Brand brand, Model model) {
        super(brand, model);
        setSeats(seats);
        setColor(color);
    }

    public Minivan(int weight, int speed, String gears, String steer, Brand brand, Model model) {
        super(weight, speed, gears, steer, brand, model);
        setSeats(seats);
        setColor(color);
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "weight=" + getWeight() + " KG"+
                ", speed=" + getSpeed() + " Km/h"+
                ", gears=" + getGears() +
                ", steer=" + getSteer() +
                ", seats=" + seats +
                ", color=" + color +
                ", brand=" + getBrand() +
                ", model=" + getModel() +
                '}';
    }

}
