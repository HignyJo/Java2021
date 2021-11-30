package ExercicesJava;

import java.util.Scanner;

public class DecouValeur {
    public static void main(String[] args){

        int val = 0;
        int aleat  = (int)(Math.random()*101);

        System.out.println("Une valeur entre 0 et 100 a été choisie aléatoirement par le programme. Essayez de la découvrir !");

        do {
            System.out.println("Valeur cherchée : "+ aleat);

            System.out.println("Entrez une valeur : ");
            Scanner sc = new Scanner(System.in);
            sc.close();
            val = sc.nextInt();


            if (val < aleat){
                System.out.println("La valeur recherchée est plus grande !");
            } else if (val > aleat) {
                System.out.println("La valeur recherchée est plus petite !");
            } else {
                System.out.println("Vous avez trouvé la valeur recherchée !");
            };

        } while (val != aleat);
    }
}


/*        Debut decouverteValeur
            VARIABLES LOCALES :
                VAR valeurAleatoire	:N <- aleatoire(100)
                VAR valeurSaisie 	:N <- 0
            FIN VARIABLES LOCALES

            Afficher "Découverte d'une valeur"
            Afficher "Une valeur entre 0 et 100 a été choisie aléatoirement par le programme. Essayez de la découvrir !"
            
            REPETER
                Afficher "Votre nombre : "
                Saisir valeurSaisie
                
                SI valeurSaisie < valeurAleatoire
                    ALORS
                        Afficher "La valeur recherchée est plus grande !"
                    SINON
                        SI valeurSaisie > valeurAleatoire
                            ALORS
                                Afficher "La valeur recherchée est plus petite !"
                            SINON
                                Afficher "Félicitations ! La valeur aléatoire était ", valeurAleatoire, " !"
                        FINSI
                FINSI        
            JUSQU'A CE QUE valeurSaisie = valeurAleatoire
        Fin decouverteValeur
*/