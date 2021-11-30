package ExercicesJava;

import java.util.Arrays;

public class Moyenne2Dim {
    public static void main(String[] args){

        int val = 0;
        // int aleat = (int)(Math.random()*101);
        int[] tab = new int[10];
        boolean[] bool = new boolean[10];
        int i = 0;

        //----- Initialisation du tableau de booléen -----
        System.out.println("\nTableau de booléen : ");
        for (i = 0; i < bool.length; i++) {
            bool [i] = false;
            System.out.print(bool[i] + " | ");
        }

        //----- Initialisation du tableau de int + affichage de celui ci----
        System.out.println("\nTableau de base : ");
        for (i = 0; i < tab.length; i++) {
            tab [i] = (int)(Math.random()*101);
            System.out.print(tab[i] + " | ");
        }

        // ----- Tri tableau + affichage de celui-ci-----
        tab = Arrays.stream(tab).sorted().toArray();
		System.out.println("\nTri effectué : ");
		for (i = 0; i < 10; i++) {
			System.out.print(tab[i] + " | ");
        }

    }
}