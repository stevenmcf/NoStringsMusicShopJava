import instruments.DrumMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumMachineTest {

    DrumMachine roland808State;

    @Before
    public void setUp(){
        roland808State = new DrumMachine("Roland", "TR-08", 260, 330, "6 Track");
    }

    @Test

    public void hasRecordingOption() {
        assertEquals("6 Track", roland808State.getRecordingOption());
    }

    @Test
    public void setRecordingOption(){
        roland808State.setRecordingOption("4 Track");
        assertEquals("4 Track", roland808State.getRecordingOption());

    }
}
