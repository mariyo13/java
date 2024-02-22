public class Array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        System.out.print(binarySearch(nums,8));

    }
    public  static  boolean linearSearch(int [] nums ,int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
    public  static  int largestElement(int [] nums){
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(ans<nums[i]){
                ans=nums[i];
            }
        }
        return ans;
    }
    public  static  void reverseArray(int [] nums){
        int i=0;
        int j=nums.length-1;
        while (i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        printArray(nums);
        return ;
    }
    public  static  void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public  static  int binarySearch(int [] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+end;
            mid=mid/2;
            if(target<nums[mid]){
                end=mid-1;
            } else if (target >nums[mid]) {
                start=start+1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }
    //rotate right
    public static int[] rotateRight(int [] nums ,int n){
        for(int i=0; i<n; i++){
            int temp=nums[nums.length-1];
            for(int j=nums.length-1; j>0; j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
        return nums;
    }
    //rotate light
    public static int [] rotateLeft(int [] nums ,int n){
        for(int i=0; i<n; i++){
            int temp = nums[0];
            for(int j=0; j<nums.length-1; j++ ){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=temp;
        }
        return nums;
    }
    //to find  maximum in array
    public static int toFindMax(int[] nums){
        int ans=nums[0];
        for(int i=1 ; i<nums.length; i++){
            if(ans < nums[i]){
                ans=nums[i];
            }
        }
        return ans;
    }
    // to find the minimun value in array
    public static int toFindMin(int [] nums){
        int ans=nums[0];
        for(int i=1;i<nums.length; i++){
   if(ans>nums[i])
   {
    ans=nums[i];
   }
        }
        return ans;
    }
   // moving  all negative number
   public static int [] movingNegativeNumber(int [] nums){
   for(int i=0 ; i<nums.length-1; i++){
    for(int j=i+1; j<nums.length; j++){
        if(nums[j]<0 && i!= j){
         int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;   
        }

    }

   }
   return nums;
   }
}
