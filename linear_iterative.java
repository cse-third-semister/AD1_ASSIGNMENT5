
public class linear_iterative {
	public static int linear_search(int []arr, int element) {
		for(int i=0 ; i<arr.length ; i++) {
			if(element == arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int [] arr = {1,2,3,4,5};
		System.out.println(linear_search(arr,4));

	}

}
