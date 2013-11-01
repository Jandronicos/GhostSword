/**
 * Author: Joshua Barlin
 * Purpose: Serve as entity management of the player.
 */
package com.enhalion.industries.engine;

import javax.swing.JOptionPane;

public class Player implements Runnable{
	public static String playername;
	public static int maxhp;
	public static int nowhp;
	public static int defence;
	public static int attack;
	public static int speed;
	public static int attk_spd;
	
	static final int def_def = 0;
	static final int def_hp = 12;
	static final int def_att = 4;
	static final int def_spe = 1;
	static final int def_attkspd = 1;
	
	public static void setname(){
		playername=JOptionPane.showInputDialog(null,"What is your name ?");
		if (playername.trim() != ""){
			playername = playername.trim();
		}else{
			playername = "DEBUG";
		}
		System.out.println("Setting Player Name to " + playername);
	}
	public static void setDefaults() {
		System.out.println("Now setting default stat values");
		maxhp = def_hp;
		nowhp = maxhp;
		defence = def_def;
		attack = def_att;
		speed = def_spe;
		attk_spd = def_attkspd;
	}
	public static void dealDamage(int EnemyAttack){
		int previoushp = nowhp;
		nowhp = (int) (nowhp - (EnemyAttack-defence));
		System.out.println("Inflicting user with " + (previoushp - nowhp) + " damage. From " + previoushp + " To " + nowhp + " derived from " + EnemyAttack + " and " + defence);
		if (nowhp <= 0){
			System.out.println("User has below or at 0 hp. Calling collapse.");
			//nowhp = 12;
			collapse();
		}
	}
	@Override
	public void run() {
		setDefaults();
	}
	public static void collapse(){
		System.out.println("User dead. Reviving at begining of level");
		JOptionPane.showMessageDialog(null, "The player fainted! You shall be taken to the begining of the level");
		nowhp = 12;
		//System.exit(0);
	}
}
