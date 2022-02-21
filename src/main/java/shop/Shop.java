package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private String name;

    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    @Override
    public int buyingPrice() {
        return 0;
    }


    @Override
    public int sellingPrice() {
        return 0;
    }
}
