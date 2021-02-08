import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int a[]= {3,5,-4,8,9,1,-1,6};
		int sum=10;
		
		// Sort Logic
		Arrays.sort(a);
		
		
		// sorted elements a[]={-4, -1, 1,3,5,6,8,9}
		for(int i=0, j=a.length-1; i<j; i++, j--) {
			if(a[i]+a[j]<sum) {
				
				i++;
				
				
			}
			
			else if(a[i]+a[j]>sum) {
				 j--;
				
				System.out.println("Sum Not Found");
			}
			
			
			else {
				
			}
		}

	}

}











