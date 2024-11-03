/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkeddeque;

/**
 *
 * @author alami
 */
//Al-amin Rabiu
//Assignment 4
public class LinkedDeque<T> implements DequeADT<T>
{
    private int size;
    private Node<T> front;
    private Node<T> back;
    
    public LinkedDeque()
    {
        size = 0;
        front = null;
        back = null;
    }
    public void pushFront(T element)
    {
        size++;
        Node<T> n = new Node<>(element);
        if (front==null)
        {
            front = n;
            back = n;
        }
        else
        {
            n.setNext(front);
            front.setPrev(n);
            front = n;
            
        }
    }
    public void pushBack(T element)
    {
        size++;
        Node<T> n = new Node<>(element);
        if (back==null)
        {
            back = n;
            front = n;
        }
        else
        {
            n.setPrev(back);
            back.setNext(n);
            back = n;
            
        }
    }
    
    public T popFront(){
        if(front==null)
           throw new RuntimeException("Can't pop at the front of an empty list");
        
        T temp = front.getValues();
        
        front = front.getNext();
        
        size--;
        
        if (front!=null)
            front.setPrev(null);
        
        else
            back = null;
        
        return temp;
    }
    
    public T popBack()
    {
        if(back==null)
           throw new RuntimeException("Can't pop at the back of an empty list");
        
        T temp = back.getValues();
        
        back = back.getPrev();
        size--;
        if (back!=null)
            back.setNext(null);
        
        else
            front = null;
        
        return temp;
        
    }
    
    public T peekFront()
    {
       if(front==null)
           throw new RuntimeException("Can't peek at the front of an empty list");
       return front.getValues();
    }
    
    public T peekBack()
    {
        if(back==null)
            throw new RuntimeException("Can't peek at the back of an empty list");
        return back.getValues();
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return size==0;
    }
    
    public String toString()
    {
        String result = "[";
        Node<T> head = front;
       while(head!=null)
       {
           result += head.getValues() + " ";
           head = head.getNext();
       }
       return result + "]";
    }
    
    
    
}

