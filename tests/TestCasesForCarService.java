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
        Assert.assertEquals("Straight", minivan.getSteer());

        MainCarService.steering(minivan, "Right");
        Assert.assertEquals("Right", minivan.getSteer());
    }
    @Test
    public void testCarGears()
    {
        MainCarService.changingGears(minivan, "N");
        Assert.assertEquals("N", minivan.getGears());
        MainCarService.changingGears(minivan, "1");
        Assert.assertEquals("1", minivan.getGears());
    }
    @Test
    public void testCarSpeed()
    {
        MainCarService.changeSpeed(minivan, 210);
        Assert.assertEquals(0, minivan.getSpeed());
        MainCarService.changeSpeed(minivan, 20);
        Assert.assertEquals(20, minivan.getSpeed());
    }
}
