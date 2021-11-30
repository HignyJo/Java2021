package ExercicesJava;

import java.util.Scanner;

public class NombreLettre {
    public static void main(String[] args) {

        String texte = "";
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int cpt = 0;

//----- Saisie Texte -----
        System.out.print("Saisissez une suite de caractère: ");
        Scanner sc = new Scanner(System.in);
        texte = sc.nextLine();
        System.out.println();

//----- Si le texte est en majusucle, le mettre en minuscule + Transformer le String en tableau de char -----
        texte = texte.toLowerCase();
        System.out.println(texte);
        char[] charArray = texte.toCharArray();

//----- Comptage lettre -----                                       A modifier /!\
        for (int i = 0; i < texte.length(); i++){
            for (int j = 0; j < alphabet.length ;j++){
                if (charArray[i] == alphabet[j]) {
                    cpt = cpt++;
                }
            }
            System.out.print(charArray[i]);
        }

    }
}
