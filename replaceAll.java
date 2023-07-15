package array;

public class replaceAll {
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int ele=2;
		int new_ele= 7;
		if(a.length == 0) {
			System.out.println("Array is empty");
		}
		else {
			if(search(a, ele)== -1) {
				System.out.println("Replacing element is not present....");
			}
			else {
				for(int i=0;i<a.length;i++) {
					if(a[i]==ele) {
						a[i]=new_ele;
						break;
					}
				}
				
				for(int i:a) {
					System.out.print(i +" ");
				}
			}
		}
	}
	
	public static int search(int a[],int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				 return i;
			 }
		 }
		return -1;
	}
}
