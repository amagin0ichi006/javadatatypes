/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package queueadt;

/**
 *
 * @author alami
 */
public interface Queue<T> {
    public void push(T x);
    public void pop();
    public int getSize();
    public T peek();
    public boolean isEmpty();
}
