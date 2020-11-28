package instruments;

public class DrumMachine extends Instrument {
    public DrumMachine(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice, InstrumentType.ELECTRONIC);
    }
}
