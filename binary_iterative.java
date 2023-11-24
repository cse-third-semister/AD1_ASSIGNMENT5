
public class binary_iterative {

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {1,2,3,54,6};
		int f = 0;
		int l = arr.length-1;
		int n = 54;
		boolean c =false;
		while(f<=l) {
			if(arr[(l+f)/2] == n) {
				c = true;
				
				
				
				break;
			}
			
			else if(arr[(f+l)/2] < n) {
				f = ((l+f)/2) +1;
				
			}
			else if(arr[(f+l)/2] > n) {
				l = ((l+f)/2) -1 ;
				
			}
			
		}
		if(c) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		

	}

}
