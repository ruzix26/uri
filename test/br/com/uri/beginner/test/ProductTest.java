package br.com.uri.beginner.test;

import br.com.uri.beginner.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class ProductTest {

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();

    }

    @Test
    public void testProduct(){

        assertEquals(27, product.productNumbers(3, 9));

    }
}
