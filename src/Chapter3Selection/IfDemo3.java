package Chapter3Selection;
import javax.swing.JOptionPane;
public class IfDemo3 {
	public static void main(String[]arg){
		String scoreString = JOptionPane.showInputDialog("Enter score:");
		int score = Integer.parseInt(scoreString);
		int pay = 100;
		if(score > 90){			
			pay += pay * 0.03;
		}
		else{
			pay += pay * 0.01;	
		}
		JOptionPane.showMessageDialog(null,"Pay = " + pay);
	}
}
