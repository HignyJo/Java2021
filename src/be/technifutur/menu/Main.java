package be.technifutur.menu;

import be.technifutur.menu.actions.*;
//import be.technifutur.menu.actions.Helloworld;

public class Main {
	
	public static void main(String[] args){
	
		Helloworld ex = new Helloworld();
		Thread t1 = new Thread(ex);
		t1.start();
		System.out.println("Hi");

	}
}