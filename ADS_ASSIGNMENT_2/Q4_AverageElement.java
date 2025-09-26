/*

Find the average of array elements
Testcase1:
Input: [10, 20, 30, 40, 50]
Expected Output: 30.0 


*/
import java.util.*;
class Q4_AverageElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		double avg = sum / arr.length;
		
		System.out.println(avg);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q4_AverageElement
10 20 30 40 50
30.0

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q4_AverageElement
-5 10 15 -10 5
3.0
*/