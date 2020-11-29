package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private double till;
    private ArrayList<ISell>stockList;

    public Shop(String name, double till, ArrayList<ISell> stockList) {
        this.name = name;
        this.till = till;
        this.stockList = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<ISell> getStockList() {
        return stockList;
    }



}
