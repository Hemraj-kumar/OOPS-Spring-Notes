import java.util.*;
public class Merge {
    static void merge(int[]arr,int low,int mid,int hi){
        List<Integer> ls=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=hi){
            if(arr[left]<=arr[right]){
                ls.add(arr[left]);
                left++;
            }else {
                ls.add(arr[right]);
                right++;
            }
        }
        while(left<=mid) {ls.add(arr[left]);left++;}
        while(right<=hi) {ls.add(arr[right]);right++;}

        for(int i=low;i<=hi;i++){
            arr[i]=ls.get(i-low);
        }
    }
    static void ms(int[]arr,int low,int hi){
        if(low>=hi) return;
        int mid=(low+hi)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,hi);
        merge(arr,low,mid,hi);
    }
    public static void main(String[] args) {
        int[]arr={3,2,4,1,3};
        int n=arr.length;
        ms(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
