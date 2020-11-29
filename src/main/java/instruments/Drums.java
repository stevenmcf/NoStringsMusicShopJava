package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Drums extends Instrument implements IPlay, ISell {
    public Drums(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice, InstrumentType.PERCUSSION);
    }

    public String play() {
        return "bedumTsss";
    }

    public double calculateMarkUp(){return this.getRetailPrice() - this.getCostPrice();}
}

