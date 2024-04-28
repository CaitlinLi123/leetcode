class Solution:
    def merge(self,nums1:List[int],m:int,nums2:List[int],n:int)->None:
        #merge the later n elements of nums1 to nums2
        nums1[m:] = nums2[:]
        #sort nums1
        nums1 = nums1.sort()
