package be.technifutur.menu.actions;

public class Permu {
    public static void run() {
        int x = 3;
        int y = 5;
        int z = 1;
        int itm = 0;

        System.out.println(x +" "+ y +" "+ z);

        itm = x;
        x = y;
        y = z;
        z = itm;

        System.out.println(x +" "+ y +" "+ z);
    }
    
}
