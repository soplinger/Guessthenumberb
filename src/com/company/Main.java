package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random numbGen = new Random();
        int lowerLimit = 0;
        int upperLimit = 100;

        String higher = "higher", lower = "lower", correct = "correct", input;
        int theGuess, rand, rand2 = 1, rand3 = 100, randomLast, cntr = 1;

        rand = numbGen.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        randomLast = rand;
        System.out.println("Your Number is: " + rand);
        System.out.println("Is your number lower, higher, or correct? ");
        input = read.next();

        while (!input.equals("correct")){
            if (input.equals("lower")){
                randomLast = rand2;
                rand2 = numbGen.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
                if ((rand2 < rand) && (rand2 < randomLast)){
                    rand = rand2;
                    cntr += 1;
                    System.out.println("Your Number is: " + rand);
                    System.out.println("Is your number lower, higher, or correct? ");
                    input = read.next();
                } else{
                    input = lower;
                }
            } else if (input.equals("higher")){
                randomLast = rand3;
                rand3 = numbGen.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
                if ((rand3 > rand) && (rand3 > randomLast)) {
                    rand = rand3;
                    cntr += 1;
                    System.out.println("Your Number is: " + rand);
                    System.out.println("Is your number lower, higher, or correct? ");
                    input = read.next();
                }else {
                    input = higher;

                }
            }
        }






    }







    }
