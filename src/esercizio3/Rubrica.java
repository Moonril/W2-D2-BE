package esercizio3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, String> rubrica;

    public Rubrica(){
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String numero){
        rubrica.put(nome, numero);
    }

    public void rimuoviContatto(String nome){
        rubrica.remove(nome); // cancella la coppia chiave - valore

    }

    public String cercaContatto(String numero){
        Set<String> nomi = rubrica.keySet();

        for (String nome : nomi) {
            if(rubrica.get(nome).equals(numero)){
                return nome;
            }
        }
        return null;
    }

    public String cercaContattoPerNome(String nome){
        return rubrica.get(nome);
    }

    public void stampaContatti(){
        System.out.println(rubrica);
    }
}
