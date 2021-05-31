package com.company.Assignment2;

import java.util.*;


public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>(5);
        for(int i=0;i<5;i++)
        {
            arr.add(scanner.nextInt());
        }
        System.out.println("Enter the value for k");
        Integer Key=scanner.nextInt();
        Boolean found=false;
        outerloop:
        for(int i=0;i< arr.size();i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                if( (Key-arr.get(i)) == arr.get(j))
                {
                    found=true;
                    System.out.println("Pairs "+arr.get(i)+","+arr.get(j));
                    break outerloop;
                }
            }
        }
        if(!found)  System.out.println("No Pair has sum "+Key);
    }
}
