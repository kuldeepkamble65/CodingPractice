package Quick_Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void quickSort(int[] arr,int low, int high){
        if (low < high) {

            int pivoteIndex = partition(arr, low, high);

            quickSort(arr, low, pivoteIndex - 1);
            quickSort(arr, pivoteIndex + 1, high);
        }
    }

    public static int partition(int[] arr,int low, int high){
        int pivote = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]< pivote){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivote;
        arr[high]=temp;
        return i;
    }
}
