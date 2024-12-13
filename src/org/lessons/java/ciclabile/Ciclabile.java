package org.lessons.java.ciclabile;

public class Ciclabile {
    private int[] elements; // Definisco un Array  che contenga gli elementi
    private int currentIndex; // Indice per tracciare la posizione corrente

    // Definisco un costruttore che accetta un array di interi
    public Ciclabile(int[] elements) {
        if (elements == null) {
            throw new IllegalArgumentException("L'array non può essere null");
        }
        this.elements = elements;
        this.currentIndex = 0;
    }

}
 

