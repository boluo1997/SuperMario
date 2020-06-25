package cn;

//二分查找
public class Test37_binSearch {

    public static void main(String[] args) {
        int[] nums = {5,9,13,28,36,51,66,74,89,93,95,97};

        int result = binSearch(nums,0,nums.length-1,51);
        System.out.println(result);

        //非递归写法
        int key = 36;
        int min = 0;
        int max = nums.length-1;
        int mid = (min+max)/2;
        
        while(key != nums[mid]){
            if(key > nums[mid]){
                min = mid+1;
            }else {
                max = mid-1;
            }

            if(min >= key){
                mid = -1;
                break;
            }

            mid = (min+max)/2;
        }

        System.out.println(mid);


    }

    //递归写法
    public static int binSearch(int[] nums,int low,int high,int key){
        int mid = (low + high)/2;

        if(key == nums[mid]){
            return mid;
        }else if(key < nums[mid]){
            return binSearch(nums,low,mid-1,key);
        }else if(key > nums[mid]){
            return binSearch(nums,mid+1,high,key);
        }else {
            return -1;
        }
    }

}
