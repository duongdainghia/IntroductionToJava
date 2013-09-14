package Chapter03Selection;
import javax.swing.JOptionPane;
public class TestBooleanOperator {
	public static void main(String[]arg){
		// Dua ra hop thoai nhac nguoi dung dien vao 1 so
		String numString = JOptionPane.showInputDialog("Enter a number:");
		// chuyen so do ve dang integer
		int num = Integer.parseInt(numString);
		// kha nang xay ra nhieu truong hop -> su dung nhieu if lien tiep nhau
		//neu chia het cho ca 2 va 3
		if (num % 2 == 0 && num % 3 == 0){
			JOptionPane.showMessageDialog(null,num + " divided by 2 and 3!");			
		}
		//neu chia het cho 2 hoac 3
		if (num % 2 == 0 || num % 3 == 0){
			JOptionPane.showMessageDialog(null,num + " divided by 2 or 3!");
		}
		//neu chia het cho 2 hoac 3 nhung khong phai ca hai
		if (num % 2 == 0 ^ num % 3 ==0){
			JOptionPane.showMessageDialog(null,num + " divided by 2 or 3 but not both!");
		}
	}
}
