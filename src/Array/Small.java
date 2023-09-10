package Array;

public class Small {
	public static void main(String[] args) {
	int a[]= {1,2,3,5,6,4,-1};
	int min=a[0];
	int i=0;
	for(i=0;i<a.length;i++) {
		if(a[i]<=min) {
			min=a[i];
		}
	}
	System.out.println("min= "+min);
	}


}
