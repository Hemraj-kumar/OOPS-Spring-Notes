public class Insertion {
    public static void main(String[] args) {
        int n=5;
        int[]arr={45,56,89,90,9};
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && (arr[j-1]>arr[j])){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++) System.out.println(arr[i]);
    }
}

time complexity
        best case -- O(n) when all the elements in array are sorted
        worst case and avg case -- O(n^2) 
