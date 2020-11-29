package instruments;

public class BagPipes extends Instrument {

    private BagPipeType bagPipeType;

    public BagPipes(String make, String model, double costPrice, double retailPrice, BagPipeType bagPipeType) {
        super(make, model, costPrice, retailPrice, InstrumentType.WIND);
        this.bagPipeType = bagPipeType;
    }

    public BagPipeType getBagPipeType() {
        return bagPipeType;
    }
}
