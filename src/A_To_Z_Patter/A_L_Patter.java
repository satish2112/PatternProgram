package A_To_Z_Patter;
public class A_L_Patter {
	public static void main(String[] args) {
		int alphabet=64;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print((char)(alphabet +j)+" ");
			}
			
			System.out.println();
		}
	}

}
