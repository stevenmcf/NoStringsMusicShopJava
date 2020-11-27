package items;

public abstract class Item {

    private String make;
    private String model;
    private double costPrice;
    private double retailPrice;


    public Item(String make, String model, double costPrice, double retailPrice) {
        this.make = make;
        this.model = model;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
