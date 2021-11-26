package com.game;

public class Main {
	
	  public static void main(String[] args) {
	        Player1 player = new Player1("Rohit","AK47",100);
//	        System.out.println(player.getName());
//	        System.out.println(player.getHealth());
//	        System.out.println(player.getWeapon());

	        player.damageByGun1();
	        player.damageByGun1();
	        player.damageByGun2();
	        player.heal();

	        Player2 player2 = new Player2("Rohan","M416",100,true);
	        player2.damageByGun1();
	        player2.damageByGun2();
	        
	        player2.heal();
	        
	    }

}
