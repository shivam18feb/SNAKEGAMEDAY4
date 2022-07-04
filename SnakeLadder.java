package snakeandladder;

public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;
	
	
	
	public static void main(String[] args) {
		
		
		int option = (int) ((Math.random() * 10 % 3) + 1); 
		if (option == IS_SNAKE) {
			currentPosition -= diceNumber;
			System.out.println("Player in snake position : " + currentPosition);
		} else if (option == IS_LADDER) {
			currentPosition += diceNumber;
			System.out.println("Player in ladder position : " + currentPosition);
		} else {
			System.out.println("No Play " + currentPosition);
		}
	}
}