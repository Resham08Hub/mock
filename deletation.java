package array;

public class deletation {
    public static void main(String[] args) {
		int a[]= {1,2,3,2,4,1,2,5};
		int del=2,ind=Search(a,del);
		if(a.length==0) {
			System.out.println("array is empty");
		}
		else if(ind==-1) {
			System.out.println("deletation is not possible");
		}
		else {
			int res[]=new int[a.length-1];
			for(int i=0,j=0;i<a.length;i++) {
				if(i!=ind) {
					res[j++]=a[i];
				}
			}
			for(int i:res) {
				System.out.println(i +" ");
			}
		}
	}

	private static int Search(int[] a, int ele) {
		 for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				 return i;
			 }
		 }
		return -1;
	}
}
