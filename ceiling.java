public class ceiling {
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
        public static void main(String[] args){
            int[] arr={1,2,3,4,5,6,7,9,10};
            int target=8;
            int ans=search(arr,target);
            System.out.println("The ceiling of the target is:" + arr[ans]);
    
        }
}
