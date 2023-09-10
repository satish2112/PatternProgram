package Pattern;

public class Up_Star {

	public static void main(String[] args) {
		
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//Output ****
//		 ***
//		 **
//		 *

		
		int i=1,j=1,k=1;
		for( i=1;i<=4;i++) {
			for( j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		for( i=1;i<=4;i++) {
			for(k=3;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
//Output
//		*
//		**
//		***
//		****
//		***
//		**
//		*


	}
}
