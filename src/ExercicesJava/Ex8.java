package ExercicesJava;

import java.util.Scanner;

// Inserer une phrase et remplacer les ' '  par des |.

public class Ex8  {
    public static void main(String[] args){
        
        String texte = "";


        // ----- Création du texte -----
        System.out.println("Saisissez un texte : ");
        Scanner sc = new Scanner(System.in);
        texte = sc.nextLine();

        // ------ Affichage texte de base -----
        System.out.println("Votre texte : " + texte);

        // ----- Modification du texte + affichage-----
        texte = texte.replace(" ", "|");
        System.out.println("Votre texte modifié : " + texte); 

    }
    
}
