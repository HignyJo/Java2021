package be.technifutur.menu.actions;

import java.util.Scanner;

public class Choix {
    public static void run() {
        int choix = 0;
        int repeat = 1;
        
        while(repeat != 0){
            System.out.println("Choisissez un exercice :");
            System.out.println("1. Sapin");
            System.out.println("2. Liste de Calcules");
            System.out.println("3. Hello World");
            System.out.println("4. Le Min, Max, Somme, Moyenne d'un tableau");
            System.out.println("5. La permutation de nombres");
            System.out.println("0. Pour arrêter");
            System.out.print("\nVotre choix : ");
            

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            System.out.println();

            switch (choix) {
                case 0:{break;}
                case 1:{
                    new AffichageSapin();
                    AffichageSapin.run();
                    break;
                }
                case 2:{
                    new Calcule();
                    Calcule.run();
                    break;
                }
                case 3:{
                    new Helloworld();
                    Helloworld.run();
                    break;
                }
                case 4:{
                    new MinMax();
                    MinMax.run();
                    break;
                }
                case 5:{
                    new Permu();
                    Permu.run();
                    break;
                }
                default:{
                    System.out.println("Erreur !");
                    break;
                }
		    }

            if(choix == 0) {
               repeat = 0;
            } else {
                System.out.println("Voulez vous refaire un choix ? (Oui=1 et Non=0) : ");
                repeat = sc.nextInt();
            }
        }

        System.out.println("Au revoir !!");
        
    }
}
