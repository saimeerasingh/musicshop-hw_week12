package shop;

import behaviours.ISell;
import instruments.Violin;

import java.util.ArrayList;

public class Shop implements ISell {

    private String name;

    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<Violin> stock) {
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



    public int addItem(ISell item){this.stock.add(item); return this.stock.size();}

    public int removeItem(ISell item){this.stock.remove(item);return this.stock.size();}
}
