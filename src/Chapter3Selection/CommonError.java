package Chapter3Selection;
import javax.swing.JOptionPane;
public class CommonError {
	public static void main(String[]arg){
		String scoreString = JOptionPane.showInputDialog("Enter score:");
		int score = Integer.parseInt(scoreString);
		int pay = 100;
		boolean demo = false;
//		loi 1: thua thai khi kiem tra gia tri boolean
		if(demo == true) // thay vao do su dung if(demo)
		{
			pay = 1000;
		}
//		loi 2: su dung toan tu = thay vi ==
		if(demo = false) // dung phai la if(demo == false)
		{
			pay = 0;
		}
//		loi 3: dung else 1 cach khong ro rang: else khong chay trong truong hop nay
		if(score > 90)
			if(score > 95)
				pay += pay * 0.03;	
		else
			pay += pay * 0.01;	
//		code dung
//		if(score > 90){
//			if(score > 95)
//				pay += pay * 0.03;
//		}
//		else
//			pay += pay * 0.01;
//		tip: lam ngan code di bang cach gan truc tiep gia tri test cho bien
		demo = (pay > 100);
//		tuong duong voi
//		if(pay > 100){
//			demo = true;
//		}
//		else{
//			demo = false;
//		}
		JOptionPane.showMessageDialog(null,"Pay = " + pay);		
	}
}
