package ExercicesJava;

public class MinMax2Dim {
    public static void main(String[] args){
    
        int minL, maxL, maxC, minC = 0;
        int ind = 0;
        int i, j = 0;
        int sommeL = 0;
        int sommeC = 0;
        int moyenneL = 0;
        int moyenneC = 0;

        int[][] tab = new int[10][10]; // ----- Création tableau


        // ----- Initialisation tableau -----
        for ( i = 0; i < 10; i++){
            for ( j =0; j <10; j++) {
                tab[i][j] = 10 + (int)(Math.random() * 89);
            }
        }
        // ----- affichage tableau -----
        System.out.println("     0.    1.    2.    3.    4.    5.    6.    7.    8.    9.");
        System.out.println("---------------------------------------------------------------");
        for ( i = 0; i < 10; i++){
            System.out.print(i +". ");
            for ( j =0; j <10; j++) {
                System.out.print("| " + tab[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");

        // ----- Initialisation min et max
        minL = minC = 100;
        maxL = maxC = 0;


         // ----- Minimum, Maximum, Somme et moyenne par Ligne et par Colonne -----
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("| Valeurs MINIMUM, MAXIMUM, SOMME et MOYENNE par LIGNE et COLONNE |");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        for (j = 0; j < 10; j++){
            for (i = 0; i < 10; i++) {
                sommeC = sommeC + tab[i][j];        //-------]Colonne
                moyenneC = sommeC / 10;             //-------]
                if (tab[i][j] < minC) {             //-------]
                    minC = tab[i][j];               //-------]
                } else if (tab[i][j] > maxC) {      //-------]
                    maxC = tab[i][j];               //-------]
                }                                   //-------]
                sommeL = sommeL + tab[j][i];        //-------]Ligne
                moyenneL = sommeL / 10;             //-------]
                if (tab[j][i] < minL) {             //-------]
                    minL = tab[j][i];               //-------]
                } else if (tab[j][i] > maxL) {      //-------]
                    maxL = tab[j][i];               //-------]
                }
            }
            System.out.println("| Ligne   " + ind + " | min = " + minL + " | max = " + maxL + " | somme = " + sommeL + " | moyenne = " + moyenneL + " |");
            System.out.println("| Colonne " + ind + " | min = " + minC + " | max = " + maxC + " | somme = " + sommeC + " | moyenne = " + moyenneC + " |");
            minL = 100;
            minC = 100;
            maxL = 0;
            maxC = 0;
            sommeL = 0;
            sommeC = 0;
            moyenneL = 0;
            moyenneC = 0;
            ind ++;
        }

    }
}
