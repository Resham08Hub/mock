package array;

public class primeSortOrder {
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
			int c=0;
			for(int j=1;j<=a[i];j++) {
				if ( a[i]%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(a[i]);
			}
		}
	}
			
}

