package Array;
import java.util.Scanner;
public class Add_Array {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the size of arry: ");
	int n=in.nextInt();
	int a[]=new int[n];
	int sum=0;
	System.out.print("Enter the value of Elemnt=");
//			for(int i=0;i<n;i++) {
//				a[i]=in.nextInt();
//				sum=sum+a[i];
//			}
		for(int i:a) {
			a[i]=in.nextInt();
			sum=sum+a[i];

		}
	System.out.println("Total="+sum);
	}

}
