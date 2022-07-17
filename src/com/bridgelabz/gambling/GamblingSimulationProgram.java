package com.bridgelabz.gambling;

import java.util.Random;

public class GamblingSimulationProgram {

	public static int initial_Stake = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to the Gambling Simulation Program");

		int playCount = 0;
		Random random = new Random();

		while (initial_Stake != 0 && initial_Stake != 200) {
			playCount++;
			System.out.println("initial money " + initial_Stake);
			int bet = random.nextInt(2);
			if (bet == 1) {
				initial_Stake++;
			} else {
				initial_Stake--;
			}
			System.out.println("Remaining money " + initial_Stake);
		}
	}
}