import java.util.Scanner;

class Guesser {
	
	int guessNum;
	
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser please guess the number");
		guessNum = sc.nextInt();
		while(guessNum<1 || guessNum>10) {
			System.out.println("Please guess the number between 1 and 10");
			guessNum = sc.nextInt();
		}
		return guessNum;
	}
}

class Player1 {
	
	int guessNum;
	
	public int guessNumber() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 guess the number");
		guessNum = sc.nextInt();
		while(guessNum<1 || guessNum>10) {
			System.out.println("Please guess the number between 1 and 10");
			guessNum = sc.nextInt();
		}
		return guessNum;
	}
}

class Player2 {
	
	int guessNum;
	
	public int guessNumber() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 2 guess the number");
		guessNum = sc.nextInt();
		while(guessNum<1 || guessNum>10) {
			System.out.println("Please guess the number between 1 and 10");
			guessNum = sc.nextInt();
		}
		return guessNum;
	}
}

class Player3 {
	
	int guessNum;
	
	public int guessNumber() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 3 guess the number");
		guessNum = sc.nextInt();
		while(guessNum<1 || guessNum>10) {
			System.out.println("Please guess the number between 1 and 10");
			guessNum = sc.nextInt();
		}
		return guessNum;
	}
}

class Umpire {
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser() {		
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	public void collectNumFromPlayer1() {		
		Player1 p1 = new Player1();
		numFromPlayer1 = p1.guessNumber();
	}
	
	public void collectNumFromPlayer2() {		
		Player2 p2 = new Player2();
		numFromPlayer2 = p2.guessNumber();
	}

	public void collectNumFromPlayer3() {	
	Player3 p3 = new Player3();
	numFromPlayer3 = p3.guessNumber();
	}
	
	public void compare() {		
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All the three Players won the game");
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numFromGuesser == numFromPlayer3)
				System.out.println("Player 1  and Player 3 won the game");
		}
		else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 won the game");
			}
			else
				System.out.println("Player 2 won the game");
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		else
			System.out.println("All lost! please try again");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer1();
		u.collectNumFromPlayer2();
		u.collectNumFromPlayer3();
		u.compare();
	}

}