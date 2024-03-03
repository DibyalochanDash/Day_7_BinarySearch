package Day_7;

public class Find_Position_Sorted_InfiniteNumber {

	public static void main(String[] args) {
		
		int arr[] = {2,3,5,6,7,8,10,11,12,15,20,23,30,80,150,300};
		
		int target = 15;

		int ans = findrange(arr,target);
		if(ans == -1) {
			System.out.println("Element not Found!");
		}else {
			System.out.println(ans);
		}
		
	}

	
	static int findrange(int[]arr , int target) {
		int lo = 0;
		int hi = 1;
		while (target > arr[hi]) {
			int temp = hi + 1;
			hi = hi + (hi - lo + 1)*2;
			lo = temp;
		}
		return FindPosition(arr , target ,lo , hi);
	}
	 static int FindPosition(int[] arr, int target,int lo ,int hi) {
		
		 while (lo <= hi) {
	            int mid = lo + (hi - lo) / 2;
	            
	            if (target < arr[mid]) {
	                hi = mid - 1;
	            } else if (target > arr[mid]) {
	                lo = mid + 1;
	            } else {
	              return mid;	
	            }
	            }
		 return -1;
	}

}
