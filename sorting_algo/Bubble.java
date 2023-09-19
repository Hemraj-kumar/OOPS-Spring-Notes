public class Bubble {
    public static void main(String[] args) {
        int n=5;
        int[]arr={45,56,89,90,9};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++) System.out.println(arr[i]);
    }
}

time complexity
    best case --> O(n) if the array is already sorted
    worst case and avg case is O(n^2)
