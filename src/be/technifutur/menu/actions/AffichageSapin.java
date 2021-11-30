package be.technifutur.menu.actions;
import java.util.Scanner;

public class AffichageSapin {
    public static void run() {

        System.out.println("Dessinons un sapin de noel !");
        System.out.println("Choisissez une hauteur pour le sapin : ");
        Scanner sc = new Scanner(System.in);
        CalculeSapin.hauteur = sc.nextInt();

        new CalculeSapin();
        CalculeSapin.run();
    

    }
}