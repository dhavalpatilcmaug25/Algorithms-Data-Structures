/* 
7. Search for an element in the array (linear search).
Testcase1:
Input: [10, 20, 30, 40, 50], Search Element: 30
Expected Output: Element found at index 2 

 */
 
class Q7_LinearSearch{
	public static void main(String args[]){
		int arr[] = {10, 20, 30, 40, 50};
		
		int search = 30;
		
		int ans = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == search){
				ans = i;
				break;
			}
		}
		
		System.out.println("Element found at index " + ans);
	}
}

/*
Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q7_LinearSearch
Element found at index 2
*/