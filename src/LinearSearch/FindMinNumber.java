package LinearSearch;

public class FindMinNumber {
  public static void main(String [] args) {
	   int []arr = {23,34,10,6,23,55,555};
//	   int ans = arr[0];
//		  for(int i=1;  i<arr.length; i++) {
//			   if(ans>arr[i]) {
//				   ans = arr[i];
//				   
//			   }
//		  }
//		  System.out.println(ans);
	   System.out.println(min(arr));

  }
  
  //assume arr.length !=0
  //return the minimum value in the array
  static int min(int[]arr) {
	  int ans = arr[0];
	  for(int i=1;  i<arr.length; i++) {
		   if(ans>arr[i]) {
			   ans = arr[i];
			   
		   }
	  }
	   return ans;
  }
}
