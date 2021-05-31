package com.company.Assignment2;
import java.util.*;
import java.util.ArrayList;

public class Ques1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        for(int i=0;i<10;i++)
        {
            arr.add(scanner.nextInt());
        }
        String res="does not contain";
        if(arr.contains(7)) res="contains";
        System.out.println("The list "+ res +" 7");
    }


}
