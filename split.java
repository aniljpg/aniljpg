import java.util.Scanner;
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the text :");
		String word=s.nextLine();
		String[] arrays= word.split(" ");
		for(String array : arrays) {
			System.out.println(array);
		}
	}

}
