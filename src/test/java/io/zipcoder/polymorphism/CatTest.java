package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testGetName(){
        String actual = "Mochi";

        Cat cat = new Cat(actual, "Chirp");

        String expected = cat.getName();

        Assert.assertEquals(actual, expected);
    }
}
