package Pattern;

public class Left_Pyramid {
	public static void main(String[] args) {
		int i=1,j=1,k=1;
		int m,l,n;
		for( i=1;i<=4;i++) {
			for(k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for( j=1;j<=i;j++) {	
				System.out.print("*");
			}
			System.out.println();
		}	
		for( l=2;l<=4;l++) {
			for( m=1;m<=l;m++) {
				System.out.print(" ");
			}
			for( n=4;n>=l;n--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}