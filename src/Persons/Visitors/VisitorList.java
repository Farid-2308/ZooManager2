/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;

/**
 *
 * @author Farid
 */
public class VisitorList implements List<Visitor> {
    
    private Visitor visitors[];
    private int size;
    
    public VisitorList() {
        this.visitors = new Visitor[100];
        this.size = 0;
    }
    
    @Override
    public Visitor find(Object id) {
        for (int i =0; i < size; i++){
            if (visitors[i] != null && visitors[i].getId().equals(id)){
                return visitors[i];
            }
        }
        return null;
    }

    @Override
    public boolean add(Visitor t) {
        if (size < visitors.length) {
            visitors[size++] = t;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Visitor t) {
        for (int i = 0; i < size; i++) {
            if (visitors[i].equals(t)) {
                System.arraycopy(visitors, i + 1, visitors, i, size - i - 1);
                visitors[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void showAll() {
       for (int i = 0; i < size; i++) {
            System.out.println(visitors[i]);
        }
    }
    
}
