
public class recursive_linear {
	public static boolean find(int[] arr,int c,boolean b,int n) {
		if(c==arr.length) {
			return b;
			
		}
		if(arr[c]==n) {
			return true;
		}
		return find(arr,c+1,b,n);
		
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {1,2,3,5,6,7};
		System.out.println(find(arr,0,false,-1));
		

	}

}
