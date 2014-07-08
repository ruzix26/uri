package br.com.uri.beginner.test;

import br.com.uri.beginner.TheGreatest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/7/14.
 */
public class TheGreatestTest {

    private TheGreatest theGReatest;

    @Test
    public void testTheGreatest(){
        theGReatest = new TheGreatest();

        assertEquals(14, theGReatest.choiceTheGreatest(7, 14, 6));

    }
}
