/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueadt;

/**
 *
 * @author alami
 */
public class linkedQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> rear;
    private int count;
    
    
    public linkedQueue()
    {
        head = null;
        rear = null;
        count = 0;
    }
    
    public void push(T x)
    {
        Node<T> n = new Node<>(x);
        if (rear != null)
            rear.setNext(n);
        else
            head = n;
        
        rear = n;
        count++;
    }
    
    public void pop()
    {
        if(head==null)
            throw new RuntimeException("Can't pop at an empty list");
       head = head.getNext();
       count--;
       
       if(head==null)
           rear = null;
    }
    
    public int getSize()
    {
        return count;
    }
    public T peek()
    {
        if (head==null)
            throw new RuntimeException("Can't peek at an empty list");
        return head.getValues();
    }
    
    public boolean isEmpty()
    {
        return count ==0;
    }
    public String toString()
    {
        String result = "[";
        Node temp = head;//change head to temp for the iteration
        while(temp!=null)
        {
            result += temp.getValues() + " ";
            temp = temp.getNext();
        }
        return result + "]";
    }
    
    public static void main(String[] args) 
    {
        linkedQueue s = new linkedQueue();
        System.out.println(s);
        System.out.println("Size: " + s.getSize());
        System.out.println("empty: " + s.isEmpty());
        System.out.println();
        
        for(int i =0; i<26; i++)
        {
            String c = "" + (char)('A' + i);
            s.push(c);
            System.out.println("Push" + c + ":"+ s);
        }
        
    }

    
}
