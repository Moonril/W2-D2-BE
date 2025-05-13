package esercizio2;

import java.util.ArrayList;
import java.util.Random;

/*
Esercizio #2
.Scrivere una funzione che accetti un intero N e restituisca una lista ordinata di N interi casuali da 0 a 100.
.Scrivere una seconda funzione che accetti una lista e restituisca una nuova lista composta dagli elementi della prima
lista seguiti dagli stessi elementi disposti in ordine inverso.
.Scrivere una terza funzione che accetti una lista ed un booleano: se il booleano è true stampa i valori in posizioni
pari, altrimenti stampa i valori in posizioni dispari.
.Creare una main che utilizzi le tre funzioni. Utilizzare l'interfaccia List e l'implementazione ArrayList.

 */
public class Esercizio2 {
    public static void main(String[] args) {


        System.out.println(funzione1(5));

        System.out.println(funzione2(funzione1(5)));
        System.out.println(funzione3());


    }

    // prima
    public static ArrayList<Integer> funzione1 (int n) {
        ArrayList<Integer> listaDiNumeriRandom = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int max=100,min=0;
            listaDiNumeriRandom.add(random.nextInt(max - min+1) + min);
        }

        return listaDiNumeriRandom;
    }
    //seconda
    public static ArrayList<Integer> funzione2(ArrayList<Integer> lista ) {
        ArrayList<Integer> listaDueReverse = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            listaDueReverse.add(lista.get(i));
        }
        return listaDueReverse;
    }

    //terza
    public static void funzione3(ArrayList<Integer> lista, boolean ciao){
        if(ciao){
            for (int i = 1; i <= 20; i++) if (i % 2 == 0) System.out.println(i);
        }
    }

}
