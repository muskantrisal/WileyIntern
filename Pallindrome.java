import java.util.Scanner;
public class Pallindrome {

	public static Boolean pallindrome(String s) {
		int start = 0;
		int end = s.length()-1;
		while (start<=end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start += 1;
			end -= 1;
		}
		return true;
	}
	
	public static Boolean stringCheck(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!(Character.isDigit(s.charAt(i))))
					return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		s = sc.next();
		Boolean ispallindrome = pallindrome(s);
		if (ispallindrome) System.out.println("Given input is pallindrome");
		else System.out.println("Given input is not pallindrome");
		
		Boolean isInt = stringCheck(s);
		if (isInt) System.out.println("Data Type of input is Integer");
		else System.out.println("Data type of input is not Integer");
		
		sc.close();

	}

}
