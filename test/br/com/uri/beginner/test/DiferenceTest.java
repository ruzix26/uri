package br.com.uri.beginner.test;

import br.com.uri.beginner.Diference;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class DiferenceTest {

    private Diference direfence;

    @Before
    public void setUp() throws Exception {
        direfence = new Diference();

    }

    @Test
    public void testDiferenceNumbers(){

    assertEquals(-26, direfence.diferenceNumbers(5, 6 ,7 ,8));


    }
}
