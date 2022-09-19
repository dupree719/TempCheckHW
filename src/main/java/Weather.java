//HOMEWORK 1: Temperature check

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Is the temperature high, low, or humid?");
        String temp =  x.nextLine();


        if(temp.equalsIgnoreCase("high")){
            System.out.println("Sunblock may be needed.");
        }else if(temp.equalsIgnoreCase("low")){
            System.out.println("A coat may be needed.");
        }else if(temp.equalsIgnoreCase("humid")){
            System.out.println("It's muggy!");
        }







    }





}
