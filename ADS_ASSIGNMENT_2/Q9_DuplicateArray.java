/*
Display duplicate elements from an array.
Testcase1:
Input: [1, 2, 3, 4, 2, 5, 1]
Expected Output: 1, 2
*/


import java.util.*;
class Q9_DuplicateArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.print(arr[j] + " ");
					found = true;
				}
			}
		}
		
		if(!found){
			System.out.print("No duplicate found");
		}
	}
}

/*
:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q9_DuplicateArray
7
1 2 3 4 2 5 1
1 2

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q9_DuplicateArray
5
10 20 30 40 50
No duplicate found
*/