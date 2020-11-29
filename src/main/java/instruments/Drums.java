package instruments;

import behaviours.IPlay;

public class Drums extends Instrument implements IPlay {
    public Drums(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice, InstrumentType.PERCUSSION);
    }

    public String play() {
        return "bedumTsss";
    }
}

