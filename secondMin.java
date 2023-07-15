package array;

public class secondMin {
	public static void main(String[] args) {
		int a[]={3,8,7,10,5};
		int fMin=a[0],sMin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fMin) {
				sMin=fMin;
				fMin=a[i];
			}
			else if(a[i]<sMin && a[i]>fMin) {
				sMin=a[i];
			}
		}
		System.out.println(sMin);
	}
}
