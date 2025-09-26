/*

5. Print array elements in reverse order.
Testcase1:
Input: [1, 2, 3, 4, 5]
Expected Output: [5, 4, 3, 2, 1]
Testcase2:
Input: [-1, 2, -3, 4, -5]
Expected Output: [-5, 4, -3, 2, -1] 

*/
import java.util.*;
class Q5_reverseOrder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int i = 0, j = arr.length-1;
		
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q5_reverseOrder
1 2 3 4 5
5 4 3 2 1

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q5_reverseOrder
-1 2 -3 4 -5
-5 4 -3 2 -1

*?