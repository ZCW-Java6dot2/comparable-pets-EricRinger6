package io.zipcoder.polymorphism;

public class Dog extends Pet{

    private String name;

    public Dog(String name, String speak){
        super(name, speak);
    }

    public String speak(){
        return "Bark!";
    }
}
