package array;

public class selectionSwap {
    public static void main(String[] args) {
    	int a[]= {5,3,8,6,7,4};
		for (int i=0;i<a.length-1;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if (a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
    }
}
