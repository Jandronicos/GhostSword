/**
 * Author: Joshua Barlin
 * Purpose: Run the game. Everything off shoots from this.
 */
package com.enhalion.industries.ghostsword;

import javax.swing.JOptionPane;

import com.enhalion.industries.engine.EngineDefine;
import com.enhalion.industries.engine.MusicManager;
import com.enhalion.industries.engine.Player;

public class Main {
	public static void main(String[]args)  
	{ 
		Thread gameinit = new Thread(new Runnable() {
			public void run(){
				GhostSwordDefine.init();
			}
		});
		Thread engineinit = new Thread(new Runnable() {
			public void run(){
				MusicManager.init();
				EngineDefine.ExecDefine();
			}
		});
		engineinit.start();
		gameinit.start();
		try {
			engineinit.join();
		} catch (InterruptedException e) {
			System.out.println("Something Stopped engine init");
			System.exit(1);
		}
		try {
			gameinit.join();
		} catch (InterruptedException e) {
			System.out.println("Something Stopped game init");
			System.exit(1);
		}
		Player.setname();
		JOptionPane.showMessageDialog(null, "Your name is: " + Player.playername);
		Player.setDefaults();
		JOptionPane.showMessageDialog(null, "Your attack is: " + Player.attack + "\n Your defence is: " + Player.defence + "\n Your speed is: " + Player.speed + "\n Your HP is: " + Player.nowhp + "/" + Player.maxhp);
		int i = 0;
		for (i = 0; i < 10; i++) {
			Player.dealDamage(2);
			JOptionPane.showMessageDialog(null, "You got hit by an enemy whose attack is 2." + "\n" + "Your HP is now " + Player.nowhp + "/" + Player.maxhp);
		}
		JOptionPane.showMessageDialog(null, "Your name is: " + Player.playername);
		MusicManager.midiplay("EndGame.mid");
		JOptionPane.showMessageDialog(null, "You should hear some music now...");
		MusicManager.stopmidi();
		MusicManager.midiplay("EndGameCredits.mid");
		JOptionPane.showMessageDialog(null, "You should hear some music now...");
		MusicManager.stopmidi();
		JOptionPane.showMessageDialog(null, "You are about to be hit with a really strong move. You should now faint.");
		System.exit(0);
	}

}
