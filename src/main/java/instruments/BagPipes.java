package instruments;

public class BagPipes extends Instrument {
    public BagPipes(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice, InstrumentType.WIND);
    }
}
