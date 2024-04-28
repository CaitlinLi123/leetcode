import java.util.Arrays;

class Solution{

//    O((m+n)log(m+n)), O(log(m+n))
    public void mergeNsort(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0; i != n; ++i){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println("nums1 after merge: "+nums1);
    }

//    O(m+n), O(1)
    public void tail_DoublePointers(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1, p2 = n -1, p3 = m+n-1;
        int cur;
        while(p1 >= 0 || p2 >= 0){
//            p1--
//            It returns the current value of p1.
//            After returning the current value, it decrements the value of p1 by one.

            if(p1==-1){
                cur = nums2[p2--];
            }
            else if(p2 == -1){
                cur = nums1[p1--];
            }
            else if(nums1[p1] >= nums2[p2]){
                cur = nums1[p1--];
            }else{
                cur = nums2[p2--];
            }
            nums1[p3--] = cur;
        }

        System.out.println("nums1 after tail double pointers: "+nums1);
    }
}

public class L88_mergeNsort{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums1 = {1,2,3,0,0,0}, nums2= {2,5,6};
        int m = 3, n = 3;
        s.mergeNsort(nums1, 3, nums2, 3);
        s.tail_DoublePointers(nums1,3,nums2,3);
    }
}

