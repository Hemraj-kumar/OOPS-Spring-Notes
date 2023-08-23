package sorting_algo;
public class Quick {
    static int f(int[]arr,int low,int hi){
        int pivot=arr[low];
        int i=low,j=hi;
        while(i<j){
            while(arr[i]<=pivot && i<=hi-1) i++;
            while(arr[j]>pivot && j>=low+1) j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    static void qs(int []arr,int low,int hi){
        if(low<hi) {
            int pIndex = f(arr, low, hi);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, hi);
        }
    }
    public static void main(String[] args) {
        int[]arr={4,6,2,5,7,9,1,3};
        qs(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
