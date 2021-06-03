package com.company.Assignment3;

import java.util.*;

public class Frequency {
    public static void main(String a[])
    {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>(5);
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int key=scanner.nextInt();
            if(map.containsKey(key)) map.put(key,map.get(key)+1);
            else map.put(key,1);
        }
        for (Map.Entry<Integer,Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }
}
