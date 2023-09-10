package A_To_Z_Patter;
public class Pyramid_Letter {
	public static void main(String[] args) {
		int alphabet=65;
		int i=1,j=1,k=1;
		for( i=1;i<=5;i++) {
			for( j=5;j>=i;j--) {
				
			System.out.print(" ");
			}
			for( k=1;k<=i;k++) {
				System.out.print( j);
			}for(int l=i-k;l>=1;l--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
