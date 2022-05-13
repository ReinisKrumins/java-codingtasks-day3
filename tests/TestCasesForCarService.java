import enums.Brand;
import enums.Model;
import model.Minivan;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import service.MainCarService;

public class TestCasesForCarService {
    private static Minivan minivan;

    @BeforeClass
    public static void setUp()
    {
        minivan = new Minivan(2000,
                0 ,
                "N" ,
                "Straight",
                Brand.Audi,
                Model.alpha);
    }

    @Test
    public void testCarSteering()
    {
        MainCarService.steering(minivan, "Straight");
        Assert.assertEquals(minivan.getSteer(), "Straight");

        MainCarService.steering(minivan, "Right");
        Assert.assertEquals(minivan.getSteer(), "Right");
    }
    @Test
    public void testCarGears()
    {
        MainCarService.changingGears(minivan, "N");
        Assert.assertEquals(minivan.getGears(), "N");
        MainCarService.changingGears(minivan, "1");
        Assert.assertEquals(minivan.getGears(), "1");
    }
    @Test
    public void testCarSpeed()
    {
        MainCarService.changeSpeed(minivan, 210);
        Assert.assertEquals(minivan.getSpeed(), 0);
        MainCarService.changeSpeed(minivan, 20);
        Assert.assertEquals(minivan.getSpeed(), 20);
    }
}
