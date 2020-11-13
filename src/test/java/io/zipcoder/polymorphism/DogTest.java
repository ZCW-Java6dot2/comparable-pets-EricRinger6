package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testGetName(){
        String actual = "Roxy";

        Dog dog = new Dog(actual, "Chirp");

        String expected = dog.getName();

        Assert.assertEquals(actual, expected);
    }

}
