/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueadt;

/**
 *
 * @author alami
 */

//Al-amin Rabiu
//Assignment 4
public class Node<T> 
{
    private T values;
    private Node<T> next;
    private Node<T> previous;
    
    public Node(T value)
    {
        values = value;
        next = null;
        previous = null;
    }
    
    public T getValues()
    {
        return values;
    }
    
    public void setNext(Node<T> n)
    {
        next = n;
    }
    
    public void setPrev(Node<T> p)
    {
        previous = p;
    }
    
    public Node<T> getNext()
    {
        return next;
    }
    
    public Node<T> getPrev()
    {
        return previous;
    }
    
}
