public class MinMaxVecteur {
    public static void main(String[] args){
    
        int min, max, ind = 0;//--------------------------------------------------------------------- Création variables + initialisation
        int posMin = 0;
        int posMax = 0;

        // int[] tab = new int[] (5, 6, 8, 9, 7, 3, 1, 2, 4, 0);
        int[] tab = new int[10]; //------------------------------------------------------------------ Création tableau

        for (int i = 0; i < 10; i++){tab[i] =(int)(Math.random()*51);} //---------------------------- Initialisation tableau
        for (int j = 0; j < 10; j++){System.out.print(" | "+ tab[j]);}  //--------------------------- Affichage tableau
        System.out.println(" |");


        min = tab[0];//------------------------------------------------------------------------------ Initialisation du minimum à la valeur de l'indice 0 du tableau
        max = tab[0];//------------------------------------------------------------------------------ Initialisation du maximum à la valeur de l'indice 0 du tableau

        for (ind = 0; ind < 10; ind++) {//----------------------------------------------------------- Boucle qui parcoure le tableau
            if (tab[ind] < min) {//------------------------------------------------------------------ Comparaison avec la valeur de min
                min = tab[ind];
                posMin = ind;
            } else if (tab[ind] > max) {//----------------------------------------------------------- Comparaison avec la valeur de max
                max = tab[ind];
                posMax = ind;
            }
        }

        System.out.println("Le min est : "+ min +" et sa position est : "+ posMin);//----------------- Affichage résultat
        System.out.println("Le max est : "+ max +" et sa position est : "+ posMax);

    }
    
}
