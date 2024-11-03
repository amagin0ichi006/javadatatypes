package com.mycompany.stackadt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alami
 */

public class linkedStack implements Stack 
{
    private int size;
    private Node top;//to access from top cuz thats what we want
    
    public linkedStack()
    {
        size = 0;
        top = null;
    }
    
    public void  push(Object item)
    {   size++;
        Node n = new Node(item);
        n.setNext(top);
        top = n;
        
    }
    
    public Object pop()
    {
        if(top==null)
            throw new RuntimeException("Can't pop an empty list");
        Object temp = top.getvalue();
        top = top.getNext(); 
        size--;
        return temp;
    }
    
    public Object peek()
    {
        if(top==null)
            throw new RuntimeException("Can't peek at an empty list");
        return top.getvalue();
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean isempty()
    {
        return size==0;
    }
    
    public String toString()
    {
        String result = "[";
        Node current = top;
        while(current!=null)
        {
            result += current.getvalue() + " ";
            current = current.getNext();
        }
        return result + "]";
    }
    
     public static void main(String[] args) 
    {
        linkedStack s = new linkedStack();
        System.out.println(s);
        System.out.println("Size: " + s.getSize());
        System.out.println("empty: " + s.isempty());
        System.out.println();
        
        for(int i =0; i<26; i++)
        {
            String c = "" + (char)('A' + i);
            s.push(c);
            System.out.println("Push" + c + ":"+ s);
        }
        
    }
    
}
