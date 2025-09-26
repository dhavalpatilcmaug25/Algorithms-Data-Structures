/*

1. Find the maximum element in an array. Solve this problem using iterative and recursion method
Testcase1:
Input: [10, 25, 47, 3, 19]
Expected Output: 47
Testcase2:
Input: [-5, -10, -3, -20, -7]
Expected Output: -3 


*/

import java.util.*;

class Q1_MaxElement{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q1_MaxElement
10 25 47 3 19
47

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q1_MaxElement
-5 -10 -3 -20 -7
-3

*/