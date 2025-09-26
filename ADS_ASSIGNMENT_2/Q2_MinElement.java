/*

2. Find the minimum element in an array.
Testcases1:
Input: [15, 8, 22, 5, 19]
Expected Output: 5
Testcase2:
Input: [-4, -15, -7, -2, -30]
Expected Output: -30 


*/

import java.util.*;

class Q2_MinElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q2_MinElement
15 8 22 5 19
5

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q2_MinElement
-4 -15 -7 -2 -30
-30

*/