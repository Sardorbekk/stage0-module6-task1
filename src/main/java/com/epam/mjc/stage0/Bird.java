package com.epam.mjc.stage0;

public class Bird {


   private String color;
   private int numberOfPaws;
   private boolean hasFur;
   public Bird() {
      color="blue";
      numberOfPaws=2;
      hasFur=false;
   }

   public static void main(String[] args) {
      Bird bird=new Bird();
      bird.color="blue";
      bird.hasFur=false;
      bird.numberOfPaws=2;
      System.out.println(bird.getDescription());

   }
   public String getDescription(){
      if (numberOfPaws==2&&hasFur) return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "a" + " fur.");
      return ("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + "no" + " fur."+" Moreover, it has 2 wings and can fly.");

   }




}
