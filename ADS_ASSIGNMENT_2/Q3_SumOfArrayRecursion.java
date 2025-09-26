/*

Calculate the sum of all array elements. Solve this problem using iterative and recursion method
Testcase1:
Input: [1, 2, 3, 4, 5]
Expected Output: 15

Testcase2:
Input: [-1, 2, -3, 4, -5]
Expected Output: -3

*/

import java.util.*;

class Q3_SumOfArrayRecursion{
	
	static int sum(int arr[], int i){
		if(i == arr.length){
			return 0;
		}
		
		return arr[i] + sum(arr, i+1);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(sum(arr, 0));
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q3_SumOfArray
1 2 3 4 5
15

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q3_SumOfArray
-1 2 -3 4 -5
-3

*/