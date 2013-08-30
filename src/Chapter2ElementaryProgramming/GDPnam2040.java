package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class GDPnam2040 {
	public static void main(String[]arg){
		int gdp = 1200;
		for(int i=1;i<=34;i++){
			gdp += gdp*0.07;
		}		
		JOptionPane.showMessageDialog(null, "GDP = " + gdp);
	}
}
