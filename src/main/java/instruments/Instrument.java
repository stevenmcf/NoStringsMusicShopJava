package instruments;

import items.Item;

public abstract class Instrument extends Item {

    private InstrumentType instrumentType;

    public Instrument(String make, String model, double costPrice, double retailPrice, InstrumentType instrumentType) {
        super(make, model, costPrice, retailPrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }
}
