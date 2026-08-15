package ArrayLS;

public class TripletSum {
    static void main() {
        int[] nums = {1,4,5,6,3};
        int target = 12;
        int ans = pair(nums,target);
        System.out.println(ans);

    }
    static int pair(int[] arr,int target){
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){  // first element
            for(int j=i+1;j<n;j++){  //second element
                for(int k=j+1;k<n;k++){  //third element
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }

                }

            }
        }


        return count;
    }
}
