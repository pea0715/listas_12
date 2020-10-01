/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samaniw
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //cola con arreglo circular
         SingleLinkedList<Integer> miListaS = new SingleLinkedList<>();
        miListaS.addLast(10);
        miListaS.addLast(20);
        miListaS.addLast(50);
        miListaS.addLast(30);
        miListaS.addLast(40);
        System.out.println("El número mayor de la lista es: " + miListaS.getMaj());
        System.out.println("El número menor de la lista es: " + miListaS.getMin());
        System.out.println("Datos de la lista simple " + miListaS.showData());
        System.out.println("El promedio es: " + miListaS.getAverage());
        miListaS.deleteLast();
        System.out.println("Datos de la lista simple " + miListaS.showData());

        System.out.println();
        
        //pruebas de lista enlazada doble
        DoubleLinkedList<Integer> miListaD = new DoubleLinkedList<>();
        miListaD.addOrdered(10);
        miListaD.addOrdered(30);
        miListaD.addOrdered(50);
        miListaD.addOrdered(40);
        miListaD.addOrdered(20);

        System.out.println("Datos de la lista enlazada doble: "
                + miListaD.showData());
        System.out.println("Existe el número 70 en la lista? " + miListaD.exist(70));
        System.out.println("Existe el número 20 en la lista? " + miListaD.exist(20));
        miListaD.delete();
        System.out.println("Datos de la lista enlazada doble despúes de eliminar"
                + " el primer dato: "
                + miListaD.showData());
        System.out.println();
        
        CircularSingleLinkedList<Integer> circular1 = new CircularSingleLinkedList<>();
        circular1.addLast(50);
        circular1.addLast(25);
        circular1.addLast(14);
        circular1.addLast(10);
        System.out.println("Lista 1: "+ circular1.showData());
        circular1.deleteLast();
        System.out.println("Lista 1 después de borrar el último dato: "
                + circular1.showData());
        CircularSingleLinkedList<Integer> circular2 = new CircularSingleLinkedList<>();
        circular2.add(30);
        circular2.add(40);
        circular2.add(80);
        System.out.println("Lista 2: "+ circular2.showData());
        //prueba de unir listas
        circular1.joinList(circular2);
        System.out.println("Listas unidas: "+ circular1.showData());
        System.out.println("");
        
        CircularDoubleLinkedList<Integer> miListaCD = new CircularDoubleLinkedList<>();
        miListaCD.addOrdered(11);
        miListaCD.addOrdered(22);
        miListaCD.addOrdered(30);
        miListaCD.addOrdered(40);
        miListaCD.addOrdered(50);
        miListaCD.addOrdered(60);
        miListaCD.addOrdered(70);
        System.out.println("Datos de la lista circular doble ordenadamente: " + miListaCD.showData());
        miListaCD.deleteLast();
        miListaCD.delete();
        System.out.println("Datos de la lista circular doble después de borrar "
                + "el primer y último dato: " + miListaCD.showData());
        //miListaCD.deleteLast();
       
    }
}


