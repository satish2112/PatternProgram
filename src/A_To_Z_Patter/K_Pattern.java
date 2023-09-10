package A_To_Z_Patter;
public class K_Pattern {
	public static void main(String[] args) {
		int alphabet=64;
		int i=1,j=1,x=1;
		for( i=1;i<=5;i++) {
			x=1;
			for(int k=5;k>=i;k--,x++) {
				
			System.out.print((char)(alphabet +x)+" ");
			}
			System.out.println();
		}
		alphabet=64;
		for(int m=2;m<=5;m++) {
			for( j=1;j<=m;j++) {
			System.out.print((char)(alphabet +j)+" ");
			}
			System.out.println();
		}
		
	}

}
