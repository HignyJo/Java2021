package be.technifutur.menu.actions;

public class Calcule {
    public static void run(){

        int a,b,c,d,e = 0;

        // calcule 1
        a = 150;
        b = 92;
        System.out.println(a +" - "+ b +" = "+ (a-b));

        // calcule 2
        a = 89;
        b = 18;
        c = 25;
        d = 2;
        e = 13;
        System.out.print("("+ a +" - "+ b +") + ("+ c +" * "+ d +" ) - "+ e +" = ");
        System.out.println((a-b)+(c*d)-e);

        // calcule 3
        a = 15;
        b = 3;
        c = 2;
        System.out.println((a*b)/c);

        System.out.println(a/(c*b));

        System.out.println((a+b)/c);

        System.out.println((a/c)+b);


    }
}
