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
    }

    @Test
    public void shopHasName(){assertEquals("No Strings Music Shop", shop.getName());}
}
