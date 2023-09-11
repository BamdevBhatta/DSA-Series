package LinearSearch;

public class Linear_Search1 {
	public static void main(String[]args) {
		String namefinding = "bobby-bhatta";
		char target = 'b';
		System.out.println(searchLetter(namefinding, target));
		
	}
	static boolean searchLetter( String name, int target) {
		if(name.length()==0)
			return false;
		
		for(int i=0;i<name.length();i++) {
			target =name.indexOf(i);
			return true;
		}
		
    return false;		
	}
	
}
