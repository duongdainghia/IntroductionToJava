package Chapter3Selection;
import java.util.Scanner;
public class ScissorRockPaper {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 or 2 or 3:");
		int player = input.nextInt();
		int computer = (int)(Math.random() * 3 + 1);
		String result = "",playerValue = "",computerValue = "";		
		if(player == computer){
			result = "It is a draw!";			
		}
		else{
			if(player == 1){
				if(computer == 2){
					result = "You lose!";
				}
				else{
					result = "You won!";
				}
			}
			else if (player == 2){
				if(computer == 1){
					result = "You won!";
				}
				else{
					result = "You lose!";
				}
			}
			else if (player == 3){
				if(computer == 1){
					result = "You lose!";
				}
				else{
					result = "You won!";
				}
			}
			else{
				result = "Undefined input!";
			}
		}
		//lay ket qua cua player
		switch(player){
		case 1: playerValue = "Scissor";
		break;
		case 2: playerValue = "Rock";
		break;
		case 3: playerValue = "Paper";
		break;
		}
		//lay ket qua cua player
		switch(computer){
		case 1: computerValue = "Scissor";
		break;
		case 2: computerValue = "Rock";
		break;
		case 3: computerValue = "Paper";
		break;
		}
		if(player == computer)
			System.out.println("The computer is "+ computerValue + ". You are " + playerValue + " too. " + result);
		else
			System.out.println("The computer is "+ computerValue + ". You are " + playerValue + ". " + result);
	}
}
