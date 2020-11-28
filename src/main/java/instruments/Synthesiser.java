package instruments;

public class Synthesiser extends Instrument {
    public Synthesiser(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice, InstrumentType.ELECTRONIC);
    }
}

