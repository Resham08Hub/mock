package array;

public class fiboFromPalindrome {
	public static void main(String[] args) {
		int a[]= {4,1,3,1,4,6,2,4};
		int sum=a[0];
		for(int i=1;i<a.length;i++) {
			sum = sum+a[i];
			if(fibo(sum)) {
				System.out.println(sum);
			}
		}
	}
	 
	public static boolean fibo(int n) {
		if(n==1||n==0) {
			return true;
		}
	    int a=0;
	    	int b=1;
	    	int res=a+b;
	    	while(res<=n) {
	    		if(res==n) {
	    			return true;
	    		}
	    		a=b;
	    		b=res;
	    		res=a+b;
	    	}
	    	 
	    	return false;
	    }
	
}
