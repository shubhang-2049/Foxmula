package com.company.Assignment2;

import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Set<Integer> tree_set=new TreeSet<Integer>();
        for(int i=0;i<5;i++)
        {
            tree_set.add(scanner.nextInt());
        }
        Iterator<Integer> it = tree_set.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
