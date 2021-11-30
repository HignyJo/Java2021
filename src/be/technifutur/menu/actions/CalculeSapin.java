package be.technifutur.menu.actions;

public class CalculeSapin {
    public static int hauteur;

    public static void run() {

        String niveau = "#";
        int i = 0;
        String decalage = "                                                                                                                                                                                                              ";
        String res = "";

        // ----- création sapin -----
        res = decalage.substring(1, hauteur);
        System.out.println(res + niveau);
        for (i = 1; i < hauteur; i++){
            res = decalage.substring(1, hauteur-i);
            niveau ="#" + niveau + "#";
            System.out.println(res + niveau);
        }


        // ----- création tronc -----

        if (hauteur <= 5){
            res = decalage.substring(1, hauteur-1);
            for (i = 1; i < 2; i++){
                System.out.println(res + "|||");
            }
        } else if (hauteur > 5 && hauteur <= 10){
            res = decalage.substring(1, hauteur-2);
            for (i = 1; i < 4; i++){
                System.out.println(res + "|||||");
            }
        } else if (hauteur > 10 && hauteur <= 20){
            res = decalage.substring(1, hauteur-3);
            for (i = 1; i < 5; i++){
                System.out.println(res + "|||||||");
            }
        } else if (hauteur > 20) {
            res = decalage.substring(1, hauteur-4);
            for (i = 1; i < 6; i++){
                System.out.println(res + "|||||||||");
            }
        }

    }
}
