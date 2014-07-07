package br.com.uri.beginner.test;

import br.com.uri.beginner.Area;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */

public class AreaTest {

    private Area area;

    @Before
    public void setUp() throws Exception {
        area = new Area();

    }

    @Test
    public void testCalculateAreaTriangle(){

        assertEquals(7.800000000000001, area.calculateAreaTriangle(3.0, 5.2), 0);
    }

    @Test
    public void testCalculateAreaCircle(){

        assertEquals(84.94866535306801, area.calculaleAreaCircle(5.2), 0);
    }

    @Test
    public void testCalculateAreaTrapezium(){

        assertEquals(18.200, area.calculateAreaTrapezium(3.0, 4.0, 5.2), 0);
    }

    @Test
    public void testCalculateAreaSquare(){

        assertEquals(16.000, area.calculateAreaSquare(4.0), 0);
    }

    @Test
    public void testCalculateAreaRectangle(){

        assertEquals(12.000, area.calculateAreaRectangle(3.0, 4.0), 0);
    }
}
