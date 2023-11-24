
public class recursive_binary {
	public static boolean find(int[] arr,int f,int l,int n) {
		if(l<=f) {
			return false;
		}
		else if(arr[(f+l)/2] == n) {
			
			return true;
		}
		
		else if(arr[(f+l)/2] < n) {
			f = ((f+l)/2) +1;
			return find(arr,f,l,n);
		}
		else if(arr[(f+l)/2] > n) {
			l = ((f+l)/2)   ;
			return find(arr,f,l,n);
		}
		else  {
			return false;
		}
	
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {1,2,3,4,6};
		System.out.println(find(arr,0,arr.length,2));
		

	}

}
