package model;

public class Game {
	int[] rolls;
	int currentThrow;
	
	/**
	 * Constructor for the Game instance
	 */
	public Game() {
		this.rolls = new int[21];
	}

	/**
	 * Method to add pins to the current throw
	 * @param pins to be added to the current throw
	 */
	public void add(int pins) {
		rolls[currentThrow++] = pins;
	}
	
	/**
	 * Method to return the current throw
	 * @return the score of the throw
	 */
	public int score() {
		int score = 0;
		int frame = 0;

		for (int i = 0; i < 10; i++) {
			// check if is a strike
			if (rolls[frame] == 10) {
				score += 10 + rolls[frame] + rolls[frame+1];  // add strike bonus
				frame++;
				
			// check if is a spare
			} else if (rolls[frame] + rolls[frame+1] == 10) {
				score += 10 + rolls[frame+2];
				frame += 2;
			} else {
				score += rolls[frame] + rolls[frame+1];
				frame += 2;
			}
		}

		return score;
	}
}
