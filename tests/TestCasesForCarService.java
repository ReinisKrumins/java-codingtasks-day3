import enums.Brand;
import enums.Model;
import model.Minivan;
import org.junit.Assert;
import org.junit.Test;
import service.MainCarService;

public class TestCasesForCarService {

    @Test
    public void testCarSteering(){
        Minivan minivanOne = new Minivan(2000,
                0 ,
                "N" ,
                "Straight",
                Brand.Audi,
                Model.alpha);

        MainCarService.steering(minivanOne, "Straight");
        Assert.assertEquals(minivanOne.getSteer(), "Straight");

        MainCarService.steering(minivanOne, "Right");
        Assert.assertEquals(minivanOne.getSteer(), "Right");
    }
    @Test
    public void testCarGears(){
        Minivan minivanOne = new Minivan(2000,
                0 ,
                "N" ,
                "Straight",
                Brand.Audi,
                Model.alpha);

        MainCarService.changingGears(minivanOne, "N");
        Assert.assertEquals(minivanOne.getGears(), "N");
        MainCarService.changingGears(minivanOne, "1");
        Assert.assertEquals(minivanOne.getGears(), "1");
    }
    @Test
    public void testCarSpeed(){
        Minivan minivanOne = new Minivan(2000,
                0 ,
                "N" ,
                "Straight",
                Brand.Audi,
                Model.alpha);

        MainCarService.changeSpeed(minivanOne, 210);
        Assert.assertEquals(minivanOne.getSpeed(), 0);
        MainCarService.changeSpeed(minivanOne, 20);
        Assert.assertEquals(minivanOne.getSpeed(), 20);
    }
}
