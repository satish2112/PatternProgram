package Pattern;
import java.util.Iterator;
public class PatternNSqure {
	public static void main(String[] args) {
		int n=5,count=0,count1=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n*n; j++) {
				if (count<n) {
					System.out.print("*");
					count++;
				}else {
					System.out.print("-");
					count1++;
				}
				if(count1>=n*n ) {
					count=0;
					count1=0;
					}
			}
			System.out.println();
		}
	}

}
