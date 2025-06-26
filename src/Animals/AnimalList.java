/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Lists.List;
import java.util.Arrays;
/**
 *
 * @author UTN
 */
public class AnimalList implements List<Animal>{
    private Animal Animals[];

    public AnimalList(Animal[] Animals) {
        this.Animals = new Animal[100];
    }
    
    @Override
    public Animal find(Object id) {
        for (int i = 0; i < 100; i++) {
          if (Animals[i]!=null||Animals[i].getId().equals(id)) {
              return Animals[1];
          }  
        }   
        return null;
    }

    @Override
    public boolean add(Animal animal) {
        if (find(animal.getId())!=null) {
                return false;
            }
        for (int i = 0; i < 100; i++) {
            if (Animals[i]==null) {
                Animals[i]=animal;
                return true;
            }
        }
        return false;  
        
    }

    @Override
    public boolean remove(Animal animal) {
        if (find(animal.getId())!=null) {
                return false;
            }
        for (int i = 0; i < 100; i++) {
            if (Animals[i]==null) {
                Animals[i]=animal;
                return true;
            }
        }
        return false;
    }

    @Override
    public void showAll() {
        System.out.println(Arrays.toString(Animals));
    }
    
}
