package esercizio1;

/*
Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti il numero di elementi da inserire e poi gli chieda di inserire N parole. Il programma dovrà:
– stampare tutte le parole duplicate
– stampare il numero di parole distinte
– stampare l'elenco delle parole distinte
Utilizzare l'interfaccia Set e l'implementazione HashSet

 */

import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("quanti elementi vuoi inserire?");
        int numeroElementiScelti = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci elementi");


        for (int i = 0; i < numeroElementiScelti; i++) {
            String elementiScelti = scanner.nextLine();
            lista.add(elementiScelti);
        }

        System.out.println("finito");
        System.out.println(lista);

        System.out.println("Elenco delle parole distinte:");
        for (String parola : lista) {
            System.out.println(parola);
        }

    }
}
