package instruments;

public class BagPipes extends Instrument {

    private BagPipeType bagPipeType;

    public BagPipes(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice, InstrumentType.WIND);
        this.bagPipeType = bagPipeType;

    }
}
