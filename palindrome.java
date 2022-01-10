import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
//		String s;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the word:  ");
		String str = s.nextLine();
	      String reverse = new StringBuffer(str).reverse().toString();
	      if (str.equals(reverse))
	      System.out.println("String is palindrome");
	      else
	      System.out.println("String is not palindrome");
	}

}
