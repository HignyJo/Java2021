package ExercicesJava;

import java.util.Scanner;

public class testTC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] tab = new int[10][10];
        int i, j = 0;
        int ligne, colonne = 0;
        int cpt = 0;

        // ----- Initialisation tableau -----
        for ( i = 0; i < 10; i++){
            for ( j = 0; j <10; j++) {
                tab[i][j] = 0;
            }
        }

        while (cpt < 10) {

            // ----- affichage tableau -----
        System.out.println("     A    B    C    D    E    F    G    H    I    J");
        System.out.println("-----------------------------------------------------");
        for ( i = 0; i < 10; i++){
            System.out.print(i +". ");
            for ( j =0; j <10; j++) {
                System.out.print("| " + tab[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------");
            System.out.print("Entrez une valeur de ligne (0.A 1.B 2.C ...) 0 à 9 : ");
            ligne = sc.nextInt();

            System.out.print("Entrez une valeur de ligne 0 à 9 : ");
            colonne = sc.nextInt();

            if (tab[ligne][colonne] == 0){
                tab[ligne][colonne] = 8;
                System.out.println("Touché !");
            } else if ( tab[ligne][colonne] == 8) {
                System.out.println("Zone déjà touchée !");
            }
            cpt++;
        }




    }
}
