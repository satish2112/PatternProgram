package Pattern;
public class V_patten {
	public static void main(String[] args) {
	int i=1,j=1;
		for(i=1;i<=4;i++) {
			for (j=1;j<=7;j++){
				if(i==j || i+j==8) {
					System.out.print("*");
					}else{
					System.out.print(" ");
					}
				}	
			System.out.println(" ");
		}
	}
}