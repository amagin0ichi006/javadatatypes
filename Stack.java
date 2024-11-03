/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.stackadt;

/**
 *
 * @author alami
 */
public interface Stack {
    public void  push(Object item);
    public Object pop();
    public Object peek();
    public int getSize();
    public boolean isempty();
}
