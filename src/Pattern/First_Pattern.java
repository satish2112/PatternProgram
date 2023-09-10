package Pattern;
import java.util.Scanner;
public class First_Pattern {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number you want to print Star=");
		int a=in.nextInt();
		int alphabet = 65;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+(char)(alphabet));
				alphabet++;
			}
			System.out.println(" ");
		}
		
	}

}
