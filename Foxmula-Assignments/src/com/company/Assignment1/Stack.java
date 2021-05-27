package com.company.Assignment1;

import java.util.*;
public class Stack {

    class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node top = null;
    public Node bottom = null;


    private int size = 0;


    public int getSize()
    {
        return size;
    }

    boolean checkEmpty()
    {
        return (size == 0);
    }

    public void push(int data) {

        Node newNode = new Node(data);

        if(this.checkEmpty()) {

            top = newNode;
            bottom=newNode;
            size=1;
        }
        else {

            top.next = newNode;
            top = newNode;
            size++;
        }
    }
// returns the top most element and deletes it
    public int pop()
    {
        if (top == null) {
            System.out.println("No elements in stack ,Nothing was deleted");
            return 0;
        }
        else
        {
            Node temp=bottom;
            int element=top.getData();
            // If there is only one element in stack
            if(bottom.getNext()==null)
            {
                 top=null;bottom=null;
                 size=0;
            }
            else
            {
                for(temp=bottom; temp.getNext()!=top ; temp=temp.getNext())
                {}
                top=temp;
                size--;
            }
            return element;
        }
    }




    public static void main(String args[])
    {
        Stack stack1=new Stack();
        Stack stack2=new Stack();
        int choice=5;
        int input=0;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1. Push to Stack-1");//Modify your menu
            System.out.println("2. Push to Stack-2");
            System.out.println("3. Pop from Stack-1");
            System.out.println("4. Pop from Stack-2");
            System.out.println("Enter any other value to exit");
            choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Enter the number to push in first stack");
                    input=scanner.nextInt();
                    stack1.push(input);
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack1.getSize());
                    }
                    break;
                case 2 :
                    System.out.println("Enter the number to pushin second stack");
                    input=scanner.nextInt();
                    stack2.push(input);
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack2.getSize());
                    }
                    break;
                case 3 :
                    stack1.pop();
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack1.getSize());
                    }
                    break;
                case 4 :
                    stack2.pop();
                    if(stack1.getSize()== stack2.getSize())
                    {
                        System.out.println("The size of both the stacks is "+stack2.getSize());
                    }
                    break;
                default :
                    exit = true;
            }
        }
    }
}
