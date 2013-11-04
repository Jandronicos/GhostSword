/**
 * Author: Joshua Barlin
 * Purpose: Save the game. Possibly (?) Load it too.
 */
package com.enhalion.industries.ghostsword;

public class SaveGame {
		public static void savegame(){
			/*
			 * 
			 * The save file will be 256 characters long
			 * However, the last 128 will mirror the first 128
			 * 		(as in, 127=128,126-129,125=130 etc.)
			 * 
			 * Ranges:	0-11 = Player Name (ASCII)
			 * 		  	12-15 = RandomNum(12,22)
			 * 			16-20 = Expansion (default  = 99)
			 * 			21 = Player Name (1st Letter)
			 * 			22 = Sword Equipped (01 - Number of swords as 2 digits)
			 * 			23 = Lv At
			 * 			24 - 26 = Player Name (4,3,2 Letters)
			 * 			27-31 = Expansion (rev Order)
			 * 			32 = Player Name (7th character)
			 * 			33 = Sword Equipped
			 * 			34 = Location (Savepoints?)
			 * 			35-41 = Player name (5,6,12,11,10,8,9)
			 * 			42 = Lv At
			 * 			43 = Speed
			 * 			44 = Attack
			 * 			45 = Speed
			 * 			46 = Defence (Armour set)
			 * 			47 - 50 = Expansion (More. Def = 00)
			 * 			51-54 = Expansion (More, reverse)
			 * 			55 = Defence
			 * 			56 - 57 = Attack Speed
			 * 			58 = Max HP
			 * 			59 = Now HP
			 * 			60 = Max HP
			 * 			61 = RandNum(50,98)
			 * 			62 = Now HP
			 * 			63 - 67 = RandNum(00,87)
			 * 			68 = Game Maj Num
			 * 			69 = Engine Maj Num
			 * 			70 = Game Min Num
			 * 			71 = Engine Min Num
			 * 			72 = Default Attack
			 * 			73 = (65)
			 * 			74 = 65
			 * 			75 = Engine Maj Num
			 * 			76 - 81 = Expansion (Even More, def = 84)
			 * 			82 = Game Maj Num + 17
			 * 			83 - 88 = Expansion (Even More, reverse, - 1)
			 * 			89  = Game Min Num - 3
			 * 			90 = Engine Min Num
			 * 			91 = Default Attack
			 * 			92 = Level At + 2
			 * 			93 = Where at (Savepoints?)
			 * 			94 = RandNum(00,99)
			 * 			95 = 95
			 * 			96 = (94)
			 * 			97 - 100 = (61) - (64)
			 * 			101 = 101
			 * 			102 = Expansion (MORE, def = (89))
			 * 			103 = Expansion (MORE)
			 * 			104 - 114 = RandNum(00,99)
			 * 			115 = TimeHr
			 * 			116 = TimeMin
			 * 			117 = TimeSec
			 * 			118 = Day
			 * 			119 = Month
			 * 			120 = Yr
			 * 			121 - 125 = (115) - (119)
			 * 			126 - 127 = 76, 81		
			 * 
			 */
			
		}
}
