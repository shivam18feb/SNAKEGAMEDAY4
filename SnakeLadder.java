package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		
		int currentPosition = 0;
		int diceNumber = (int) ((Math.random() * 10 % 6) + 1);
		System.out.println("Dice Number : " + diceNumber);
	}
}