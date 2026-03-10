public class arrayRotator {
    public void rotateArray(int[] arr,int k){
        if(arr==null||arr.length<=1){
            return;
        }

        int n=arr.length;
        k=k%n;

        reverseArr(arr, 0,n-1);
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
    }

    private void reverseArr(int[] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
