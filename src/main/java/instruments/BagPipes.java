package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class BagPipes extends Instrument implements IPlay, ISell {

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

    public double calculateMarkUp(){return this.getRetailPrice() - this.getCostPrice();}
}
