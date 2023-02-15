package com.epam.mjc.stage0;



public class Animal {
    //**color**(`String`), **numberOfPaws**(`int`), **hasFur**(`boolean`).
        private String color;
        private int numberOfPaws;
        private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }




    public String getDescription(){
        if (numberOfPaws==1&&hasFur){
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and " + "a" + " fur.";
        }
        else if (numberOfPaws==4&&hasFur) return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "a" + " fur.");
        else if (hasFur) return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "a" + " fur.");
        return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "no" + " fur.");
    }
    public static void main(String[] args) {
                Animal object=new Animal("red",3,true);
        System.out.println(object.getDescription());
    }





























        //return



















}


