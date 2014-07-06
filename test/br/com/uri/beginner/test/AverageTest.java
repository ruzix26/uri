package br.com.uri.beginner.test;

import br.com.uri.beginner.Average;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class AverageTest {

    private Average average;


    @Before
    public void setUp() throws Exception {
        average = new Average();

    }

    @Test
    public void testAverage(){

        assertEquals(6.431818008422852, average.averageNumbers(5.0f, 7.1f), 0);


    }
}
