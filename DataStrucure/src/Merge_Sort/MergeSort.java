package Merge_Sort;

public class MergeSort {



    public static void main(String[] args) {
        int[] arr ={6,3,9,5,2,8};
        int n= arr.length;
        divide(arr, 0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void divide(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
            divide(arr, startIndex, midIndex);
            divide(arr, midIndex + 1, endIndex);
            conquer(arr, startIndex, midIndex, endIndex);

    }

    private static void conquer(int[] arr, int startIndex, int midIndex, int endIndex) {
        int[] merged = new int[endIndex - startIndex + 1];

        int index1 = startIndex;
        int index2 = midIndex + 1;
        int x = 0;

        while (index1 <= midIndex && index2 <= endIndex) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        while (index1 <= midIndex) {
            merged[x++] = arr[index1++];
        }

        while(index2 <= endIndex){
            merged[x++] = arr[index2++];
        }

        for(int i=0, j=startIndex; i<merged.length; i++, j++){
                arr[j] = merged[i];
        }


    }
}
