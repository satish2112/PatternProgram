package Array;
public class Largest_Element {
	public static void main(String[] args) {
	int a[]= {1,2,3,5,6,4,1};
	int max=a[0];
	int i=0;
	for(i=0;i<a.length;i++) {
		if(a[i]>=max) {
			max=a[i];
		}
	}
	System.out.println("max= "+max);
	}
}