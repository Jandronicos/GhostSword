/**
 * Author: Joshua Barlin
 * Purpose: Register game art, music and other stuff.
 */
package com.enhalion.industries.engine;

public class GameRegistry {
	
	public static String[] Music = new String[1000];
	public static String[] LvArt = new String[100000];
	public static String[] GenArt = new String[100000];

	public static int[] MusicLv = new int[1000];
	public static int[] LvArtLv = new int[100000];
	
	public static String[] LvArtType = new String[100000];
	public static String[] GenArtType = new String[100000];
	
	public static int musicAmount = 0;
	public static int LvArtAmount = 0;
	public static int GenArtAmount = 0;
	
	public static void addMusic(String Audioname, int LV){
		if (musicAmount == 1000){
			return;
		}
		Music[musicAmount] = Audioname;
		MusicLv[musicAmount] = LV;
		musicAmount ++;
	}
	public static void addLvArt(String ArtName, int LV, String Type){
		if (LvArtAmount == 100000){
			return;
		}
		LvArt[LvArtAmount] = "/com/enhalion/industries/ghostsword/res/png/" + ArtName;
		LvArtLv[LvArtAmount] = LV;
		LvArtType[LvArtAmount] = Type;
		LvArtAmount ++;
	}
	public static void addGenArt(String ArtName, String Type){
		if (LvArtAmount == 100000){
			return;
		}
		GenArt[GenArtAmount] = "/com/enhalion/industries/ghostsword/res/png/" + ArtName;
		GenArtType[GenArtAmount] = Type;
		GenArtAmount ++;
	}
	
}
