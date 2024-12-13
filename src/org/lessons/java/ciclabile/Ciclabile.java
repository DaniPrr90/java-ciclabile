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

    // Metodo per ottenere l'elemento successivo
    public int getElementoSuccessivo() {
        if (!hasAncoraElementi()) {
            throw new IllegalStateException("Non ci sono più elementi da restituire.");
        }
        return elements[currentIndex++];
    }

    // Metodo per verificare se ci sono ancora elementi
    public boolean hasAncoraElementi() {
        return currentIndex < elements.length;
    }

    // Metodo per resettare l'indice (opzionale, se utile per riavviare l'iterazione)
    public void reset() {
        currentIndex = 0;
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        Ciclabile iteratore = new Ciclabile(numeri);

        while (iteratore.hasAncoraElementi()) {
            System.out.println(iteratore.getElementoSuccessivo());
        }

        // Esempio di reset dell'iteratore
        iteratore.reset();
        System.out.println("Iterazione dopo il reset:");
        while (iteratore.hasAncoraElementi()) {
            System.out.println(iteratore.getElementoSuccessivo());
        }
    }
}
 

