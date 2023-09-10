package Pattern;
public class Space_Tringle {
	public static void main(String[] args) {
		int i=1,j=1,k=1;
		for( i=1;i<=4;i++) {
			for(k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for( j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}

