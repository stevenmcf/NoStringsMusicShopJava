import instruments.Drums;
import org.junit.Before;

public class DrumTest {
    public Drums bedumTsss;

    @Before
    public void setUp(){
        bedumTsss = new Drums("Ludwig", "Amber Vistalite Zep-5", 3000.00, 4000.00);
    }

}
