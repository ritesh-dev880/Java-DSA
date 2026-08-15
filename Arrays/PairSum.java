package ArrayLS;

public class PairSum {
    static void main(String[] args) {
        int[] arr = {3,4,5,2,7,8};
        int target = 7;
        int ans = pair(arr,target);
        System.out.println(ans);

    }
    static int pair(int[] arr,int target){
        int count =0;
        int n = arr.length;
        for(int i=0;i<n;i++){  // pick first element
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }

        }
        return count;
    }
}
