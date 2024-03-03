package Day_7;
public class Find_First_Last_Position_SortedArray {

    public static void main(String[] args) {
        int arr[]= {5,7,7,8,8,10};
        int target = 10;

        int ans[] = FirstLastPosition(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" "); // Printing the results
        }
    }

    private static int[]  FirstLastPosition(int[] arr, int target) {
        int ans[] = {-1,-1};

        int lo = search(arr, target ,true);
        int hi = search(arr, target ,false);

        ans[0] = lo;
        ans[1] = hi;

        return ans;
    }
    
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int lo = 0;
        int hi = arr.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        
        return ans;
    }
}
