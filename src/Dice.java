package com.java24hours;

import java.util.*;

class Dice {
    public static void main (String[]args){
    Random generator = new Random ();
    int value = generator.nextInt();
    System.out.print("The random number is"  +  value);
    }
}

