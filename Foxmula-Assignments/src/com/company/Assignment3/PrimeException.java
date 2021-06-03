package com.company.Assignment3;

import java.util.*;
class CustomException extends Exception
{
    public CustomException (String s)
    {
        super(s);
    }
}
class Check{
    static boolean check(Integer number)
    {
//        checking if the number is odd
        if(number%2!=0)
        {
//            checking if the number is prime or not
            for(int i=3;i*i<number;i++)
            {
                if(number%i==0) return false;
            }
            return true;
        }
        else return false;
    }
}
public class PrimeException {
    public static void main(String a[])
    {
        Scanner scanner= new Scanner(System.in);
        Integer number= scanner.nextInt();
        try
        {
            if(Check.check(number))
            {
                throw new CustomException("Number is invalid");
            }
            System.out.println("The input was valid ");
        }
        catch(CustomException ex)
        {
            System.out.println("Exception occured");
            System.out.println(ex.getMessage());
        }
    }
}
