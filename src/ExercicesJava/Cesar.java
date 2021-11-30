package ExercicesJava;

import java.util.Scanner;

public class Cesar {
/*
    private static final int TAILLE_ALPHABET = 26;
    private String texte;
 
    public Cesar(String texte) {
        this.texte = texte;
    }
 
    public String chiffre(int decalage) {
        StringBuilder sb = new StringBuilder(texte.length());
        for (char c : texte.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(decaleVar(c, decalage, 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append(decaleVar(c, decalage, 'A'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
 
    public String dechiffre(int decalage) {
        return chiffre(-decalage);
    }
 
    private static char decaleVar(char caractere, int decalage, char caractereBase) {
        int base = caractereBase;
        if (decalage < 0) {
            base += TAILLE_ALPHABET - 1;
        }
        return (char) (((caractere) - base + decalage) % TAILLE_ALPHABET + base);
    }
 
    public static void main(String[] args) {
        Cesar cesar = new Cesar(args[0]);
        String texteChiffre = null;
        for (int i = 0; i < TAILLE_ALPHABET; i++) {
            texteChiffre = cesar.chiffre(i);
            System.out.println(args[0] + " --Chiffre[" + i + "]--> "
                    + texteChiffre + " --Dechiffre[" + i + "]--> "
                    + new Cesar(texteChiffre).dechiffre(i));
        }
    }*/

    public static void main(String[] args) {

        String texte = "";
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] decalage = new char[] {'x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w'};

//----- Saisie Texte -----
        System.out.print("Saisissez une suite de caractère: ");
        Scanner sc = new Scanner(System.in);
        texte = sc.nextLine();
        System.out.println();

//----- Si le texte est en majusucle, le mettre en minuscule + Transformer le String en tableau de char -----
        texte = texte.toLowerCase();
        System.out.println(texte);
        char[] charArray = texte.toCharArray();

//----- Décalage des lettres par clé de 3 + affichage du texte via une boucle -----
        for (int i = 0; i < texte.length(); i++){
            for (int j = 0; j < alphabet.length ;j++){
                if (charArray[i] == alphabet[j]) {
                    charArray[i] = decalage[j];
                }
            }
            System.out.print(charArray[i]);
        }

    }
}
