/*
10. Find the second largest element in the array.
Testcase:
Input: [10, 20, 30, 40, 50]
Expected Output: 40 

*/

class Q10_SecondLargest{
	public static void main(String args[]){
		int arr[] = {10, 20, 30, 40, 50};
		
		int first = 0;
		int second = 0;
		
		for(int num : arr){
			if(num > first){
				second = first;
				first = num;
			}
			else if(num > second && first != num){
				second = num;
			}
		}
		
		System.out.print(second);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q10_SecondLargest
40
*/