package HackerEarthProblem;

public class MaximumNo2 {
    public static void main(String[] args) {
        int a[] = {90,4,2,34,84,5};

        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("maximum element is "+max);
    }
}
