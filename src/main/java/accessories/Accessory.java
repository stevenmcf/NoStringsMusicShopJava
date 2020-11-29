package accessories;

import items.Item;

public abstract class Accessory extends Item {
    public Accessory(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice);
    }

}
