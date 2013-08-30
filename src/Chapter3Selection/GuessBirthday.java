package Chapter3Selection;
import javax.swing.JOptionPane;
public class GuessBirthday {
	public static void main(String[]arg){
		//luu tap hop so 1 vao bien
		String set1 = "1 3 5 7\n" +
					  "9 11 13 15\n" +
					  "17 19 21 23\n" +
					  "25 27 29 31";
		//luu tap hop so 2 vao bien
		String set2 = "2 3 6 7\n" +
				      "10 11 14 15\n" +
				      "18 19 22 23\n" +
				      "26 27 30 31";
		//luu tap hop so 3 vao bien
		String set3 = "4 5 6 7\n" +
				      "12 13 14 15\n" +
				      "20 21 22 23\n" +
				      "28 29 30 31";
		//luu tap hop so 4 vao bien
		String set4 = "8 9 10 11\n" +
				      "12 13 14 15\n" +
				      "24 25 26 27\n" +
				      "28 29 30 31";
		//luu tap hop so 5 vao bien
		String set5 = "16 17 18 19\n" +
				      "20 21 22 23\n" +
				      "24 25 26 27\n" +
				      "28 29 30 31";
		//khai bao bien day chua ngay sinh
		int day = 0;
		//hoi nguoi dung ve ngay sinh cua ho so sanh voi tap hop so 1
		int answer = JOptionPane.showConfirmDialog(null,"Is your birthday in following set\n(Enter 1 if true or 0 if false):\n" + set1);		
		//kiem tra neu cau tra loi la 1 thi cong them 1 vao bien day
		if(answer == JOptionPane.YES_OPTION){
			day += 1;
		}
		//hoi nguoi dung ve ngay sinh cua ho so sanh voi tap hop so 2
		answer = JOptionPane.showConfirmDialog(null,"Is your birthday in following set\n(Enter 1 if true or 0 if false):\n" + set2);		
		//kiem tra neu cau tra loi la 1 thi cong them 2 vao bien day
		if(answer == JOptionPane.YES_OPTION){
			day += 2;
		}
		//hoi nguoi dung ve ngay sinh cua ho so sanh voi tap hop so 3
		answer = JOptionPane.showConfirmDialog(null,"Is your birthday in following set\n(Enter 1 if true or 0 if false):\n" + set3);		
		//kiem tra neu cau tra loi la 1 thi cong them 4 vao bien day
		if(answer == JOptionPane.YES_OPTION){
			day += 4;
		}		
		//hoi nguoi dung ve ngay sinh cua ho so sanh voi tap hop so 4
		answer = JOptionPane.showConfirmDialog(null,"Is your birthday in following set\n(Enter 1 if true or 0 if false):\n" + set4);		
		//kiem tra neu cau tra loi la 1 thi cong them 1 vao bien day
		if(answer == JOptionPane.YES_OPTION){
			day += 8;
		}
		//hoi nguoi dung ve ngay sinh cua ho so sanh voi tap hop so 2
		answer = JOptionPane.showConfirmDialog(null,"Is your birthday in following set\n(Enter 1 if true or 0 if false):\n" + set5);		
		//kiem tra neu cau tra loi la 1 thi cong them 1 vao bien day
		if(answer == JOptionPane.YES_OPTION){
			day += 16;
		}
		//In ra ngay sinh cua nguoi dung
		JOptionPane.showMessageDialog(null, "Your birthday is " + day);
	}
}
