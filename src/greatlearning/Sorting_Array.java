package greatlearning;

import java.util.Arrays;

public class Sorting_Array {
    public static void main(String[] args) {
        int arr[]={23,37,78,56,43,34,55};
        Arrays.sort(arr);
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
