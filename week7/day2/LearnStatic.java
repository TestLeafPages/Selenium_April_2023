package week7.day2;

public class LearnStatic {
// Non static -> heap memory
// Static -> Stack/ Classlevel memory
	int a = 5;
	static int b = 5;
	public void inc() {
		stinc();
		a++;
	}
	public void stinc() {
		LearnStatic.b++;
	}
	public static void dyinc() {
		
	}
	public static void main(String[] args) {
		dyinc();
		System.out.println(b);
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.a);
		System.out.println(LearnStatic.b);
		
		obj.inc();
		obj.stinc();
		
		System.out.println(obj.a);
		System.out.println(LearnStatic.b);
		
		LearnStatic obj1 = new LearnStatic();
		System.out.println(obj1.a);
	}
	
}
