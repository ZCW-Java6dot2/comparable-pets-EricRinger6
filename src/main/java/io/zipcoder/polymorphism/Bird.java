package io.zipcoder.polymorphism;

public class Bird extends Pet{

    private String name;

    public Bird(String name, String speak){
        super(name, speak);
    }

    public String speak(){
        return "Chirp!";
    }

}
