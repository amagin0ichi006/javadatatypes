/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package linkeddeque;

/**
 *
 * @author alami
 */
public interface DequeADT<T>
{
    public void pushFront(T element);
    public void pushBack(T element);
    public T popFront();
    public T popBack();
    public T peekFront();
    public T peekBack();
    public int getSize();
    public boolean isEmpty();
}