package instrument;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood","Black","String");
    }

    @Test
    public void canPlay(){
        assertEquals("ta da!",guitar.play("ta da!"));
    }
}
