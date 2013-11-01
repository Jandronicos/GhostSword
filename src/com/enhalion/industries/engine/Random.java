/**
 * Author: Joshua Barlin
 * Purpose: Serve as a Random Number Generator
 */
package com.enhalion.industries.engine;

public class Random {

	public static int random(int min, int max) {
		int randnum = (min + (int)(Math.random() * ((max - min) + 1)));
		System.out.println("Random number between " + min + " and " + max + " was " + randnum);
		return randnum;
	}

}
