/**
 * Author: Joshua Barlin
 * Purpose: Define the game
 */
package com.enhalion.industries.ghostsword;

import com.enhalion.industries.engine.MusicManager;

public class GhostSwordDefine{
	public static int buildnum = 9;
	static String vernum = "0." + buildnum + " InDev";
	static String vername = "Malta";
	public static String buildname = "GhostSword v" + vernum + " " + vername;
	
	public static void ExecDefine(){
		System.out.println(buildname);
	}
	public static void init() {
		ExecDefine();
		RegResources.main();
		
	}
}
