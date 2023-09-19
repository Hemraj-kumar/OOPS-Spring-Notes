
public class Selection {
    public static void main(String[] args) {
        int n=5;
        int[]arr={55,21,23,65,89};
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n-2;j++){
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
