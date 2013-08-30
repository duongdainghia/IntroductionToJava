package Chapter3Selection;
import javax.swing.JOptionPane;
public class SubtractionQuiz {
	public static void main(String[]arg){
		// tao ra 2 so ngau nhien tu 1 den 10 su dung Math.random()
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		// kiem tra neu so 1 < so 2 thi doi gia tri cho nhau
		if(number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		//hoi nguoi dung (so1 - so2) bang may va lay ra ket qua
		String answerString = JOptionPane.showInputDialog("What is " + number1 + " - " + number2 + "?");
		// Cast ket qua sang so nguyen
		int answer = Integer.parseInt(answerString);
		// kiem tra ket qua
		if(answer == (number1 - number2))
			// neu dung tra ve "ban da dung"
			JOptionPane.showMessageDialog(null, "You are correct!");
		else
			// neu sai tra ve ban da sai cung voi ket qua
			JOptionPane.showMessageDialog(null, "You are wrong, " + number1 + " - " + number2 + " = " + (number1 - number2));
	}
}
