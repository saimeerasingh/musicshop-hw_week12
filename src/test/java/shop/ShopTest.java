package shop;

import instruments.Drums;
import instruments.Guitar;
import instruments.Violin;
import org.junit.Before;

public class ShopTest {
    Shop shop;
    Drums drums;
    Violin violin;
    Guitar guitar;

    @Before
    public void before(){
        drums = new Drums("Brass","Black","Acoustic Drum","Drum Sticks");

        violin = new Violin("Wood","Brown","String");
        guitar = new Guitar("Wood","Black","String");
        shop = new Shop("Music Gear", violin);
    }
}
