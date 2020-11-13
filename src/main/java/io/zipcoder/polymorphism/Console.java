package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    Integer numOfPets;
    String petType;
    String petName;
    ArrayList<Pet> pets = new ArrayList<Pet>();

    public Console(){

    }

    public void run(){
        getNumOfPets();

        for(int i = 0; i < numOfPets; i++){
            getTypeOfPet();
            if(petType.equals("Dog")){
                getPetName();
                Dog dog = new Dog(petName, "Bark!");
                addPets(dog);
            } else if(petType.equals("Cat")){
                getPetName();
                Cat cat = new Cat(petName, "Meow!");
                addPets(cat);
            } else if(petType.equals("Bird")){
                getPetName();
                Bird bird = new Bird(petName, "Chirp!");
                addPets(bird);
            } else{
                i--;
                Console.print("Please input a valid pet type.");
            }
        }
        pets.forEach((p) -> {
            Console.print(p.getName() + " " + p.getSpeak());
        });
    }

    public void addPets(Pet pet){
        pets.add(pet);
    }

    public ArrayList<Pet> getPets(){
        return pets;
    }

    public void getPetName(){
        this.petName = Console.getStringInput("Please enter your " + petType + "'s name. ");
    }

    public void getTypeOfPet(){
        this.petType = Console.getStringInput("What type of pet do you have?\nDog, Cat, or Bird? ");
    }

    public void getNumOfPets(){
        this.numOfPets = Console.getIntegerInput("How many pets do you own? ");
    }

    public static void print(String output){
        System.out.println(output);
    }

    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        String userInput = scanner.next();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

}
