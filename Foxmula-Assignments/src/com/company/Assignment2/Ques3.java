package com.company.Assignment2;

import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Set<Integer> hash_set=new HashSet<Integer>(5);
        for(int i=0;i<5;i++)
        {
            hash_set.add(scanner.nextInt());
        }
        Iterator<Integer> it = hash_set.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
