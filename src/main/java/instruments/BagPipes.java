package instruments;

import behaviours.IPlay;

public class BagPipes extends Instrument implements IPlay {

    private BagPipeType bagPipeType;

    public BagPipes(String make, String model, double costPrice, double retailPrice, BagPipeType bagPipeType) {
        super(make, model, costPrice, retailPrice, InstrumentType.WIND);
        this.bagPipeType = bagPipeType;
    }

    public BagPipeType getBagPipeType() {
        return bagPipeType;
    }

    public String play() {
        return "shrill screech waaaaa Highland Cathedral";
    }
}
