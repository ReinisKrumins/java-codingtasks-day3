package service;
import enums.Brand;
import enums.Model;
import model.Minivan;

public class MainCarService {

    public static void main(String[] args) {

        Minivan minivanOne = new Minivan(2000,
                0 ,
                "N" ,
                "Straight",
                Brand.Audi,
                Model.alpha);

        System.out.println(minivanOne.toString());
        steering(minivanOne, "Straight");
        steering(minivanOne, "Right");
        System.out.println(minivanOne.toString());
        changingGears(minivanOne, "N");
        changingGears(minivanOne, "1");
        System.out.println(minivanOne.toString());
        changeSpeed(minivanOne, 210);
        System.out.println(minivanOne.toString());
        changeSpeed(minivanOne, 20);
        System.out.println(minivanOne.toString());

        System.out.println(minivanOne.toString());
        steering(minivanOne, "Right");
        System.out.println(minivanOne.toString());
        changingGears(minivanOne, "2");
        System.out.println(minivanOne.toString());
        changeSpeed(minivanOne, 30);
        System.out.println(minivanOne.toString());

    }

    public static void steering(Minivan m, String direction){
        if(direction == m.getSteer()){
            System.out.println("*You are already steering this way*");
        }else{
            m.setSteer(direction);
        }

    }
    public static void changingGears(Minivan m, String gear){
        if(gear == m.getGears()){
            System.out.println("*You are already using this gear*");
        }else{
            m.setGears(gear);
        }
    }
    public static void changeSpeed(Minivan m, int amount){
        if(amount == m.getSpeed()){
            System.out.println("*It's your current speed*");
        }else{
            m.setSpeed(amount);
        }
    }
}
