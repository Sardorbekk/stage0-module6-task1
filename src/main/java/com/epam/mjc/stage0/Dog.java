package com.epam.mjc.stage0;
public class Dog {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Dog() {
    color="brown";
    numberOfPaws=4;
    hasFur=true;
    }

    public static void main(String[] args) {
  Dog dog=new Dog();
  dog.color="brown";
  dog.numberOfPaws=4;
  dog.hasFur=true;
        System.out.println(dog.getDescription()+" Moreover, it has 2 wings and can fly.");

    }
    public String getDescription(){
        if (numberOfPaws==4&&hasFur) return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "a" + " fur.");
        return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "no" + " fur.");

    }



}
