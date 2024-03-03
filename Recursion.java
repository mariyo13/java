package manu.ll.recusion;

public class Recursion {
    public static void main(String[] args) {

      int []nums ={1,2,3,5,2,2,2,1,5,2,1,2};
      allOccurance(2,0,nums);
    }
    public static  void printNumber(int n){
        if(n == 0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
        return;
    }
    public static  int  factorialNumber(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*factorialNumber(n-1);
    }
    public static  int sumNaturalNumbar(int n){
        if(n == 0){
            return 0;
        }
        return n+sumNaturalNumbar(n-1);
    }
   public  static  boolean isSorted(int [] nums,int i){
        if(i<nums.length-1){
            return true;
        }
        if(nums[i]>nums[i+1]){
            return false;
        }
        return isSorted(nums,i+1);
   }
   public  static  int findFirstOccurance(int [] nums ,int i,int target){
        if(i==nums.length){
            return -1;
        }
        if(nums[i] == target){
            return i;
        }
        return findFirstOccurance(nums,i+1,target);}
    public  static  int lastOccurance(int [] nums ,int target ,int i){
        if (i<=0){
            return -1;
        }
        if(nums[i] ==target){
            return i;
        }
        return lastOccurance(nums ,target,i+1);
    }
    public static  int power(int num, int n){
        if(n == 0){
            return 1;
        }
        return num*power(num ,n-1);
    }
    public static  void allOccurance(int key,int i,int [] nums){
        if (i == nums.length){
            return;
        }
        if(nums[i] == key){
            System.out.println(i);
        }
        allOccurance(key,i+1,nums);
    }

}
