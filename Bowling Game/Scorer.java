package model;

public class Scorer {
	private int[] pins;
	private int[] score;
	int currentThrow;
	Game ScorerGame;
	
	/**
	 * Constructor for the core Scorer class
	 */
	public Scorer() {
		this.pins = new int[21];
		this.score = new int[21];
		this.currentThrow = 0;
		this.ScorerGame = new Game();
	}
	
	/**
	 * Method to record the pins of the current throw
	 * 
	 * @param pins to be recorded for the current throw
	 */
	public void recordPins(int pins) {
		this.pins[currentThrow] = pins;
		this.score[currentThrow] = ScorerGame.score();
		this.currentThrow++;
	}
}
