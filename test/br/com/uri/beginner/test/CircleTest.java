package br.com.uri.beginner.test;

import br.com.uri.beginner.Circle;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gustavo on 7/3/14.
 */
public class CircleTest {

    private Circle circle;

    @Before
    public void setUp(){
        circle = new Circle();
    }

    @Test
    public void testCalculateCircleArea(){

        circle.calculateArea(2);
    }
}
