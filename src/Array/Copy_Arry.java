package Array;
public class Copy_Arry {
	public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,5};
	int b[]=new int[a.length];
	int i,j;
		for( i=0;i<5;i++) {
			b[i]=a[i];
		}
		System.out.println("------------Old Arry----------");

		for(j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		System.out.println("------------New Arry----------");
		for(j=a.length-1;j>=0;j--) {
			System.out.print(b[j]+" ");
		}
	}

}
