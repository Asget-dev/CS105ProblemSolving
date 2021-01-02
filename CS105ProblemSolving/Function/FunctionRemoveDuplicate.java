package CS105ProblemSolving.Function;

import java.util.Arrays;

public class FunctionRemoveDuplicate {
	public static int[] num(int[] duplicate) {

		int x[] = new int[duplicate.length];
		int j = 0;
		for (int i = 0; i < duplicate.length - 1; i++) {
			if (duplicate[i] != duplicate[i + 1]) {

				x[j] = duplicate[i];
				j++;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		int dup[] = { 1, 1, 2, 2, 2 };
		int[] z = num(dup);
		// Arrays.sort(dup);

		System.out.println(Arrays.toString(z));
	}

}

//
//public class RemoveDuplicateInArrayExample2{  
//    public static int removeDuplicateElements(int arr[], int n){  
//        if (n==0 || n==1){  
//            return n;  
//        }    
//        int j = 0;//for next element  
//        for (int i=0; i < n-1; i++){  
//            if (arr[i] != arr[i+1]){  
//                arr[j] = arr[i];  
//                j++;
//            }  
//        }  
//        arr[j++] = arr[n-1];  
//        return j;  
//    }  
//       
//    public static void main (String[] args) {  
//        int arr[] = {10,20,20,30,30,40,50,50};  
//        int length = arr.length;  
//        length = removeDuplicateElements(arr, length);  
//        //printing array elements  
//        for (int i=0; i<length; i++)  
//           System.out.print(arr[i]+" ");  
//    }  
//} 