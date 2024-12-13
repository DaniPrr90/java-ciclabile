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


//  Definisco un metodo per ottenere l'elemento successivo
public int getElementoSuccessivo() {
    if (!hasAncoraElementi()) {
        throw new IllegalStateException("Non ci sono più elementi da restituire.");
    }
    return elements[currentIndex++];
}


















}
 

