package cn;

public class Test19_Array {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //从右向左遍历,指定三个坐标
        // max = m+n-1
        // p = m-1  nums1最后一个值
        // q = n-1  nums2最后一个值

        int max = m+n-1;
        int p = m-1;
        int q = n-1;

        while(p>=0 && q>=0){
            if(nums1[p] >= nums2[q]){
                nums1[max--] = nums1[p--];

            }else {
                nums1[max--] = nums2[q--];

            }
        }

        //到这里已经有一个数组遍历完了

        while(p >= 0){
            nums1[max--] = nums1[p--];
        }

        while(q >= 0){
            nums1[max--] = nums2[p--];
        }

    }

}
