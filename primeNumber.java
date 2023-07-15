package array;

public class primeNumber {
	public static void main(String[] args) {
		int j[]= {6,8,9,6,4,8,10,38,67,98,36};
		for(int i=0;i<=j.length-1;i++) {
			int count=0;
			if(j[i]==0 || j[i]==1){
				count=1;
			}
			for(int k=0;k<=j.length-1;k++) {
				if(j[i]%k==0) {
					count=1;
			}
				if(count==0) {
					System.out.println(j[i]);
				}
			}
			
		}
		
	}
}
