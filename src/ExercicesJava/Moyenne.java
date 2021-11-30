package ExercicesJava;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args){
        int somme = 0;
        int nb = 0;
        int cpt = 0;

        while (cpt < 3) {
            System.out.println("Entrez 3 nombres -> nb" + (cpt+1) +" :");
            Scanner sc = new Scanner(System.in);
            nb = sc.nextInt();
            somme = somme + nb;
            cpt++;
        }   

        System.out.println("La moyenne est de : " + somme +"/"+ cpt +"="+ (somme/cpt));

    }
}