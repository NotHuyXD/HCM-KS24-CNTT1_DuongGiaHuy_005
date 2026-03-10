public class SlidingWindow {
    public static int[] findSumSubArray(int[] arr,int s){
        if(arr==null||arr.length==0){
            return new int[]{-1};
        }

        int left=0;
        int currentSum=0;

        for(int right=0;right<arr.length;right++){
            currentSum+=arr[right];

            while(currentSum>s && left<=right){
                currentSum-=arr[left];
                left++;
            }

            if(currentSum==s){
                return new int[]{left,right};
            }
        }

        return new int[]{-1};
    }
}
