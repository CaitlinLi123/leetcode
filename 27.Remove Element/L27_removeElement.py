class Solution:
    def remove_element(self,nums:List[int],val:int)->int:
        p1,p2 = 0,0 # double pointers
        while p2 < len(nums):
            #get the valid element to the front
            if nums[p2] != val:
                nums[p1],nums[p2] = nums[p2],nums[p1]
                p1 += 1 # save to update the front pointer
            p2 += 1
        return p1
    
    #O(n),O(1)