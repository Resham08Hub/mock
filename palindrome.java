package array;

public class palindrome {
	public static void main(String[] args) {
		int a[]= {5,3,8,6,2,9,4};
		int sum=a[0];
		for(int i=1;i<a.length;i++) {
			sum = sum+a[i];
			if(palin(sum)) {
				System.out.println(sum);
			}
		}
	}
	public static boolean palin(int sum) {
		int temp=sum;
		int rev=0;
		while(sum!=0) {
			rev = rev*10+(sum%10);
			sum/=10;
		}
		if(temp==rev) {
			return true;
		}
	
		return false;

		
	}
}
