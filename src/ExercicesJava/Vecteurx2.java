package ExercicesJava;

public class Vecteurx2 {
    public static void main(String[] args){
    
        int val = 1; //------------------------------------------------------------------------------- Création variable + initialisation

        int[] tab = new int[16]; //------------------------------------------------------------------- Création tableau de 16 éléments

        for (int i = 0; i < 16; i++){tab[i] = val; val = val*2; System.out.print(" | "+ tab[i]);} //-- Initialisation tableau + affichage

    //  for (int j = 0; j < 16; j++){System.out.print(" | "+ tab[j]);} //----------------------------- Affichage tableau
        System.out.println(" |");

    }
    
}
