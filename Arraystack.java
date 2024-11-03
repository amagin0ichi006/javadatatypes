/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alami
 */
package com.mycompany.stackadt;

public class Arraystack implements stackadt 
{
    private int size;
    private Object[] items;
    
    public Arraystack()
    {
        size = 0;
        items = new Object[5];
    
    }
    public void push(Object item)
    {
        if (size == items.length)
            createBiggerarray();
        items[size]= item;
        size++;
    }
    
    public void createBiggerarray()
    {
        Object [] newarr = new Object[size*2];
        for (int i = 0; i< size; i++)
            newarr[i] = items[i];
        
        items = newarr;        
    }
    
    public Object pop()
    {
        if (size == 0)
            throw new RuntimeException("Cant pop an empty list");
        size--;
        Object temp = items[size];
        items[size] = null;
        return temp;
        
    }
    
    public Object peek()
    {
        if (size == 0)
            throw new RuntimeException("Cant peek at an empty list dummy");
        size--;
        return items[size];
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean isempty()
    {
        return size == 0;
    }
    
    public String toString()
    {
        String str = "[";
        for (int i = 0; i < size; i++)
            str += items[i] + " ";
        return str + "]";
    }
    
      public static void main(String[] args) 
    {
        Arraystack s = new Arraystack();
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
        while (!s.isempty())
        {
            s.pop();
            System.out.println(s);
        }
        
    }
      
        
}

  
    

