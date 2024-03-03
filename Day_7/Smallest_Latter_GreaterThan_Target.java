package Day_7;

public class Smallest_Latter_GreaterThan_Target {

	public static void main(String[] args) {
	
		char s[] = {'c','f','g'};
      char  target = 'a';
      
       char  ans = nextGreatestLetter(s,target);
       System.out.println(ans);
	}

	private static char nextGreatestLetter(char[] s, char target) {
		// TODO Auto-generated method stub
		
		int lo = 0;
		int hi = s.length-1;
		
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(target < s[mid]) {
				hi = mid -1;
			}else {
				lo = mid +1;
			}
		}
		return s[lo % s.length];
	}

}
