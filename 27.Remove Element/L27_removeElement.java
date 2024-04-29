public class L27_removeElement {
    public int removeElement(int[] nums, int val){
        int p1=0, p2 =0;
        int cur;
        while(p2 < nums.length){
            if(nums[p2] != val){
                cur = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = cur;
                p1 ++;
            }
            p2 ++;
        }
        return p1;
    }
}
