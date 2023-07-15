package array;

public class evenSortedOrder {
	public static void main(String[] args) {
		int a[]={2,7,10,8,3,5,4,9,6};
		for (int i=0;i<a.length-1;i++){
		for (int j=1;j<a.length;j++) {
				 if ( a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				 System.out.print(a[i] + " ");
			 }
			}
		}
			
}
