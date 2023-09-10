package Array;

public class Even_print_arry {

	public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,5};
	int b[]=new int[a.length];
	int i,j;
		for( i=0;i<5;i++) {
			b[i]=a[i];
		}
	System.out.println("------------Old Arry----------");

		for(j=0;j<5;j++) {
			System.out.print(a[j]+" ");
		}
	System.out.println();
	System.out.println("------------New Arry----------");
		for(j=0;j<5;j++) {
			if(j%2==1)
			System.out.print(b[j]+" ");
		}
		
	}
}