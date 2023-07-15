package array;

public class modify {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int ele=2;
		int newEle=7;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				a[i]=newEle;
				break;
			}
		}
		for (int b: a) {
			System.out.println(b + " ");
		}
	}
}
   
