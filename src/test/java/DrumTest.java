import instruments.Drums;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    public Drums bedumTsss;

    @Before
    public void setUp(){
        bedumTsss = new Drums("Ludwig", "Amber Vistalite Zep-5", 3000.00, 4000.00);
    }

    @Test
    public void canGetMake(){
        assertEquals("Ludwig", bedumTsss.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Amber Vistalite Zep-5", bedumTsss.getModel());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(3000, bedumTsss.getCostPrice(), 0.01);
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(4000, bedumTsss.getRetailPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, bedumTsss.getInstrumentType());
    }

}
