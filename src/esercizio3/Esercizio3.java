package esercizio3;
/*
Esercizio #3
Scrivere una classe Java che permetta di gestire una rubrica  telefonica. La lista dei contatti è realizzata mediante
una HashMap in cui le chiavi sono i nomi delle persone e i valori sono i numeri di telefono. Realizzare i metodi per:
1. L’inserimento di una coppia <Nome, telefono>
2. La cancellazione di una coppia <Nome, telefono> a partire dal nome
3. La ricerca di una Persona di cui si conosce il numero di telefono
4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome
5. La stampa di tutti i contatti con nome e numero.

 */
public class Esercizio3 {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.inserisciContatto("Mario Rossi", "326423534");
        rubrica.inserisciContatto("Giulio Rossi", "43563433");
        rubrica.inserisciContatto("Giulia Rossi", "345345345");
        rubrica.inserisciContatto("Carlo Rossi", "3264275467");


        System.out.println(rubrica.cercaContattoPerNome("Mario Rossi"));

        System.out.println(rubrica.cercaContatto("43563433"));

        rubrica.rimuoviContatto("Giulio Rossi");



    }
}
