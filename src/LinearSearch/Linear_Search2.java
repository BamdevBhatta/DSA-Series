package LinearSearch;

public class Linear_Search2 {
	public static void main(String[]args) {
		 int[]number= {20,12,45,32,23,56,43,63,16};
		 int target = 63;
		 int result = findlinaersearch(number, target);
		 System.out.println(result);
		 
	}
	static int  findlinaersearch(int[] name, int target) {
		if (name.length==0) {
			return -1;
			
		}
		// for loop statement
		for(int i=0;i<name.length;i++) {
			 int element =name[i];
			 if(target==element) {
				 
			return 1; 
			 }
		}
		
		return -1;
	}
}
