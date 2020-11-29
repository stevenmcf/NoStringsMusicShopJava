import accessories.DroneCords;
import accessories.DrumSticks;
import instruments.BagPipeType;
import instruments.BagPipes;
import instruments.DrumMachine;
import instruments.Drums;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drums drums;
    BagPipes bagPipes;
    DrumMachine drumMachine;
    DrumSticks drumSticks;
    DroneCords droneCords;

    @Before
    public void setUp(){
        shop = new Shop("No Strings Music Shop", 5000);

        drums = new Drums("Ludwig", "Amber Vistalite Zep-5", 3000.00, 4000.00);
        drumMachine = new DrumMachine("Roland", "TR-08", 260.50, 330, "6 Track");
        bagPipes = new BagPipes("Duncan MacRae", "SL1", 950, 1150, BagPipeType.HIGHLAND);
        drumSticks = new DrumSticks("Yamaha Joinery", "Beaters", 2.99, 9.99);
        droneCords = new DroneCords("Donald MacDonald Enterprises", "Heedrum Hodrum", 21.99, 42.50);
    }

    @Test
    public void shopHasName(){assertEquals("No Strings Music Shop", shop.getName());}

    @Test
    public void shopHasMoneyInTheTill(){
        assertEquals(5000, shop.getTill(), 0.01);
    }

    @Test
    public void shopHasStock(){
        shop.addToStock(drums);
        shop.addToStock(bagPipes);
        shop.addToStock(drumMachine);
        shop.addToStock(drumSticks);
        shop.addToStock(droneCords);
        assertEquals(5, shop.countStock() );
    }

    @Test
    public void removeItemFromStock(){
        shop.addToStock(drums);
        shop.addToStock(bagPipes);
        shop.addToStock(drumMachine);
        shop.addToStock(drumSticks);
        shop.addToStock(droneCords);
        shop.removeItemFromStock(droneCords);
        shop.removeItemFromStock(drums);
        assertEquals(3, shop.countStock());
    }
}
