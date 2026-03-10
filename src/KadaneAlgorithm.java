public class KadaneAlgorithm {
    public static int findMaxSum(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }

        int max=arr[0];
        int currentMax=arr[0];

        for(int i=0; i<arr.length; i++){
            currentMax=Math.max(arr[i],currentMax+arr[i]);
            max=Math.max(max,currentMax);
        }

        return max;
    }
}
