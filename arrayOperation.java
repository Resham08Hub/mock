package array;

public class arrayOperation {
	 public int[] insert(int a[],int ele, int pos) {
		 if(pos > a.length + 1 || pos < 1) {
			 System.out.println("insertion not possible");
		 }else {
			 int res[]=new int[a.length+1];
			 for(int i=0,j=0;i<res.length;i++) {
				 if(i==(pos-1)) {
					 res[i]=ele;
				 }else {
					 res[i]=a[j++];
				}
			 }
			 return res;
		 }
		 return a;
	 }
	 
	 public int[] delete(int a[],int ele) {
		 if(a.length<=0) {
			 System.out.println("array is empty");
			 return a;
		 }else if(search(a,ele)==-1){
			 System.out.println("deleting element is not present");
			 return a;
		 }else {
			 int[]res =new int [a.length-1];
			 int ind= search(a,ele);
			 for(int i=0,j=0;i<a.length;i++) {
				 if(i!=ind) {
					 res[j++]=a[i];
				 }
			 }
			 return res;
		 }
	  }
	 public int[] update(int a[], int re,int ne) {
			if(a.length == 0) {
				System.out.println("Array is empty");
			}else {
				if(search(a,re)== -1) {
					System.out.println("Replacing elementis not present");
				}else {
					for(int i=0;i<a.length;i++) {
						if(a[i]== re) {
							a[i]=ne;
						}
					}
				}
			}
			return a;
		}
		public int[] sort (int a[]) {
			int temp;
			for(int i=0;i<a.length;i++) {
				for(int j=1;j<a.length-i;j++) {
					if(a[j-1]>a[j]) {
						temp =a[j-1];
						a[j-1]=a[j];
						a[j]=temp;
					}
				}
			}
			return a;
		}
		
		public int search(int a[], int ele) {
			 int ind=-1; 
			 for(int i=0;i<a.length;i++) {
					if(a[i]== ele) {
						ind =i;
						break;
					}
				}
			 return ind;
	   }
		public int [] reverse(int a[]){
			int rev[]=new int [a.length];
			for(int i=0,j=0;i<a.length;i++,j--) {
				 rev[i]=a[j];
			}
		return rev;
		}
		public void display(int[]a) {
			for(int i: a) {
				System.out.println(i + " ");
			}
		}
		public int min(int a[]) {
			int min=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}
			return min;
		}
		public int max(int a[]) { 
			int max=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]> max) {
					max=a[i];
				}
			}
			return max;
		}
		public boolean isEmpty(int a[]) {
			return a.length==0;
		}
}
 

