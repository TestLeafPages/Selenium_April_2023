package week1.day1;

public class LearnElseIfStatement {
public static void main(String[] args) {
	int mark = 34;
	if(mark <= 100 && mark >= 80) {
		System.out.println("Grade A");
	} else if(mark < 80 && mark >= 60) {
		System.out.println("B Grade");
	} else if(mark < 60 && mark >= 35) {
		System.out.println("C Grade");
	} else {
		System.out.println("F Grade");
	}
}
}
