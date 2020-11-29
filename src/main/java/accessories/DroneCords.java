package accessories;


import behaviours.ISell;

public class DroneCords extends Accessory implements ISell {
    public DroneCords(String make, String model, double costPrice, double retailPrice) {
        super(make, model, costPrice, retailPrice);
    }

   public double calculateMarkUp(){return this.getRetailPrice() - this.getCostPrice();}
}
