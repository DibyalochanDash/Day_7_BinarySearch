package Day_7;

public class CellingOfNumber {

	public static void main(String[] args) {
		int arr[]= {2,3,5,9,14,16,18};
		int target = 13;
		int ans = Celling(arr,target);// Greatest element in array greater or equal to target element.
     
		System.out.println(ans);
	}

	private static int Celling(int[] arr,int target) {
		
		int lo = 0;
		int hi = arr.length-1;
		

		if (target > arr[arr.length-1]){
			return -1;
			
		}
		
		while (lo <= hi) {
			int mid = (lo + hi)/2;
			if (arr[mid] == target) {
				return mid; 
			}else if(arr[mid] < target)
			{
				lo = mid +1;
			}else {
				hi = mid -1;
			}	
		}
	
		return arr[lo] ;
	
	}

}
