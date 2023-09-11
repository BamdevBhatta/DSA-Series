package LinearSearch;

public class Linear_Search {
 public static void main(String [] args)
 {
	 int[] nums = {23,23,54,32,54,-1,45,11};
	 int target = 23;
	 int ans = linerSearch(nums, target);
	 System.out.println(ans);
 }
 
 //search in the array: return the index if items found
 //otherwise if item not found return -1
 static int linerSearch(int []arr, int target) {
	 if (arr.length==0) {
		 return -1;
		 
	 }
	 
	 //run  a for loop
	 for (int index=0; index < arr.length; index++) {
		 //check for element at every index if it is = target
		 
		 int element = arr[index];
		 if (element == target) {
			 return 1;
			 
		 }
	 }
	 
	 //this line will execute if none of the return statement above have executed
	 //hence the target not found
	return -1;
 }
  
}
