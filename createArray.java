package array;

public class createArray {
	
	public static void main(String[] args) {
		int a[]= {1,3,4,7,8,9,6,11,15,18,26,40,60};
		for (int i=0;i<=a.length-1;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			} 
			
		}
	}
}
