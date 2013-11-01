/**
 * Author: Joshua Barlin
 * Purpose: Define the game engine
 */

package com.enhalion.industries.engine;

import com.enhalion.industries.engine.MusicManager;

public class EngineDefine {
	public static int buildnum = 11;
	static String vernum = "0." + buildnum + " InDev";
	static String vername = "Valestrom";
	public static String buildname = "Engine v" + vernum + " " + vername;
	public static void ExecDefine(){
		System.out.println(buildname);
	}
}
