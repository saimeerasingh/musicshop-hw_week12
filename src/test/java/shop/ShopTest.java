package shop;

import instruments.Drums;
import instruments.Guitar;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class ShopTest {
    ArrayList<Violin> violins;
    Shop shop;
    Drums drums;
    Violin violin;
    Guitar guitar;

    @Before
    public void before(){
        violins = new ArrayList<>();
        shop = new Shop("Music Gear",violins);
    }
    @Test
    public void canAddItem(){
        violin = new Violin("Wood","Brown","String");
        violins.add(violin);
        assertTrue("greater than 0",shop.addItem(violin)>0);

    }
    @Test
    public void canRemoveItem() {
        violin = new Violin("Wood", "Brown", "String");
        violins.add(violin);
        shop.addItem(violin);
        assertTrue("equals to 0", shop.removeItem(violin) == 0);
    }

}
