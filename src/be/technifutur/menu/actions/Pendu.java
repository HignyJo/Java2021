package be.technifutur.menu.actions;

3 import java.util.Arrays;

public class Pendu {
    public static void run() {
        // Déclaration du tableau de mots
        String[] words = {"pomme", "poire", "ananas", "pastèque", "melon", "kiwi"};
        
        // Initialisation de la classe random pour générer un chiffre aléatoire,
        // utilisation du package java.util.random
        Random rand = new Random();
        
        // Booléen permettant faire tourner le jeu
        boolean shouldContinue = true;
        boolean gameContinue = true;
        
        // Lancement du jeu
        while(shouldContinue == true) {
        
            // On tire un chiffre au hazard entre 1 et le nombre d'occurence du tableau
            String word = words[rand.nextInt(words.length)];
        
            // On découpe le mot sélectionné dans un tableau de char
            char[] wordChar = word.toCharArray();
            char[] inputChar = new char[wordChar.length];
        
            Arrays.fill(inputChar, '_');
        
        
            char input;
        
            // On affiche autant de "_" que le nombre de lettre du mot sélectionné
            for(int i=0; i < inputChar.length; i++){
                System.out.print(inputChar[i]);
            }

            System.out.println("");
        
            gameContinue = true;
            boolean found;
            int countError = 7;
            
            // Le jeu
            while(gameContinue == true) {
                // Lecture du charactère
                System.out.print("Veuillez introduire une lettre : ");
                input = (new Scanner(System.in)).nextLine().charAt(0);
                System.out.println("");
                
                // On parcours l'ensemble du tableau de charactère de notre mot choisi découpé
                found = false;
                for(int i=0; i < wordChar.length; i++) {
            
                    // Si la charactère encodé correspond à au moins un des éléments du tableau, on l'ajoute dans le tableau de l'utilisateur et on signale qu'il y a eu au moins un corespondance
                    if( input == wordChar[i]) {
                    inputChar[i] = input;

                    found = true;
                    }
                }
        
            // Gestion de l'erreur
            if( found == false ) {
            countError‐‐;
            System.out.println("Pas de chance, il vous reste " + countError + " chances !");
            
            switch (countError) {
            case 7 :
            System.out.println ("____________");
            System.out.println ("|//");
            System.out.println ("|/");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
                
            case 6 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
        
            case 5 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/       (x‐x)");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
        
            case 4 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/       (x‐x)");
            System.out.println ("|          |");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
        
            case 3 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/       (x‐x)");
            System.out.println ("|      /|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
        
            case 2 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/       (x‐x)");
            System.out.println ("|      /|\\");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
        
            case 1 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/       (x‐x)");
            System.out.println ("|         /|\\");
            System.out.println ("|         /");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
        
            case 0 :
            System.out.println ("____________");
            System.out.println ("|//        |");
            System.out.println ("|/       (x‐x)");
            System.out.println ("|      /|\\");
            System.out.println ("|         / \\");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            System.out.println ("|");
            break;
            }
        
            }
        
            // Affichage du mot contenant les lettres déjà trouvée et les _
            System.out.println(inputChar);
        
        
            // si il n'y a plus de chance alors la partie s'arrête
            if( countError == 0 ) {
            System.out.println("Game Over");
            gameContinue = false;
            }
        
            // Si il n'y a plus de _ dans le tableau de l'utilisateur alors c'est que le mot est trouvé

            boolean check = true;
            for( int i=0; i<inputChar.length; i++) {
                if( inputChar[i] == '_') {
                    check = false;
                }
            }
        
            if( check == true) {
                System.out.println("Bien joué, vous avez deviné le mot :‐)");
                gameContinue = false;
            }
        }
        
        // nouvelle partie ?
        System.out.println("Nouvelle partie? : (y/N)");
        input = (new Scanner(System.in)).nextLine().charAt(0);
        // Si l'utilisateur encode y alors on relance la partie
        if(input == 'y') {
            shouldContinue = true;
        } else {
            shouldContinue = false;
        }

    
    
    }    
}
