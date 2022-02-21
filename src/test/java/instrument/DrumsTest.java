package instrument;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Brass","Black","Acoustic Drum");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass",drums.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("Black",drums.getColor());
    }

    @Test
    public void canGetType(){
        assertEquals("Acoustic Drum",drums.getType());
    }



}
