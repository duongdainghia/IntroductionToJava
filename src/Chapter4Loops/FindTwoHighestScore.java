package Chapter4Loops;
import java.util.Scanner;
public class FindTwoHighestScore {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		double highestScore = 0, secondHighestScore = 0;
		String highestStudent = "",secondHighestStudent = "";
		System.out.println("Enter number of students:");
		int studentCount = input.nextInt();		
		for(int i=0;i < studentCount;i++){
			System.out.println("Enter student " + (i+1) + "'s name and and score: ");
			String name = input.next();
			double score = input.nextDouble();			
			if (score > secondHighestScore){
				if (score > highestScore) {
					secondHighestScore = highestScore;
					secondHighestStudent = highestStudent;
					highestScore = score;
					highestStudent = name;
				} else {
					secondHighestScore = score;
					secondHighestStudent = name;
				}				
			}											 
		}
		System.out.println("Highest score student is " + highestStudent + " with score " + highestScore);
		System.out.println("Second highest score student is " + secondHighestStudent + " with score " + secondHighestScore);
	}
}
