package br.com.uri.beginner.test;

import br.com.uri.beginner.Sum2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class Sum2Test {


    private Sum2 sum2;

    @Before
    public void setUp() throws Exception {
        sum2 = new Sum2();
    }

    @Test
    public void testSum2(){

        assertEquals(7, sum2.sumNumbers2(2, 5));
    }
}
