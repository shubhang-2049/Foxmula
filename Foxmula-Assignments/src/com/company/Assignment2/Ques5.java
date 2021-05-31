package com.company.Assignment2;

import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        for(int i=0;i<5;i++)
        {
            arr.add(scanner.nextInt());
        }
        for(int i=0;i<arr.size();i++)
        {
            int key= arr.get(i);
            int count=0;
            for(int j=i;j<arr.size();j++)
            {
                if(arr.get(j) == key) count++;
                
            }
            System.out.println(key + " : " +count );
        }
    }
}
