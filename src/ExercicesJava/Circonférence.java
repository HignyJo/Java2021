package ExercicesJava;

import java.util.Scanner;

public class Circonférence {
    public static void main(String[] args){

        int rayon = 0;
    
        System.out.print("Entrez le rayon du cercle: ");
        Scanner sc = new Scanner(System.in);
        rayon = sc.nextInt();

        System.out.println("La circonférence est de : "+ (2*Math.PI*rayon));

    }
}
