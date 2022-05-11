package model;

import enums.Brand;
import enums.Model;

public class Car extends Vehicle{

    private Brand brand;
    private Model model;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = (brand != null)? brand : Brand.Unknown;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = (model != null)? model : Model.alpha;
    }

    public Car(Brand brand, Model model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(int weight, int speed, String gears, String steer, Brand brand, Model model) {
        super(weight, speed, gears, steer);
        setBrand(brand);
        setModel(model);
    }

}
