/*
Copy elements of one array into another.
Testcase:
Input: Source Array: [1, 2, 3, 4, 5]
Expected Output: Destination Array: [1, 2, 3, 4, 5] 

*/

class Q8_CopyArray{
	public static void main(String args[]){
		int arr1[] = {1, 2, 3, 4, 5};
		
		int arr2[] = new int[5];
		
		for(int i=0; i<arr1.length; i++){
			arr2[i] = arr1[i];
		}
		
		for(int a : arr2){
			System.out.print(a + " ");
		}
	}
}

/*
Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q8_CopyArray
1 2 3 4 5
*/