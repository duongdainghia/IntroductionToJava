package Chapter04Loops;

import java.util.Scanner;
public class RepeatAdditionQuiz {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);	
		int choiTiep = 1;
		double diem = 0, cauSai = 0,cauDung = 0,soCau = 0;
		while(choiTiep == 1){
			int number1 = (int) (Math.random() * 100);
			int number2 = (int) (Math.random() * 100);
			System.out.println(number1 + " + " + number2 + " bằng mấy ?");			
			int result = input.nextInt();
			soCau += 1;
			while(number1 + number2 != result){
				System.out.println("Sai rồi! Bạn bị trừ 5 điểm. Trả lời lại:");				
				result = input.nextInt();
				cauSai += 1;
				diem -= 5;
			}		
			System.out.println("Đúng rồi! Chúc mừng bạn, bạn được cộng 10 điểm !");
			cauDung += 1;
			diem += 10;
			System.out.println("Ấn 1 để chơi tiếp, ấn 0 để kết thúc!");
			choiTiep = input.nextInt();
		}
		System.out.println("Cảm ơn bạn đã tham gia trò chơi:" + 
						"\nSố câu đã trả lời: " + soCau + " câu." +
						"\nSố lần trả lời đúng: " + cauDung + " lần. Tỷ lệ đúng: " + 
						(int)(cauDung / (cauDung + cauSai) * 100.0) + " %." +
						"\nSố lần trả lời sai: " + cauSai + " lần. Tỷ lệ sai: " +
						(int)(cauSai / (cauDung + cauSai) * 100.0) + " %." +
						"\nSố điểm bạn nhận được: " + diem + " điểm.");
	}
}
