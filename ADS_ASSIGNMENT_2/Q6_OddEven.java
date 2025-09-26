/*

6. Count even and odd elements in an array.
Testcase1:
Input: [1, 2, 3, 4, 5, 6]
Expected Output: Even: 3, Odd: 3
Input: [2, 4, 6, 8]
Expected Output: Even: 4, Odd: 0 

*/

import java.util.*;
class Q6_OddEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int odd = 0, even = 0;
		
		for(int i=0; i<n; i++){
			if(arr[i] % 2 == 0) even++;
			else odd++;
		}
		
		System.out.println("Even: " + even + ", Odd: " + odd);
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q6_OddEven
6
1 2 3 4 5 6
Even: 3, Odd: 3

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q6_OddEven
4
2 4 6 8
Even: 4, Odd: 0

*/