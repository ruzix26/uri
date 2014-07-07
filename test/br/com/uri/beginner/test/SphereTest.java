package br.com.uri.beginner.test;

import br.com.uri.beginner.Sphere;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class SphereTest {

    private Sphere sphere;

    @Before
    public void setUp() throws Exception {
        sphere = new Sphere();
    }

    @Test
    public void testCaculateSphereArea(){

    assertEquals(113.09733581542969, sphere.calulateSphereVolume(3), 0);
    }
}
