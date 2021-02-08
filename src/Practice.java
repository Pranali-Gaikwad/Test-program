import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		


	int a[]= {1, 2, 4, 6, 3, 7, 8};
	int n=7;
	Arrays.sort(a);
	for(int i=0;i<n-1;i++) {
		if(a[i]!=a[i+1]-1) {
			System.out.println(a[i]+1);
			break;
		}
	}
	
	}
	

	
	
	
}

