package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testGetName(){
        String actual = "Meidri";

        Bird bird = new Bird(actual, "Chirp");

        String expected = bird.getName();

        Assert.assertEquals(actual, expected);
    }


}
