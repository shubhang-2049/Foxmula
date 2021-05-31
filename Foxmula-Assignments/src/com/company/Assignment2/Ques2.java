package com.company.Assignment2;

import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Set<Integer> hash_set=new HashSet<Integer>();
        for(int i=0;i<5;i++)
        {
            hash_set.add(scanner.nextInt());
        }
        String res="does not contain";
        if(hash_set.contains(7)) res="contains";
        System.out.println("The Set "+ res +" 7");
    }
}
