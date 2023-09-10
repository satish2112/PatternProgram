package Pattern;
public class Mirror_of_V {
		public static void main(String[] args) {
		int i=1,j=1;
			for(i=1;i<=4;i++) {
				for (j=1;j<=7;j++){
					if(i+j==5 || i+3==j) {
						System.out.print("*");
						}else{
						System.out.print(" ");
						}
					}	
				System.out.println(" ");
			}
		}
}
