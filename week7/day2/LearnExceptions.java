package week7.day2;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

public class LearnExceptions {
// Error
//	intz a = 1;
// Exception
	// Bharath (before Marriage) -> compile time exception
	public static void main(String[] args) {
		// Runtime exception
//		System.out.println(1/0);
		// try, catch, finally, throw, throws
		// try -> catch
		// try -> finally
//		Bharath -> Stranger girl -> action
//		accept
//		reject
//			girl can handle
//			father/husband can handle
		new LearnExceptions().getException();
	}
	
	public void getException() {
		try {
			System.out.println(5/0);
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}catch (StaleElementReferenceException e) {
				System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This will move on");
		}
		System.out.println("Story continues");
	}
}
