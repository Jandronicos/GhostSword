package com.enhalion.industries.ghostsword;

import com.enhalion.industries.engine.GameRegistry;

public class RegResources {
	
	public static void main(){
		regmidi();
		reglvart();
		regart();
	}
	static void regmidi(){
		/*
		 * Added by musician (When decided)
		 * 
		 * N.B. Menu is Lv 0, EndGame = 255
		 * GameRegistry.addMusic("midifile", lv)
		 */
		GameRegistry.addMusic("EndGameCredits.mid", 255);
		
	}
	static void reglvart(){
		/*
		 * Virtually everything here will have been added by the in-house artist.
		 * However, the underlying function was written by programmers
		 * 
		 * Vaild Types:
		 * 		BKGRND  -Background
		 * 		GRND	-Ground
		 * 		ROOF	-Roof
		 * 		ITMS	-Items (Such as rocks, spikes etc that are level specific)
		 * 
		 *		N.B. Menu is Lv 0, EndGame = 255
		 *		
		 * GameRegistry.AddLvArt("png/artname.png", level, TYPE);
		 */
	}
	static void regart(){
		/*
		 * Again, added by in-house artist
		 * This is for generic artworks, such as Logo's etc
		 * 
		 * Valid Types:
		 *		LOGO - Logos
		 * 		ITM - Item Logos
		 *		SFX - Special Effects Stuff
		 *		LQD - Liquids, such as lava, water etc.
		 *		SMV - Special Movement animation (Raining fire etc.)
		 *		MSC - Misc. Stuffs
		 *
		 * GameRegistry.addGenArt("png/artname.png", TYPE)
		 */
	}
}
