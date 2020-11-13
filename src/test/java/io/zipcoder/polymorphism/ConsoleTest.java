package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ConsoleTest {
@Test
    public void testMe(){}

    @Test
    public void getAddPets(){
        Dog dog = new Dog("Ralf", "Bark");
        Cat cat = new Cat("Mochi", "Meow");
        Console console = new Console();

        ArrayList<Pet> pets = new ArrayList<>();
        pets.set(0, dog);
        pets.set(1, cat);

        console.addPets(dog);
        console.addPets(cat);

        ArrayList<Pet> expected = console.getPets();

        Assert.assertEquals(pets, expected);

    }


}
