package org.example;
import java.util.List;
import static java.lang.IO.println;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Criptare");
        System.out.println("2. Decriptare");
        System.out.print("Scegli un'opzione: ");

        if (!input.hasNextInt()) {
            System.out.println("Errore: devi inserire un numero.");
            input.close();
            return;
        }

        int scelta = input.nextInt();
        input.nextLine();

        if (scelta != 1 && scelta != 2) {
            System.out.println("Errore: scelta non valida.");
            input.close();
            return;
        }

        System.out.print("Inserisci la parola chiave: ");
        String chiave = input.nextLine();

        if (chiave.isEmpty()) {
            System.out.println("Errore: la parola chiave non può essere vuota.");
            input.close();
            return;
        }

        System.out.print("Inserisci il testo: ");
        String testo = input.nextLine();

        if (testo.isEmpty()) {
            System.out.println("Errore: il testo non può essere vuoto.");
            input.close();
            return;
        }

        Vigenere v = new Vigenere(chiave);

        if (scelta == 1) {
            System.out.println("Testo criptato: " + v.Encrypt(testo));
        }

        if (scelta == 2) {
            System.out.println("Testo decriptato: " + v.Decrypt(testo));
        }

        input.close();
    }
}

