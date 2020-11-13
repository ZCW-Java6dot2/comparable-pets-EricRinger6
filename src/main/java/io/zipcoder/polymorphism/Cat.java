package io.zipcoder.polymorphism;

public class Cat extends Pet {

    private String name;

    public Cat(String name, String speak){
        super(name, speak);
    }

    public String speak(){
        return "Meow!";
    }

}
