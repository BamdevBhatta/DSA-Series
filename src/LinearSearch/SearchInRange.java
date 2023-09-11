package LinearSearch;

public class SearchInRange {
public static void main(String []args) {
	int []number = {21,12,34,43,23,32,66,88,45};
	int target = 45;
	 int first =2;
	 int last = 7;
	 //int result = linearSearch(number, target, first, last);
	 int result = linearSearch(number, target, 1, 7);
	 System.out.println(result);
	
}
static int linearSearch( int[]array, int target, int start , int end) {
	if(array.length==0) {
		return -1;
	}
	//run a for loop
	for(int index=start; index<=end; index++) {
		//check for element at every index if it is = target
		int element = array[index];
		if(element==target) {
            return index;
		}
	}
//this line will execute if none of the return element find in array
	return -1;
	
}
}
