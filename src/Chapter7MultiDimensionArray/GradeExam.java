package Chapter7MultiDimensionArray;
import java.util.Scanner;
public class GradeExam {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student number: ");
		int studentNum = input.nextInt();		
		System.out.println("Enter answer number: ");
		int answerNum = input.nextInt();
		char[] answer = enterAnswer(answerNum);
		char[][] grade = enterGrade(studentNum, answerNum);
		autoGrade(grade, answer);
	}
	
	public static char[] enterAnswer(int answerNum) {
		Scanner input = new Scanner(System.in);		
		char[] answer = new char[answerNum];
		System.out.println("Enter answer: ");		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = input.next().charAt(0);
		}
		return answer;
	}
	
	public static char[][] enterGrade(int studentNum, int answerNum) {
		Scanner input = new Scanner(System.in);
		char[][] studentAnswer = new char[studentNum][answerNum];
		for (int i = 0; i < studentNum; i++) {
			System.out.println("Enter student " + (i + 1) + "'s grade: ");
			for (int j = 0; j < answerNum; j++) {
				studentAnswer[i][j] = input.next().charAt(0);
			}
		}
		return studentAnswer;
	}
	
	public static void autoGrade(char[][] grade, char[] answer) {
		for (int i = 0; i < grade.length; i++) {
			int answerCount = 0;
			for (int j = 0; j < grade[i].length; j++) {
				if (grade[i][j] == answer[j]) {
					answerCount++;
				}
			}
			System.out.println("Student " + (i + 1) + "'s correct count is " + answerCount);
		}
	}
}
