package jv.in.thinking.holding.collection;

import jv.in.thinking.typeinfo.pets.Pet;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author: shiwenwei
 * @date: 2021/1/23 11:06 PM
 * @since v1.0
 */
public class InterfaceVsIterator {

    public static void display(Iterator<Pet> pets) {
        while (pets.hasNext()) {
            Pet pet = pets.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet pet : pets) {
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
