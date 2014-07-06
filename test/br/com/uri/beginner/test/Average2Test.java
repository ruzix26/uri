package br.com.uri.beginner.test;

import br.com.uri.beginner.Average2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class Average2Test {

    private Average2 average2;

    @Before
    public void setUp() throws Exception {
        average2 = new Average2();

    }

    @Test
    public void testAverage2(){

        assertEquals(6.300000190734863, average2.average2Numbers(5, 6 ,7), 0);

    }
}
